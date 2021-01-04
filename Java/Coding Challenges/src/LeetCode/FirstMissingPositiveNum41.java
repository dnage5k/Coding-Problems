package LeetCode;
import java.util.*;
public class FirstMissingPositiveNum41 {

	// Purpose
	// The purpose of this problem was to find the missing smallest positive integer given in the array
	// ex. Given an array[1,2,7,5] what is the missing array number
	// The smallest missing positive integer in this array would be 3 in this case because it is the smallest missing one
	// if all numbers are filled then the missing number would be next nums.length + 1
	
	public static void main(String[] args) {
		int[] nums = {3,1};
		System.out.println(bestMethod(nums));

	}
	
	// Method
	// Create a hashmap to store all values in the array as keys
	// another for loop to see if i+1 is in the map, if its not then return the that number that is missing
	// if its all in there then return nums.length+1
	public static int hashMapMethod(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		for(int i : nums) {
			if(!map.containsKey(i)) {
				map.put(i, map.getOrDefault(i, 0) +1);
			}
		}
		
		for(int i = 0; i < nums.length; i++) {
			if (!map.containsKey(i+1)){
				return i+1;
			}
		}
		
		return nums.length+1;
	}
	
	
	// Method
	// In order to figure out which is the smallest positive number missing in the array given from 1 to n
	// We could sort the array in place since we know that numbers that are or would be missing is in the range of 1 to the length of the array
	// use a while loop to iterate through the whole array
	// In the loop, if the number at the current index is below 1 or higher than the length of the array, increment i
	// if it passes then check if the the number at the current index matches i+1(Since it starts at 0)
	// if it doesnt then check if the number that its supposed to swap place with is at its correct position already.
	// if it is then increment, else do the switching method to place it accordingly to where its supposed to be
	// This should sort the array accordingly and return the smallest positive number if its missing
	// return array length +1 if its all there.
	public static int bestMethod(int[] nums) {
		int i = 0;
		while(i < nums.length) {
			if(1 <= nums[i] && nums[i]<= nums.length) {
				if(nums[i] != i+1) {
					if(nums[i] == nums[nums[i]-1]){
                        i++;
                    }else{
					int temp = nums[nums[i]-1];
					nums[nums[i]-1] = nums[i];
					nums[i] = temp;
                    }

				}else {
					i++;
				}
			}else {
				i++;
			}
		}
		
		for(int j = 0; j < nums.length; j++){
            if(j+1 != nums[j]){
                return j+1;
            }
        }
		System.out.println(Arrays.toString(nums));
		
		return nums.length + 1;
	}

}
