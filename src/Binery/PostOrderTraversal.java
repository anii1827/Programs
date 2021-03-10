package Binery;

import java.util.ArrayList;
import java.util.Stack;

public class PostOrderTraversal implements Traversal{

	Node root;
	ArrayList<Integer> list = new ArrayList<>();
	Stack<Node> stack = new Stack<Node>();
	public PostOrderTraversal(BineryTree tree) {
		this.root = tree.getRoot();
		function(root);
	}
	
	
	
	public void function(Node node){
		if(node==null) {
			   return;
		   }
		   function(node.getLeft());
		   function(node.getRight());
		   list.add(node.getData());
	}



	@Override
	public ArrayList<Integer> traverse() {
		return list;
	}


	

}
