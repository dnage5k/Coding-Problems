package LeetCode;
import java.util.*;
import java.util.Arrays;

public class MinSizeSubarray209 {
/*
 * 
 * 

Given an array of n positive integers and a positive integer s, find the minimal length of a contiguous subarray of which the sum ≥ s. 
If there isn't one, return 0 instead.

Example: 

Input: s = 7, nums = [2,3,1,2,4,3]
Output: 2
Explanation: the subarray [4,3] has the minimal length under the problem constraint.

Follow up:
If you have figured out the O(n) solution, try coding another solution of which the time complexity is O(n log n). 
 */
	public static void main(String[] args) {
		int s = 11;
		int nums[] = {1,2,3,4,5};
		System.out.println(twoPointer(s,nums));
		System.out.println(twoPointer(s,nums));
	}
	/*
	 * The long method takes O(n^2) time with O(1) space
	 * first loop iterates each index starting at the 0 index of the array and is the starting part of the of the 2nd loop
	 * The 2nd loop iterates through the loop to see if the combination of the array is greater than s
	 * if it is then we compare previous minimum with the new  min found and take the lowest of the two
	 * Returns the lowest one
	 */
	public static int longMethod(int s, int[] nums) {
		int min = Integer.MAX_VALUE;
		
		
		for(int i = 0; i < nums.length; i++) {
			int sum = 0;
			
			for(int j = i; j < nums.length; j++) {
				sum += nums[j];

				if(sum >= s) {
					min = Math.min(min, j - i + 1);
					break;
				}
			}
		}
		if(min == Integer.MAX_VALUE) {
			return 0;
		}else{
			return min;
		}
	}
	
	public static int OnlgnMethod(int s, int[] nums) {
		Arrays.sort(nums);
		int count = 0;
		return count;
		
	}
	
	/*
	 * Takes O(n) time and O(1) space complexity
	 * The two pointer method uses to variables that points at the array at two different locations
	 * The first pointer will point at the beginning while the 2nd pointer will point one ahead
	 * In this case they are set to the same value
	 * p0 and p1 are 1 because grabbing the last value would be impossible
	 * use a while loop until both pointers has reach to the end of nums.length
	 * if the sum is less than the target and the 2nd pointer is less than the length of the array 
	 * then we will increment 2nd pointer and add it to the sum
	 * else check to see if sum is greater than or equal to s, if it is take the min of the original min and p1-p0+1
	 * 
	 * return 
	 */
	public static int twoPointer(int s, int[] nums) {
		// Input: s = 7, nums = [2,3,1,2,4,3]
		// {1,2,3,4,5};
		if(nums.length == 0) {
			return 0;
		}
		int p0 = 1;
		int p1 = 1;
		int min = Integer.MAX_VALUE;
		int sum = nums[0];
		while(p1 < nums.length || p0 < nums.length) {
			if(sum < s && p1 < nums.length) {
				p1++;
				sum += nums[p1-1];
				
			}else{
				if(sum >= s) {
					min = Math.min(min, p1 - p0 + 1);
				}
				sum -= nums[p0-1];  
				p0++;
			}
			
		}
		
		if(min == Integer.MAX_VALUE) {
			return 0;
		}else {
			return min;
		}
	}

}
