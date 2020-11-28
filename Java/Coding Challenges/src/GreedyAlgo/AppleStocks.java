package GreedyAlgo;

public class AppleStocks {
//	Writing programming interview questions hasn't made me rich yet ... so I might give up and start trading Apple stocks all day instead.
//
//	First, I wanna know how much money I could have made yesterday if I'd been trading Apple stocks all day.
//
//	So I grabbed Apple's stock prices from yesterday and put them in an array called stockPrices, where:
//
//	The indices are the time (in minutes) past trade opening time, which was 9:30am local time.
//	The values are the price (in US dollars) of one share of Apple stock at that time.
//	So if the stock cost $500 at 10:30am, that means stockPrices[60] = 500.
//
//	Write an efficient method that takes stockPrices and returns the best profit I could have made from one purchase and one sale of one share of Apple stock yesterday.
//
//	For example:
//
//	  int[] stockPrices = new int[] {10, 7, 5, 8, 11, 9};
//
//	getMaxProfit(stockPrices);
//	// returns 6 (buying for $5 and selling for $11)
//
//	Java
//	No "shorting"—you need to buy before you can sell. Also, you can't buy and sell in the same time step—at least 1 minute has to pass.
	
	// Purpose
	// the purpose of this question is choose the best time to buy then sell for maximum profit
	
	// Method
	// Create two variables, profit (store the highest profit value based from buying and selling), Lowest (the lowest peak for a stock to buy in)
	// Create for loop to iterate through the stockprices
	// if lowest is greater than the ith iteration then replace lowest with ith iteration
	// else if the subtraction of lowest and Stock Price iteration is higher than the profit, replace profit with that subtraction
	// Iterate O(n) time to find the most profit you can get given the array.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] stkPrices1 = {10,7,5,8,11,9};
		int[] stkPrices2 = {1, 6, 7, 9};
		int[] stkPrices3 = {9, 7, 4, 1};
		int[] stkPrices4 = {5};
		
		System.out.println(getMaxProfit(stkPrices1));
		System.out.println(getMaxProfit(stkPrices2));
		System.out.println(getMaxProfit(stkPrices3));
		System.out.println(getMaxProfit(stkPrices4));
	}

	public static int getMaxProfit(int[] stockPrices) {
		int profit = -1000000;
		int lowest = stockPrices[0];
		if(stockPrices.length <= 1) {
			throw new IllegalArgumentException("requires at least 2 prices");
		}
		for(int i = 1; i < stockPrices.length; i++) {
			if(profit < stockPrices[i] - lowest){
				profit = stockPrices[i] - lowest;
			}
			if(stockPrices[i] < lowest) {
				lowest = stockPrices[i];
			}
		}
		return profit;
	}
}
