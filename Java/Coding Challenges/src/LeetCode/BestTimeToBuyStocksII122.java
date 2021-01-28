package LeetCode;

public class BestTimeToBuyStocksII122 {

	public static void main(String[] args) {
		int[] input = {7,1,5,3,6,4};
		System.out.println(maxProfit(input));
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
	
	public static int longMethod(int[] prices) {
		int max = 0;
		int buy = 0;
		int sell = 0;
		int[] memo = new int[prices.length];
		int i = 0;
		while(i < prices.length) {
			while(buy > prices[i]) {
				i++;
			}
			buy = prices[i];
			while(i < prices.length) {
				i++;
			}
			sell = prices[i];
			
			
		}
		
		return max;
	}

}
