package dynamicprogramming;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fib1 = 2;
		int fib2 = 3;
		int fib3 = 4;
		
//		System.out.println(fib(fib1));
		System.out.println(fibM(fib2));
//		System.out.println(fib(fib3));
	}
	
	// Fib numbers
	// 0 1 1 2 3 5 8 13 21 34 ...
	public static int fib(int n) {
		if(n == 0) {
			return 0;
		}else if(n == 1) {
			return 1;
		}
		
		int[] arr = new int[n+1];
		arr[0] = 0; arr[1] = 1;
		
		for(int i = 2; i < n+1; i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}
		
		return arr[n];
	}
	
	public static int fibM(int n) {
		int[] memo = new int[n];
		if (n == 0) {
			return 0;
		}else if(n <= 2) {
			return 1;
		}else {
			memo[n] = fibM(n-1) + fibM(n-2);
			return memo[n];
		}
		
	}

}
