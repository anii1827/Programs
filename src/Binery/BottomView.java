package Binery;

import java.util.ArrayList;


public class BottomView implements view {
 
	

	ArrayList<Integer> list;
	ArrayList<Integer> result;
	
	
	public BottomView(BineryTree tree) {
		list = new ArrayList<>();
		result = new ArrayList<>();
		function(tree.getRoot());
	}
	
	@Override
	public ArrayList<Integer> View() {
		return result;
	}
	
	public void function(Node node){
		if(node==null) {
			   return;
		   }
		   function(node.getLeft());
		   function(node.getRight());
		   if(node.getLeft()==null && node.getRight()==null) {
			   result.add(node.getData());
		   }
	}
}
