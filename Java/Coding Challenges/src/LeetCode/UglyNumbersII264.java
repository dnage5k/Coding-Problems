package LeetCode;

public class UglyNumbersII264 {
	// Question
	
	//Write a program to find the n-th ugly number.
	//Ugly numbers are positive numbers whose prime factors only include 2, 3, 5. 
	
	public static void main(String[] args) {
		int n = 4;
		System.out.println(uglyNumber(4));

	}
	
	public static int uglyNumber(int n) {
		int count = 0;
		if(n == 1) {
			return 1;
		}
		
		int uglyNumber2 = 1;
		int temp = 0;

		
		for(int i = 1; i <= 1690; ) {
			if(i % 5 == 0) {
				i /= 5;
			}
			if(i % 3 == 0) {
				i /= 3;
			}
			if(i % 2 == 0) {
				i /= 2;
			}
			
			if(i == 1) {
				count++;
				i++;
				temp = i;
			}
			if(count == n) {
				break;
			}
				
				
		}
		
		return temp;
	}

}
