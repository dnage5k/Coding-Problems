package dynamicprogramming;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fib1 = 2;
		int fib2 = 6;
		int fib3 = 4;
		int memo[] = new int[fib2+1];
		
//		System.out.println(fib(fib1));
		System.out.println(fibRecursive(fib2));
//		System.out.println(fib(fib3));
	}
	
	// Fib numbers
	// 0 1 1 2 3 5 8 13 21 34 ...
	
	public static int fibRecursive(int n) {
		if( n < 2) {
			return n;
		}
		int ans;
		return  ans = fibRecursive(n-1) + fibRecursive(n-2);
	}
	public static int fibIte1(int n) {
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
	
	public static int fibM(int n, int[] memo) {
		
		memo[0] = 0;
		memo[1] = 1;
		
		if(n < 2) {
			return n;
		}else if(memo[n] != 0) {
			return memo[n];
		}else {
			int f = fibM(n-1, memo) + fibM(n-2,memo);
			memo[n] = f;
			return f;
			
		}
		
	}
	
	public static int FibIte2(int n) {
		if(n < 2) {
			return n;
		}
		int curr = 1;
		int prev = 0;
		int max = 0;
		for(int i = 1; i < n; i++) {
			
			max = curr + prev;
			prev = curr;
			curr = max;
			
		}
		return max;
	}

}
