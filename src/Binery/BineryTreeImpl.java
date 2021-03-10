package Binery;

import java.util.List;

public class BineryTreeImpl implements BineryTree {
	Node root;
	@Override
	public void add(int t) {
		if(root==null) {
			root = new Node(t);
		}else {
			Node current = root;
			while(true) {
				if(current.getData()>=t) {
					if(current.getLeft()==null) {
						setNode(current,t,true);
						break;
					}
					else current=current.getLeft();
					
				}
				else {
					if(current.getRight()==null) {
						setNode(current, t, false);
						break;
					}
					else current=current.getRight();
			}
		}
	
	}

}

	@Override
	public void remove(int t) {
			delete(root, t);
	}

	
	private Node delete(Node node, int t) {
			if(node==null) {
				return null;
			}
			if(t>node.getData()) {
				node.setRight(delete(node.getRight(),t));
			}
			else if(t<node.getData()){
				node.setLeft(delete(node.getLeft(), t));
			}
			else {
			if(node.getLeft()!=null && node.getRight()!=null) {
				Node max = getPreSuccessor(node.getLeft());
				node.setData(max.getData());
				delete(node.getLeft(), max.getData());
				return node;
			}
			else if(node.getLeft()!=null) {
				return node.getLeft();
			}
			else if(node.getRight()!=null) {
				return node.getRight();
			}
			else {
				return null;
			}
			}
			
			return node;		
	}

	public Node getPreSuccessor(Node node){
			if(node.getRight()==null) {
				return node;
			}
			else {
				return getPreSuccessor(node.getRight());
			}
	}
	public void setNode(Node current, int t, boolean left) {
		Node n = new Node(t);
		if(left) current.setLeft(n);
		else current.setRight(n);
	}

	@Override
	public Node search(int t) {
			Node current = root;
			while(current!=null) {
				if(current.getData()==t) {
					return current;
				}
				else if(current.getData()>t) {
					current = current.getLeft();
				}
				else {
					current = current.getRight();
				}
			}
			return null;
		
	}


	@Override
	public Node getRoot() {
		return root;
	}

}
