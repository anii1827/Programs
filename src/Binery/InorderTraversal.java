package Binery;

import java.util.ArrayList;
import java.util.Stack;

public class InorderTraversal implements Traversal {

	Node root;
	ArrayList<Integer> list = new ArrayList<>();
	Stack<Node> stack = new Stack<Node>();
	public InorderTraversal(BineryTree tree) {
		this.root = tree.getRoot();
		function(root);
	}
	
	public InorderTraversal(Node node) {
		this.root = node;
		function(root);
	}
	
	public void function(Node node){
		if(node==null) {
			   return;
		   }
		   function(node.getLeft());
		   list.add(node.getData());
		   function(node.getRight());
	}

	@Override
	public ArrayList<Integer> traverse() {
		return list;
	}

}
