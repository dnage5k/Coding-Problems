package dynamicprogramming;

public class MaximumSubArray53 {
static int max;
	public static void main(String[] args) {
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		int[] nums2 = {1,2,3,4};
		int[] memo = new int[nums.length];
//		System.out.println(longMethod(nums));
//		System.out.println(recursion(nums, 0) + " " + max);
//		System.out.println(memo(nums, 0, memo) + " max: " + max);
		System.out.println(memoIterative(nums));
		System.out.println(iterative(nums));

	}
	
	public static int longMethod(int[] nums) {
		int max = Integer.MIN_VALUE;
		
		if(nums.length == 1) {
			return nums[0];
		}
		
		for(int i = 0; i < nums.length; i++) {
			int sum = 0;
			for(int j = i; j < nums.length; j++) {
				sum += nums[j];
				if(max < sum) {
					max = sum;
				}
				
			}
		}
		return max;
	}
	
	// Recursion method
	// Need a global variable to keep track of the max as it seems there is no way to return the max value through the helper function.
	public static int recursion(int[] nums, int i) {
		if(i > nums.length-1) {
			return 0;
		}
		int a = nums[i];
		int b = nums[i] + recursion(nums, i+ 1);
		int curr = Math.max(a,b);
		max = Math.max(max, curr);
		return curr;
		
	}
	
	public static int memo(int[] nums, int i, int[] memo) {
		if(i > nums.length-1) {
			return 0;
		}
		if(memo[i] != 0) {
			return memo[i];
		}
		
		int curr = Math.max(nums[i], nums[i] + memo(nums, i+1, memo));
		memo[i] = curr;
		max = Math.max(curr, max);
		return curr;
		
	}
	
	public static int memoIterative(int[] nums) {
		if(nums.length == 1) {
			return nums[0];
		}
		int memo[] = new int[nums.length];
		int max = Integer.MIN_VALUE;
		memo[0] = nums[0];
        // Takes the max of the first one and the first plus the second one if the array length is only two.
		max = Math.max(nums[0], nums[0] + nums[1]);
		
		for(int i = 1; i < nums.length; i++) {
			int curr = Math.max(nums[i], memo[i-1] + nums[i]);
			memo[i] = curr;
			max = Math.max(curr, max);
		}
		
		return max;
	}
	
	public static int iterative(int[] nums) {
		if(nums.length == 1) {
			return nums[0];
		}
		int prev = nums[0];
		int max = Math.max(nums[0], nums[1] + nums[1]);
		
		for(int i = 1; i < nums.length; i++) {
			int curr = Math.max(nums[i], nums[i] + prev);
			max = Math.max(curr, max);
			prev = curr;
		}
		
		return max;
	}
	
	// Method
	// The Maximum Subarray problem output will be highest possible value based on the sum of the array
	// We will use kadane's method
	// This method will iterate through the loop and take maximum of both value of the current index and the current index plus the previous one
	// This way, we can either continuing the array or choose the current one as the best subarray
	// We then compare that to the max and always take the new best value.
	public static int bestMethod(int[] nums) {
		int prev = nums[0];
		int max = nums[0];
		
		for(int i = 1; i < nums.length; i++) {
			prev = Math.max(nums[i], prev + nums[i]);
			Math.max(max, prev);
		}
		
		return max;
	}
}
