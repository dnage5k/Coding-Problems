package LeetCode;

public class UglyNumbersII264 {
	// Question
	
	//Write a program to find the n-th ugly number.
	//Ugly numbers are positive numbers whose prime factors only include 2, 3, 5. 
	
	public static void main(String[] args) {
		int n = 1690;
		System.out.println(uglyNumber(n));

	}
	
	public static int uglyNumber(int n) {

		if(n == 1) {
			return 1;
		}
		
		int uglyNumber = 2;
		int count = 2;
		int i = 2;
		while(count <= n) {
			
			if(isUgly(i)) {
				uglyNumber = i;
				count++;
			}
			i++;
			
			
				
		}
		
		return uglyNumber;
	}
	
	public static boolean isUgly(int n) {
		
		while(n > 1) {
			int checker = n;
			if(n % 5 == 0) {
				n /= 5;
			}if(n % 3 == 0) {
				n /= 3;
			}if(n % 2 == 0) {
				n /= 2;
			}
			
			if(checker == n) {
				return false;
			}
			
		}
			
		return true;
	}

}
