package Binery;

public class LowestCommonAncester {
	int X, Y;
	public Node find(Node node, int x, int y){
			this.X=x;
			this.Y=y;
			return traverse(node);
	}
	
	public Node traverse(Node node) {
			if(node==null) {
				return null;
			}
			if(node.getData()==X || node.getData()==Y) return node;
			node.setLeft(node.getLeft()!=null?traverse(node.getLeft()):null);
			node.setRight(node.getRight()!=null?traverse(node.getRight()):null); 
			if(node.getLeft()!=null && node.getRight()!=null) return node;
			else if(node.getLeft()==null && node.getRight()==null) return null;
			
			return node.getLeft()!=null?node.getLeft():node.getRight();
	}
}
