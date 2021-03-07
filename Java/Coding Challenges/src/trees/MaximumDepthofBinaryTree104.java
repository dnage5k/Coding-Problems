package trees;
import datastructure.TreeNode;
public class MaximumDepthofBinaryTree104 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int maxDepth(TreeNode root) {
		if(root == null) {
			return 0;
		}
		
		int left = maxDepth(root.left);
		int right = maxDepth(root.right);
		
		return Math.max(left, right) + 1;
    }
	

}
