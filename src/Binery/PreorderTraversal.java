package Binery;

import java.util.ArrayList;
import java.util.Stack;

public class PreorderTraversal implements Traversal{

	Node root;
	ArrayList<Integer> list = new ArrayList<>();
	Stack<Node> stack = new Stack<Node>();
	public PreorderTraversal(BineryTree tree) {
		this.root = tree.getRoot();
		function(root);
	}
	
	
	
	public void function(Node node){
		if(node==null) {
			   return;
		   }
		   list.add(node.getData());
		   function(node.getLeft());
		   function(node.getRight());
	}



	@Override
	public ArrayList<Integer> traverse() {
		return list;
	}


}
