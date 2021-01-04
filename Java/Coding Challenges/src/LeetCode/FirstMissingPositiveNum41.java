package LeetCode;
import java.util.*;
public class FirstMissingPositiveNum41 {

	// Purpose
	// The purpose of this problem w
	public static void main(String[] args) {
		

	}
	
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

}
