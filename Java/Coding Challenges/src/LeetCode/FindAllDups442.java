package LeetCode;
import java.util.*;
public class FindAllDups442 {
	// Purpose
	// The purpose of this problem is to find any duplicates in the array and output it with a list.
	// Constraints are  1 <= a[i] <= n where n is the size of the array.
	// a[i] is the number between 1 and n inclusively

	public static void main(String[] args) {
		int[] nums = {4,1,2,3,2};
		System.out.println(bestMethod(nums));

	}
	
	// Method
	// This is the O(n^2) method
	// First loop goes through i and checks with each number in nums to see if theres a dup
	// the second loops checks the the number stored in the variable to see if theres a dup.
	// if the theres a dup then add it to the list
	
	public static List<Integer> longMethod(int[] nums){
		List<Integer> ans = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            int checker = nums[i];
            for(int j = i+1; j < nums.length; j++){
                if(checker == nums[j]){
                    ans.add(checker);
                    break;
                }
            }
        }
        return ans;
	}
	
	// Method 
	// Create a hashmap to store nums values in
	// If the num value exist already then you add it to the list
	public static List<Integer> mapMethod(int[] nums){
		Map<Integer, Integer> map = new HashMap<>();
		List<Integer> ans = new ArrayList<>();
		
		for(int i: nums){
            if(map.containsKey(i)){
                ans.add(i);
            }else{
                map.put(i, 1);
            }
        }
		
		
		
		return ans;
	}
	
	// Method
	// Iterate through the whole loop of nums
	// We will be changing numbers in nums to negative to see if that number has been encountered before
	// The idea is that if a number has already been changed to negative number then we would know that current nums number occurred twice already
	// The method to do this is
	// Check to see if the absolute value of the current number minus 1 is less than 0
	// if it is that means the number has beeen encountered already and you add the absolute value of that number
	// else you would change that number at that index to negative
	
	public static List<Integer> bestMethod(int[] nums){
		List<Integer> ans = new ArrayList<>();
		for(int i: nums) {
			if(nums[Math.abs(i) - 1] < 0) {
				ans.add(Math.abs(i));
			}else {
				nums[Math.abs(i)-1] *= -1;
			}
		}
		return ans;
	}

}
