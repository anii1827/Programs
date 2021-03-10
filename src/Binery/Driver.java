package Binery;

public class Driver {
	static Traversal traverse;
		public static void main(String [] args) {
			BineryTree tree = new BineryTreeImpl();
			tree.add(10);
			tree.add(6);
			tree.add(15);
			tree.add(4);
			tree.add(5);
			tree.add(3);
			tree.add(8);
			tree.add(7);
			tree.add(9);
			tree.add(13);
			tree.add(12);
			tree.add(11);
			tree.add(14);
			tree.add(18);
			tree.add(17);
			tree.add(19);
//			traverse = new InorderTraversal(tree);
//			System.out.println("Inorder Traversal");
//			traverse.traverse().stream().forEach(T-> System.out.print(T+" "));
//			System.out.println();
//			
//			System.out.println("Preorder Traversal");
//			traverse = new PreorderTraversal(tree);
//			traverse.traverse().stream().forEach(T-> System.out.print(T+" "));
//			System.out.println();
//			
//			System.out.println("Postorder Traversal");
//			traverse = new PostOrderTraversal(tree);
//			traverse.traverse().stream().forEach(T-> System.out.print(T+" "));
//			
//			System.out.println();
//			System.out.println("Level Traversal");
//			traverse = new LeverOrderTraversal(tree);
//			traverse.traverse().stream().forEach(T-> System.out.print(T+" "));
//			System.out.println();
			traverse = new VerticalOrderTraversal(tree);
			traverse.traverse();
//			System.out.println("after remove element 15 from queue.");
//			tree.remove(15);
//			System.out.println();
//			System.out.println("Inorder Traversal ");
//			traverse = new InorderTraversal(tree);
//			traverse.traverse().stream().forEach(T-> System.out.print(T+" "));
//			System.out.println();
//			System.out.println("Preorder Traversal");
//			traverse = new PreorderTraversal(tree);
//			traverse.traverse().stream().forEach(T-> System.out.print(T+" "));
//			System.out.println();
//			
//			System.out.println("Postorder Traversal");
//			traverse = new PostOrderTraversal(tree);
//			traverse.traverse().stream().forEach(T-> System.out.print(T+" "));
//			
//			System.out.println();
//			System.out.println("Level Traversal");
//			traverse = new LeverOrderTraversal(tree);
//			traverse.traverse().stream().forEach(T-> System.out.print(T+" "));
			
		}
}
