package dynamicprogramming;

public class MinCostClimbingStairs746 {

	public static void main(String[] args) {
		int[] arr = {10,15,20};
		int[] memo = new int[arr.length];
		System.out.println(Math.min(recursive(arr,arr.length-2), recursive(arr,arr.length-1)));
		System.out.println(Math.min(recursiveMemo(arr,arr.length-2, memo), recursiveMemo(arr,arr.length-1, memo)));

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

}
