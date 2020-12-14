package dynamicprogramming;

public class Robber198 {

	public static void main(String[] args) {
		int[] nums = {3,2,3,100};
		int[] memo = new int[nums.length];
		System.out.println(robMemoIth0Space(nums));

	}
	public static int rob(int[] nums) {
	    return rob(nums, nums.length - 1);
	}
	private static int rob(int[] nums, int i) {
	    if (i < 0) {
	        return 0;
	    }
	    return Math.max(rob(nums, i - 2) + nums[i], rob(nums, i - 1));
	}
	
	public static int robMemo(int[] nums, int[] memo, int i) {
		if(i < 0) {
			return 0;
		}else if(memo[i] != 0) {
			return memo[i];
		}
		int m = Math.max(robMemo(nums,memo,i-2) + nums[i], robMemo(nums,memo,i-1) );
		memo[i] = m;
		return m;
		
	}
	
	// Method
	// Memoization using bottom up method
	// given a base case that there are zero houses to steal from we set memo[0] to zero
	// we then iterate through nums from i since we inserted memo[1] = nums[0]
	// Compare the two values to see which is higher.
	// The one with with the previous answer added with the current num or the current memo of i
	// Keep going until you get the max number until then
	// return the final ith element of memo
	public static int robMemoIte(int[] nums) {
		if(nums.length == 0) {
			return 0;
		}
		int[] memo = new int[nums.length+1];
		memo[0] = 0;
		memo[1] = nums[0];
		
		for(int i = 1; i < nums.length; i++) {
			memo[i+1] = Math.max(memo[i-1] + nums[i], memo[i]);
		}
		return memo[nums.length];
		

	}
	
	public static int robMemoIth0Space(int[] nums) {
		if(nums.length == 0) {
			return 0;
		}else if(nums.length == 1) {
			return nums[1];
		}
		int prev = 0;
		int curr = nums[0];
		int max = 0;
		for(int i = 1; i < nums.length; i++) {
			max = Math.max(prev + nums[i], curr);
			prev = curr;
			curr = max;
		}
		return max;
	}
}

