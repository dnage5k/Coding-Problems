package GreedyAlgo;
import java.util.Arrays;
public class ProductOfItself {
//	You have an array of integers, and for each index you want to find the product of every integer except the integer at that index.
//
//	Write a method getProductsOfAllIntsExceptAtIndex() that takes an array of integers and returns an array of the products.
//
//	For example, given:
//
//	  [1, 7, 3, 4]
//
//	Java
//	your method would return:
//
//	  [84, 12, 28, 21]
//
//	Java
//	by calculating:
//
//	  [7 * 3 * 4,  1 * 3 * 4,  1 * 7 * 4,  1 * 7 * 3]
//
//	Java
//	Here's the catch: You can't use division in your solution!
	
	// Purpose
	// Purpose of this problem is to find the product of each iteration of the whole array except itself
	
	// Method
	// The brute force way is to iterate through it n times nested with another iteration of n times except itself
	// O(n) method is to go from both side and multiple them
	// Iterate through the left side and find all the multiplication of it from left to right.
	// Iterate from the right side to left side and multiply both the left side to the right index of it
	// This way you will get both left and right side of the multiplication
	public static void main(String[] args) {
		int[] arr1 = {1,7,3,4};
		int[] arr2 = {0, 0, 0, 0, 0};
		int[] arr3 = {-8, -56, -14, -28};
		System.out.println(Arrays.toString(productArray(arr1)));
		System.out.println(Arrays.toString(productArray(arr2)));
		System.out.println(Arrays.toString(productArray(arr3)));

	}
	
	public static int[] productArray(int[] nums) {
		if( nums.length <= 1) {
			throw new IllegalArgumentException("array length is less than or equal to one");
		}
		int[] leftSide = new int[nums.length];
		
		int left = 1;
		for(int i = 0; i < nums.length; i++) {
			if(i > 0) {
				left = left*nums[i-1];
			}
			leftSide[i] = left;
		}
		int right = 1;
		for(int i = nums.length-1; i >= 0; i--) {
			if(i < nums.length-1) {
				right = right*nums[i+1];
			}
			leftSide[i] = right*leftSide[i];
		}
		
		return leftSide;
	}

}
