package LeetCode;

public class BestTimeToBuyStocksII122 {

	public static void main(String[] args) {
		int[] input = {7,1,5,4,5,4};
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
	
	/* Method
	 This method from the forum I saw on leetcode. Time Complexity (O(n)) with space complextiy constant space.
	 I couldnt understand when to buy or sell but looking at the solution made me understand this was more of a greedy method
	 Greedy method because you take the lowest price and sell at the next highest one before the next low one
	 Have one big loop that ends when i (the pointer) reaches the end of the length - 1 since it doesnt matter about if you buy at the end
	 Within the loop, you will have two while loops
	 The first while loop buys the first stock, it checks to see if the current spot in the array is less than the next spot
	 if it is then we increment i so we can grab the that value as the buy one.
	 We keep incrementing until we hit the lowest buy
	 Set that variable to buy
	 The 2nd loop checks to see when to sell, It takes the highest number from the current index or the index after
	 Take the sum of the sum before and the subtraction of buy - sell
	 */
	
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
