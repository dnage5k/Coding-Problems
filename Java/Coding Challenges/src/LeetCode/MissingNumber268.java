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
	// 
	public static int bestMethod(int[] nums) {
		int n = nums.length;
		
		for(int i = 0; i < nums.length; i++) {
			n ^= (i^nums[i]);
		}
		
		return n;
	}
	
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
