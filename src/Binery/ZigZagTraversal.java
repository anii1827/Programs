package Binery;

import java.util.ArrayList;
import java.util.Stack;

//the main login behind this is stack and one flag which track last order start point whether its left or right.
//and the second point is two stack which help us to track the current upcoming node details

public class ZigZagTraversal implements Traversal{

	static Stack<Node> current, next;
	static ArrayList<Integer> list;
	boolean right=true; 
	//initializing the variable
	public ZigZagTraversal(BineryTree tree) {
		current = new Stack<>();
		next = new Stack<>();
		list = new ArrayList<>();
		//push the root node in current stack;
		current.push(tree.getRoot());
	}
	
	//just iterating the current node until it gets empty and push the left and right node into the next stack.
	//for pushing the node into next stack one boolean flag required which help to track the direction(left or right)  
	//once the current stack is empty will replace the current stack with next stack. 
	@Override
	public ArrayList<Integer> traverse() {
		while(!current.isEmpty()) {
			Node node = current.pop();
			list.add(node.getData());
			if(right) {
			if(node.getLeft()!=null)next.push(node.getLeft());
			if(node.getRight()!=null)next.push(node.getRight());
			}
			else {
				if(node.getRight()!=null)next.push(node.getRight());
				if(node.getLeft()!=null)next.push(node.getLeft());

			}
			if(current.isEmpty()) {
				right=!right;
				current=next;
				next=new Stack<>();
			}
		}
		return list;
	}
	
	
}
