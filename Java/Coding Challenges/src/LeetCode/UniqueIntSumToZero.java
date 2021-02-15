package LeetCode;
import java.util.*;
public class UniqueIntSumToZero {

//	 Purpose
//	 The purpose of this problem is to return an array given size n that sums to
//   zero when added together
	public static void main(String[] args) {
		int n = 5;
		System.out.println(Arrays.toString(solution(n)));

	}
	
	 /*Method
	 create an array with size n
	 create two variables i (the index of the array so we could increment) and num (the number we increment and insert into the array)
	 check to see if n is an odd or even, if its odd then let i = 1 and decrement n else let i = 0
	 
	 loop through the whole array until n is equal to zero while inserting the variable num into each
	 index and incrementing everytime.
	*/
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
