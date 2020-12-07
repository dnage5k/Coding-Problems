package LeetCode;

public class shuffleTheArray1440 {

	public static void main(String[] args) {
		int[] nums1 = {2,5,1,3,4,7};
		int[] nums2 = {1,2,3,4,4,3,2,1};
		int[] nums3 = {1,1,2,2};
		int n1 = 3;
		int n2 = 4;
		int n3 = 2;
	}
	public static int[] shuffle(int[] nums, int n) {
        // Purpose
        // Organize the problem to be pair with their expect a x1y1, x2y2 etc
        
        // Method
        // the array is organzied by x1y1x2y2 automatically.
        // To do this O(n) time we will run through the loops once by creating another array to hold the values
        // if i % 2 == 0 then thats the even number else its odd.
        // Grab values based off that and insert them iterating through i.
        
        if(n == 1){
            return nums;
        }
        int middleIncre = n;
        int leftIncre = 1;
        int[] newNums = new int[nums.length];
        newNums[0] = nums[0];
        
        for(int i = 1; i< nums.length; i++){
            if(i % 2 == 0){
                newNums[i] = nums[leftIncre++];
            }else{
                newNums[i] = nums[middleIncre++];
            }
        }
        return newNums;
    }
	
	//{2,5,1,3,4,7};
	
	// x1 x2 x3 x4 x5 y1 y2 y3 y4 y5
	public static int[] shuffleInPlace(int[] nums, int n) {
		if(n == 1) {
			return nums;
		}
		
		int middleIncre = n;
		int leftIncre = 1;
		int xTemp1 = 0;
		int xTemp2 = 0;
		for(int i = 1; i < nums.length - 1; i++) {
			
			if(i % 2 == 0) {
				xTemp1 = nums[i];
				nums[i] = xTemp2;
				xTemp2= xTemp1;
			}else {
				 xTemp2 = nums[i];
				nums[i] = nums[middleIncre++];
			}
		}
		return nums;
	}

}
