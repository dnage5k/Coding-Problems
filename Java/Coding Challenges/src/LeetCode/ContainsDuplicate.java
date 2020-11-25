package LeetCode;
import java.util.HashMap;
import java.util.Map;
public class ContainsDuplicate {
//	Given an array of integers, find if the array contains any duplicates.
//
//	Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
//
//	Example 1:
//
//	Input: [1,2,3,1]
//	Output: true
//	Example 2:
//
//	Input: [1,2,3,4]
//	Output: false
//	Example 3:
//
//	Input: [1,1,1,3,3,4,3,2,4,2]
//	Output: true
	
	// Purpose
	// The purpose of this problem is to output true if it contains a duplicate in the array and output false if every element is distinct.
	
	// Method
	// Create a hashmap and store in each iteration of nums.length
	// Store the array value as the key and the value as the amount of times it has appeared
	// check to see if that number has appeared more than once, if so return true.
	public static void main(String[] args) {
		int[] ex1 = {1,2,3,1};
		int[] ex2 = {1,2,3,4};
		int[] ex3 = {1,1,1,3,3,4,3,2,4,2};
		System.out.println(containsDup(ex1));
		System.out.println(containsDup(ex2));
		System.out.println(containsDup(ex3));

	}
	
	public static boolean containsDup(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < nums.length; i++) {
			if(!map.containsKey(nums[i])){
				map.put(nums[i], 1);
			}else {
				return true;
			}
		}
		return false;
	}

}
