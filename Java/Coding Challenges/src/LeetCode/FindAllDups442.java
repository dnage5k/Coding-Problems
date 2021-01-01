package LeetCode;
import java.util.*;
public class FindAllDups442 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
		
		for(int i : nums) {
			map.put(i, map.getOrDefault(i,0) +1);
		}
		
		for(int i: map.keySet()) {
			if(map.get(i) > 1) {
				ans.add(i);
			}
		}
		
		return ans;
	}

}
