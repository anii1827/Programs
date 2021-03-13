package Binery;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Queue;

public class TopView implements view{

	Queue<NodeDetails> queue;
	ArrayList<Integer> list;
	Hashtable<Integer, Integer> table;
	
	//initialize the variable.
	public TopView(BineryTree tree) {
		queue = new LinkedList<>();
		list = new ArrayList<>();
		table = new Hashtable<>();
		queue.add(new NodeDetails(0, tree.getRoot()));
	}
	
	//traverser the vertical order provde the nodedetail to further process to check method
	@Override
	public ArrayList<Integer> View() {
		while(!queue.isEmpty()) {
			NodeDetails nodeDetails = queue.poll();
			check(nodeDetails);
			if(nodeDetails.node.getLeft()!=null)queue.add(new NodeDetails(nodeDetails.HD-1, nodeDetails.node.getLeft()));
			if(nodeDetails.node.getRight()!=null)queue.add(new NodeDetails(nodeDetails.HD+1, nodeDetails.node.getRight()));
		}
		return sort();
	}

	//for printing the node from left to right in sequence 
	private ArrayList<Integer> sort() {
		ArrayList<Integer> l = new ArrayList<Integer>(table.keySet());
		Collections.sort(l);
		for(Integer x : l) {
			list.add(table.get(x));
		}
		return list;
	}

	//main logic of the whole program track the unique HOrixontal distance in both left and right side
	//and push into the queue.
	private void check(NodeDetails nodeDetails) {
			if(!table.containsKey(nodeDetails.HD)) {
				table.put(nodeDetails.HD, nodeDetails.node.getData());
			}
	}
}


