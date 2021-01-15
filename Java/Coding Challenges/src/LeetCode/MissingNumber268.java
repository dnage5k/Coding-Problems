package LeetCode;
import java.util.*;

public class MissingNumber268 {

	public static void main(String[] args) {
		int[] nums = {0,2,1,4};
		System.out.println(bestMethod(nums));

	}
	
	// Method
	// Similar to disappeared nums to find which number is missing in the array
	// Created hashmap to store values of numbers in the array to check whats missing or not
	// Used another loop to check each iteration to see which is missing
	public static int hashMethod(int[] nums) {
		 Map<Integer,Integer> map = new HashMap<>();
	        for(int i : nums){
	            if(!map.containsKey(i)){
	                map.put(i,map.getOrDefault(i,0)+1);
	            }
	        }
	        
	        for(int i = 0; i <= nums.length;i++){
	            if(!map.containsKey(i)){
	                return i;
	            }
	        }
	        
	        return -1;
	    }
	
	// Method
	// I still dont completely understand somebody can get to this solution
	// I did the math and it works
	// The idea is we have to use bit manipulation to solve this problem
	// we first have to create a for loop to iterate through each item of the array
	// the index XOR with nums[i] then XOR with length of the array will give the missing value if there is one or
	// the length of the array.
	
	public static int bestMethod(int[] nums) {
		int n = nums.length;
		
		for(int i = 0; i < nums.length; i++) {
			n ^= (i^nums[i]);
		}
		
		return n;
	}
	
	
	// Method
	// To find the missing number, we know that the array nums will contain values from 0 to n
	// Where n is the length of the array
	// We can add all the values in the array and that will be the subtraction of to the sum of 0 to n
	// The subtraction of sum from 0 to n and the sum of the array will reveal the missing number
	// 
	public static int sumMethod(int[] nums) {
		int sum = 0;
		int num = 0;
		
		for(int i = 0; i < nums.length; i++) {
			sum += nums[i];
			num += (i+1);
		}
		
		return(num-sum);
	}


}
