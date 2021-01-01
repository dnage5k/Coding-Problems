package LeetCode;
import java.util.*;
public class FindingDisapperedNums448 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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

}
