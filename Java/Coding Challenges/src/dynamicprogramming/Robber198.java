package dynamicprogramming;

public class Robber198 {

	public static void main(String[] args) {
		int[] nums = {3,2,3,100};
		int[] memo = new int[nums.length];
		System.out.println(robMemoIte(nums));

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
		
//		// memo[0] = 0 is storing the base case if no houses was robbed.
//		if (nums.length == 0) return 0;
//	    int[] memo = new int[nums.length + 1];
//	    memo[0] = 0;
//	    memo[1] = nums[0];
//	    for (int i = 1; i < nums.length; i++) {
//	        int val = nums[i];
//	        memo[i+1] = Math.max(memo[i], memo[i-1] + val);
//	    }
//	    return memo[nums.length];
	}
}

