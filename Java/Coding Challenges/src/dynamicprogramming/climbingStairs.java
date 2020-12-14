package dynamicprogramming;

public class climbingStairs {

	public static void main(String[] args) {
		int n = 10;
		int[] memo = new int[n+1];
		System.out.println(climbStairs(n));
		System.out.println(climbStairsRecur1(n));
		System.out.println(climbStairsRecur2(n, memo));
		System.out.println(climbStairsIte2(n));

	}
	
	public static int climbStairs(int n) {
		 if(n < 4){
	           return n;
	        } 
	        int[] cache = new int[n];
	        cache[0] = 1;
	        cache[1] = 2;
	        for(int i = 2; i < n; i++){
	            cache[i] = cache[i-1] + cache[i-2];
	        }
	        return cache[n-1];
	}
	
	public static int climbStairsRecur1(int n) {
		if(n < 4) {
			return n;
		}
		return climbStairsRecur1(n-1) + climbStairsRecur1(n-2);
	}
	
	public static int climbStairsRecur2(int n, int[] memo) {
		if(n < 4) {
			return n;
		}
		if(memo[n] != 0) {
			return memo[n];
		}else {
			int val = climbStairsRecur2(n-1,memo) + climbStairsRecur2(n-2,memo);
			memo[n] = val;
			return val;
		}
		
		
	}
	
	public static int climbStairsIte2(int n) {
		if(n < 4) {
			return n;
		}
		int curr = 3;
		int prev = 2;
		int max = 0;
		for(int i = 3; i < n; i++) {
			max = curr + prev;
			prev = curr;
			curr = max;
		}
		return max;
	}

}
