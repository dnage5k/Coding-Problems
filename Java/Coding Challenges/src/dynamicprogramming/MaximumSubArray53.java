package dynamicprogramming;

public class MaximumSubArray53 {

	public static void main(String[] args) {
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		int[] nums2 = {1,2,3,4};
		System.out.println(longMethod(nums2));

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
	
	public static int recursion(int[] nums, int max, int i) {
		if(i < 0) {
			return 0;
		}
		
		return max;
	}
}
