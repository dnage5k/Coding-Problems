package LeetCode;

public class HighestProductOfTwo {
//	1464. Maximum Product of Two Elements in an Array
//	Easy
//
//	280
//
//	69
//
//	Add to List
//
//	Share
//	Given the array of integers nums, you will choose two different indices i and j of that array. Return the maximum value of (nums[i]-1)*(nums[j]-1).
//	 
//
//	Example 1:
//
//	Input: nums = [3,4,5,2]
//	Output: 12 
//	Explanation: If you choose the indices i=1 and j=2 (indexed from 0), you will get the maximum value, that is, (nums[1]-1)*(nums[2]-1) = (4-1)*(5-1) = 3*4 = 12. 
//	Example 2:
//
//	Input: nums = [1,5,4,5]
//	Output: 16
//	Explanation: Choosing the indices i=1 and j=3 (indexed from 0), you will get the maximum value of (5-1)*(5-1) = 16.
//	Example 3:
//
//	Input: nums = [3,7]
//	Output: 12
	
	
	// Purpose
	// Return the highest product but each of the highest number must be subtracted by 1
	
	// Method
	// 
	public static void main(String[] args) {
		int[] nums1 = {3,4,5,2};
		int[] nums2 = {1,5,4,5};
		int[] nums3 = {3,7};

		System.out.println(highestProduct(nums1));
		System.out.println(highestProduct(nums2));
		System.out.println(highestProduct(nums3));
	
	}
	
	public static int highestProduct(int[] nums) {
		int highest1 = nums[0];
		int highest2 = nums[1];
		if(nums.length == 2) {
			return (highest1-1) * (highest2-1);
		}
		
		int high;
		for(int i = 2; i < nums.length; i++) {
			high = Math.min(highest1, highest2);
			if(high < nums[i]) {
				if(high == highest1) {
					highest1 = nums[i];
				}else {
					highest2 = nums[i];
				}
			}
		}
		
		return (highest1-1) * (highest2-1);
	}

}
