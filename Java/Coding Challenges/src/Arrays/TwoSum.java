package Arrays;
import java.util.Arrays;
import java.util.HashMap;
public class TwoSum {

	public static void main(String[] args) {
//				Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//
//				You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//				You can return the answer in any order.
//		Example 1:
//
//			Input: nums = [2,7,11,15], target = 9
//			Output: [0,1]
//			Output: Because nums[0] + nums[1] == 9, we return [0, 1].
		
//		Example 2:
//			Input: nums = [3,2,4], target = 6
//			Output: [1,2]
		
//		Example 3:
//
//			Input: nums = [3,3], target = 6
//			Output: [0,1]

		int input1[] = {2,7,11,15};
		int target1 = 9;
		int input2[] = {3,2,4};
		int target2 = 6;
		int input3[] = {3,3};
		int target3 = 6;
		System.out.println(Arrays.toString(twoSum(input1,target1)));
		System.out.println(Arrays.toString(twoSum(input2,target2)));
		System.out.println(Arrays.toString(twoSum(input3,target3)));
		
	}
	public static int[] twoSum(int[] arr, int target) {
		// I want to return the two indices that adds up to the target
		// Brute Force way would be looping twice the array to see every match
		// O(n) way is i would create a hashMap, store everything into the map then iterate through the array and compare it to the map
		// Create a complement value which is going to be the target minus the array value
		
		// A better way to do this is adding the values to the map as you iterate through the loop
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		
		
		for(int i = 0; i < arr.length; i++) {
			int complement = target - arr[i];
			if(map.containsKey(complement)) {
				return new int[]{map.get(complement), i};
			}else {
				map.put(arr[i], i);
			}
			
		}
		
		return new int[] {-1};
	}

}
