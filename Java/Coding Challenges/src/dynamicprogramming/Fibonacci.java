package dynamicprogramming;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fib1 = 2;
		int fib2 = 7;
		int fib3 = 4;
		
//		System.out.println(fib(fib1));
		System.out.println(fib(fib2));
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
		
		int[] arr = new int[n];
		arr[0] = 0; arr[1] = 1;
		
		for(int i = 2; i < n; i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}
		
		return arr[n-1];
	}

}