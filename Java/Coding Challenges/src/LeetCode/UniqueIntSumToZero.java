package LeetCode;
import java.util.*;
public class UniqueIntSumToZero {

	public static void main(String[] args) {
		int n = 5;
		System.out.println(Arrays.toString(solution(n)));

	}
	
	public static int[] solution(int n) {
		int[] arr = new int[n];
		int i;
		int num = 1;
		
		if(n % 2 != 0) {
			i = 1;
			n-=1;
		}else {
			i = 0;
			
		}
		
		while(n > 0) {
			arr[i++] = -num;
			arr[i++] = num;
			n-=2;
			num++;
		}
				
		
		return arr;
	}

}
