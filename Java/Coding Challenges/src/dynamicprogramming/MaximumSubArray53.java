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
		System.out.println(maxSubArray(nums));
		

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
	
	 public static int maxSubArray(int[] nums) {
	        int prevOut = 0;
	        int currOut = 0;
	        // -2,1,-3,4,-1,2,1,-5,4
	        for(int i = 0; i < nums.length; i++) {
	            currOut = nums[i];
	            for(int j = nums.length -1; j > i; j--) {
	                currOut += nums[j];
	                if(currOut > prevOut) {
		                prevOut = currOut;
		            }
	            }
	            
	        }
	        return prevOut;
	    }
}
