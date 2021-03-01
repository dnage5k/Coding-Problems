package LeetCode;

public class RemoveDups26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int removeDuplicates(int[] nums) {
        if(nums.length < 1){
            return 1;
        }
        
        int length = 0;
        
        int p0 = 0;
        
        
        for(int i = 1; i < nums.length; i++){
            if(nums[p0] == nums[i]){
                p0++;
            }else{
                
            }
        }
        
        return length;
    }

}
