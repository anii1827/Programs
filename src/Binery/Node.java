package Binery;

public class Node {
		private Node Left,Right;
		private int Data;
		Node(int data){
			this.Data=data;
		}
		public Node getLeft() {
			return Left;
		}
		
		public Node getRight() {
			return Right;
		}
		public int getData() {
			return Data;
		}
		public void setLeft(Node left) {
			Left = left;
		}
		public void setRight(Node right) {
			Right = right;
		}
		public void setData(int data) {
			Data = data;
		}
	
		
}
