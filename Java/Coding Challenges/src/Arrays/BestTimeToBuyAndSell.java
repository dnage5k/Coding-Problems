package Arrays;

public class BestTimeToBuyAndSell {

//	Say you have an array for which the ith element is the price of a given stock on day i.
//
//	If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock), design an algorithm to find the maximum profit.

//	Note that you cannot sell a stock before you buy one.
	public static void main(String[] args) {
		int[] ex1 = {7,1,5,3,6,4};
		int[] ex2 = {7,5,4,3,1};
		System.out.println(bestTime(ex1));
		System.out.println(bestTime(ex2));

	}
	
	public static int bestTime(int[] arr) {
		int profit = 0;
		// The purpose of this problem is to get the most profit where you buy on a day then sell at the peak
		// I could do the brute force method where I compare everything with each one
		// I want to use the O(n) solution to just iterate once
		// Space complexity is O(1)
		
		int lowest = 100000;
		for(int i = 0; i < arr.length; i++) {
			if(lowest > arr[i]) {
				lowest = arr[i];
			}else {
				if(arr[i] - lowest > profit) {
					profit = arr[i] - lowest;
				}
			}
		}
		return profit;
	}

}
