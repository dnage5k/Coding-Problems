package trees;
import datastructure.TreeNode;
import java.util.*;
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
	
	
	public static int dfs(TreeNode root) {
		if(root == null) {
			return 0;
		}
		Stack<TreeNode> stk = new Stack<>();
		stk.push(root);
		int max = 0;
	}
}
