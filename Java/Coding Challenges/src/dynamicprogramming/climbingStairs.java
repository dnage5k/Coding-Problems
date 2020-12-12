package dynamicprogramming;

public class climbingStairs {

	public static void main(String[] args) {
		int n = 4;
		System.out.println(climbStairs(n));

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

}
