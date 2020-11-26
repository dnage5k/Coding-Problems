package LeetCode;
import java.util.Arrays;
public class ProductOfArrayExceptItself {
//	Given an array nums of n integers where n > 1,  return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].
//
//			Example:
//
//			Input:  [1,2,3,4]
//			Output: [24,12,8,6]
//			Constraint: It's guaranteed that the product of the elements of any prefix or suffix of the array (including the whole array) fits in a 32 bit integer.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {1,2,3,4};
		int[] inp1 = {1,0};
		
		
		
		System.out.println(Arrays.toString(selfProduct(input)));
		System.out.println(Arrays.toString(selfProduct(inp1)));
		
	}
	
	public static int[] selfProduct(int[] arr) {
		// method 
		// create a new arry to store the new answer
		// first for loop goes through the first number to multiply with
		// 2nd for loop goes through all numbers to mutiply with and stores the ans accordling to the first iteration i
		// return the answer
		int[] nums = new int[arr.length];
		int product = 0;
		for(int i = 0; i < arr.length; i++) {
//			product = (arr[i] == 0) ? 0: 1;
			product = 1;
			for(int j = 0; j < arr.length; j++) {
				if(i != j) {
					product *= arr[j];
				}
			}
			nums[i] = product;
		}
		
		return nums;
	}

}
