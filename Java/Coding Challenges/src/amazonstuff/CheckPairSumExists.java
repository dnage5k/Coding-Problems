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
	 * public boolean checkPairSumExists(int rows, int cols, int[][] arr, int sum) {
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
