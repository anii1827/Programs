package Binery;

public class InvertBinertTree {
		
		
		Node root;
		public InvertBinertTree(BineryTree tree) {
			this.root = tree.getRoot();
		}
		
		public Node invert() {
			return invertTheNode(root);
		}
		
		public Node invertTheNode(Node node) {
			if(node==null) {
				return node;
			}
			invertTheNode(node.getLeft());
			invertTheNode(node.getRight());
			Node temp=node.getLeft();
			node.setLeft(node.getRight());
			node.setRight(temp);
			return node;
		}
		
	
}
