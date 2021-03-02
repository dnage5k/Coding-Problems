package LeetCode;

public class RemoveDups26 {
	/*
	 * Purpose
	 * The purpose of this problem is to remove all duplications in the array by switching it with a new value if there is one
	 * 
	 */
	public static void main(String[] args) {
		int[] nums = {0,1,1,2,3,3,4,4,5};
		System.out.println(removeDuplicates(nums));

	}
	
	/*
	 * Method
	 * 
	 * We want to return the value if the length of the array is 1 or 0
	 * 
	 * if not then we can use the two pointer method
	 * we create p0 as the base pointer, only moving to swap with new numbers
	 * We iterate through the num array
	 * if the base index doesnt equal to current then we do a swap and increase base pointer by 1
	 */
	public static int removeDuplicates(int[] nums) {
        if(nums.length < 1){
            return 1;
        }
        int p0 = 0;
        
        
        for(int i = 1; i < nums.length; i++){
            if(nums[p0] != nums[i]){
            	nums[p0+1] = nums[i];
                p0++;

            }
        }
        
        return p0+1;
    }

}
