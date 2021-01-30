package amazonstuff;
import java.util.*;
public class CheckPairSumExists {

	public static void main(String[] args) {
		int rows = 2;
		int col = 3;
		int sum = 4;
		int[][] arr = {{1,2,3},{1,2,3}};
		System.out.println(checkPairSumExists(rows,col,arr,sum));

	}
	/* ORIGINAL
	 * The following function returns a boolean value representing if there is a pair with given sum exists in the array.
	 * 
	 * Purpose:
	 * The purpose of this problem is to find one pair that equates to the sum given by 2d array.
	 * 
	 * In the original code, there are two for loops that go over the whole array
	 * The first loop goes through each row and the 2nd loop goes through each column
	 * if The set contains the sum - arr[i][j] then we return true else we add it to the set
	 * When the whole loop ends it returns false
	 * 
	 * The problem with this code is that its returning true or false when its not that way
	 * 
	 * Solution to debug it:
	 * The reason why its outputting false when it should be true or vice versa is because it has something to do with whats contained in the set
	 * we would need to change what the set should be adding and what the number we should be checking in the if statement
	 * the if statement should be changed to set.contains(arr[i][j]) because we want to see if that value has the complement
	 * the add statement should be set.add(sum-arr[i][j]) because we want to see if the complement is there when we check each index
	 * 
	 * public boolean checkPairSumExists(int rows, int cols, int[][] arr, int sum) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                if(set.contains(sum - arr[i][j])) {
                    return true;
                } else{
                    set.add(sum);
                }
            }
        }
        return false;
    }
	 */
	public static boolean checkPairSumExists(int rows, int cols, int[][] arr, int sum) {
		Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                if(set.contains(arr[i][j])) {
                    return true;
                } else {
                    set.add(sum - arr[i][j]);
                }
            }
        }
        return false;
	}

}
