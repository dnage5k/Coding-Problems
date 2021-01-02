package LeetCode;
import java.util.*;
public class FindingDisapperedNums448 {

	public static void main(String[] args) {
		int nums[] = {4,3,2,7,8,2,3,1};
		System.out.println(bestMethod(nums));

	}
	
	// Method
	// Store all numbers in nums into a hashmap
	// 2nd loop checks to see if i is in the map
	// if its not then add it to the list.
	public static List<Integer> hashMapMethod(int[] nums){
		Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i,0) + 1);
        }
        
        for(int i = 1; i <= nums.length;i++){
            if(!map.containsKey(i)){
                list.add(i);
            }
        }
        
        return list;
	}
	
	// Method
	// Similar to the Find all dup problems method
	// loop through the original array and grab each index of nums[Math.abs(i) -1] to see if that number is negative or not
	// If it is not negative then change that number of that index to negative
	// The idea is that all the number visited will be negative while the ones arent visited are positive
	// The number(s) is/are positive when it doesnt appear since there were no number in that array to reach that index
	// if that number at that index is positive that means we add it to the list, the index and not the value of the index.
	public static List<Integer> bestMethod(int[] nums){
		 List<Integer> list = new ArrayList<>();
	        for(int i : nums){
	            if(nums[Math.abs(i)-1] > 0){
	                nums[Math.abs(i)-1] *= -1;
	            }
	        }
	        
	       
	        for(int i = 0; i <= nums.length-1;i++){
	            if(nums[i] > 0){
	                list.add(i+1);
	            }
	        }
	        return list;
	}

}
