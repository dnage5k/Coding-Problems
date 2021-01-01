package LeetCode;
import java.util.*;
public class FindAllDups442 {

	public static void main(String[] args) {
		int[] nums = {4,1,2,3,2};
		System.out.println(bestMethod(nums));

	}
	
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
