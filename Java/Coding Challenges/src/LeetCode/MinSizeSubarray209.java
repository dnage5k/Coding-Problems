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
		int s = 7;
		int nums[] = {2,3,1,2,4,3};
		System.out.println(longMethod(s,nums));
	}
	
	public static int longMethod(int s, int[] nums) {
		int min = Integer.MAX_VALUE;
		
		
		for(int i = 0; i < nums.length; i++) {
			int sum = 0;
			int count = 0;
			for(int j = i; j < nums.length; j++) {
				sum += nums[j];
				count++;
				if(sum >= s) {
					min = Math.min(min, count);
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
	
	public static int twoPointer(int s, int[] nums) {
		int p1 = 1;
		int min = Integer.MAXVALUE;
	}

}
