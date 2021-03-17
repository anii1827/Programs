package programs;

public class testing {
		public static void main(String [] args) {
			
		}
		
		
		public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
	        int max;
	        TreeNode temp = root1;
	        int count = 0;
	        while(true){
	            temp = temp.right;
	            if(temp.right==null){
	                break;
	            }
	            count++;
	        }
	        
	        System.out.println(count);
	        return null;
	}
}
 class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode() {}
	      TreeNode(int val) { this.val = val; }
	      TreeNode(int val, TreeNode left, TreeNode right) {
	          this.val = val;
	          this.left = left;
	          this.right = right;
	      }
	  }
