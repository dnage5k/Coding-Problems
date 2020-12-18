package dynamicprogramming;

public class MinCostClimbingStairs746 {

	public static void main(String[] args) {
		int[] arr = {10,15,20};
		System.out.println(Math.min(recursive(arr,arr.length-2), recursive(arr,arr.length-1)));

	}
	
	public static int recursive(int[] cost, int i) {
		
		if(i < 0) {
			return 0;
		}else if(i == 1 || i == 0) {
			return cost[i];
		}
		
		return cost[i] + Math.min(recursive(cost, i-2), recursive(cost,i-1));
	}

}
