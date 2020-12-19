package dynamicprogramming;

public class MinCostClimbingStairs746 {

	public static void main(String[] args) {
		int[] arr = {10,15,20};
		int[] memo = new int[arr.length];
		System.out.println(Math.min(recursive(arr,arr.length-2), recursive(arr,arr.length-1)));
		System.out.println(Math.min(recursiveMemo(arr,arr.length-2, memo), recursiveMemo(arr,arr.length-1, memo)));
		System.out.println(iterativeMemo(arr));

	}
	
	public static int recursive(int[] cost, int i) {
		
		if(i < 0) {
			return 0;
		}else if(i == 1 || i == 0) {
			return cost[i];
		}
		
		return cost[i] + Math.min(recursive(cost, i-2), recursive(cost,i-1));
	}
	
	public static int recursiveMemo(int[] cost, int i, int[] memo) {
		if(i < 0) {
			return 0;
		}else if(i == 1 || i == 0) {
			return cost[i];
			
		}else if(memo[i] != 0) {
			return memo[i];
		}
		int a = cost[i] + Math.min(recursiveMemo(cost,i-2,memo), recursiveMemo(cost,i-1,memo));
		memo[i] = a;
		return a;
	}
	
	public static int iterativeMemo(int[] cost) {
		int[] memo = new int[cost.length];
		if(cost.length == 2) {
			return Math.min(cost[0], cost[1]);
		}
		
		memo[0] = cost[0];
		memo[1] = cost[1];
		for(int i = 2; i <cost.length; i++ ) {
			int a = cost[i] + Math.min(memo[i-2], memo[i-1]);
			memo[i] = a;
		}
		return Math.min(memo[cost.length-1], memo[cost.length-2]);
		
	}

}
