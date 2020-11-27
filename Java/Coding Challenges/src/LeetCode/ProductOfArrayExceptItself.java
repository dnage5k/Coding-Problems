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
					if(arr[j] == 0) {
						product = 0;
					}else {
						product *= arr[j];
					}
				}
			}
			nums[i] = product;
		}
		
		return nums;
	}
	
	// the better solution
	// O(N) time complextiy with O(1) space.
	
	// Method
	// Create a left and right variable
	// Create a for loop to loop through the array starting from left to right
	// if i is greater than 0 then multiple left with the previous index in the array
	// insert the multiplication of left into the ans[i] at every iteration
	// The purpose of this is to get the multiples of the left side at the i-th iteration
	// We can multiply that with the right side giving us the product beside itself
	
	// Do the same with the right side starting on right side
	// Create a for loop and iterate downward of the array
	// if i < nums.length-1 then multiple the right with nums[i+1] (number previous of the iteration)
	// multiple the left side with the right side (ans[i] contains the left side)
	// This multiplication gives the answer because youre essentially multiplying the left side with the right side beside itself.
	public static int[] productExceptSelf(int[] nums) {
        int left = 1;
        int right = 1;
        
        int[] ans = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            if(i > 0){
                left = left * nums[i-1];
            }
            ans[i] = left;
        }
        System.out.println(Arrays.toString(ans));
        // left [1 1 2 6]
        // right [24 12 4 1]
        for(int i = nums.length-1; i >= 0; i--){
            if(i < nums.length-1){
                right = right * nums[i+1];
            }
            ans[i] *= right;
        }
        
        return ans;
        
    }

}
