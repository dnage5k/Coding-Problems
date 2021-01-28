package LeetCode;

public class BestTimeToBuyStocksII122 {

	public static void main(String[] args) {
		int[] input = {7,1,5,6,8,4};
		System.out.println(longMethod(input));
	}
	
	public static int maxProfit(int[] prices) {
		int max = 0;
		int minStock = Integer.MAX_VALUE;
		for(int i = 0; i < prices.length; i++) {
			if(minStock > prices[i]) {
				minStock = prices[i];
			}else {
				max = Math.max(max, prices[i] - minStock);
			}
			
		}
		
		return max;
	}
	
	// Method
	// This method from the forum I saw
	// I couldnt understand when to buy or sell but looking at the solution made me understand this was more of a greedy method
	// 
	public static int longMethod(int[] prices) {
		// int[] input = {7,1,5,3,6,4};
		int max = 0;
		int buy = 0;
		int sell = 0;
		int i = 0;
		while(i < prices.length-1) {
			while(i < prices.length-1 && prices[i+1] <= prices[i]) {
				i++;
			}
			buy = prices[i];
			while(i < prices.length-1 && prices[i+1] > prices[i]) {
				i++;
			}
			sell = prices[i];
			
			max += sell - buy;
		}
		
		return max;
	}

}
