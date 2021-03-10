package Binery;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Queue;



public class LeverOrderTraversal implements Traversal {
	
	Node root;
	Queue<Node> queue;
	private int level=0;
	ArrayList<Integer> list;
	
	public LeverOrderTraversal(BineryTree tree) {
		this.root=tree.getRoot();
		queue = new LinkedList<>();
		queue.add(root);
		list = new ArrayList<>();
		
	}	
	
	@Override
	public ArrayList<Integer> traverse() {
		while(!queue.isEmpty()) {
			Node temp = queue.poll();
			list.add(temp.getData());
			if(temp.getLeft()!=null)queue.add(temp.getLeft());
			if(temp.getRight()!=null)queue.add(temp.getRight());
		}
		return list;
	}
	
	public void SetNodeLevel() {
		
	}

}
