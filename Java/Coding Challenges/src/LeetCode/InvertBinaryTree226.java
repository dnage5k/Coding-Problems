package LeetCode;
import datastructure.TreeNode;
public class InvertBinaryTree226 {
	// Purpose
	// The purpose of this problem is to invert a binary tree
	// for example
	// invert the child nodes or leaf nodes from left to right and right to left
	
	public static void main(String[] args) {
		

	}
	
	// Method
	// Recursion method where if the root is equal to null then I return root
	// I switch root.left with root.right
	// Then I call the left and right side recursively to flip those positions
	public TreeNode invertTree(TreeNode root) {
		if(root == null) {
			return root;
		}
		
		TreeNode temp = root.left;
		root.left = root.right;
		root.right = temp;
		
		invertTree(root.left);
		invertTree(root.right);
		return root;
	}

}
