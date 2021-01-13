package LeetCode;
import java.util.*;

public class MissingNumber268 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
	
	public static int bestMethod(int[] nums) {
		for(int i = 0; i < nums.length; i++) {
			
		}
	}
	


}
