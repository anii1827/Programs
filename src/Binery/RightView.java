package Binery;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Queue;

public class RightView implements view{

	Queue<NodeDetails> queue;
	Hashtable<Integer, Integer> table;
	ArrayList<Integer> list;
	public RightView(BineryTree tree) {
			table = new Hashtable<>();
			queue = new LinkedList<>();
			list = new ArrayList<>();
			queue.add(new NodeDetails(0, tree.getRoot()));
	}
	
	@Override
	public ArrayList<Integer> View() {
		while(!queue.isEmpty()) {
			NodeDetails node = queue.poll();
			if(!table.containsKey(node.HD)) {
				list.add(node.node.getData());
				table.put(node.HD, node.node.getData());
			}
			int hd = node.HD+1;
			if(node.node.getRight()!=null)queue.add(new NodeDetails(hd, node.node.getRight()));
			if(node.node.getLeft()!=null)queue.add(new NodeDetails(hd, node.node.getLeft()));
			
		}
		return list;
	}

}
