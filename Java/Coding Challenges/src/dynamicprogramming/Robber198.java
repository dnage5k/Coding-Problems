package dynamicprogramming;

public class Robber198 {

	public static void main(String[] args) {
		int[] nums = {1,2,3,1};
		System.out.println(rob(nums));

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
}
