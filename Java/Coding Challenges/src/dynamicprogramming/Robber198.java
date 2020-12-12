package dynamicprogramming;

public class Robber198 {

	public static void main(String[] args) {
		int[] nums = {3,2,3,100};
		int[] memo = new int[nums.length];
		System.out.println(robMemo(nums,memo, nums.length-1));

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
}
