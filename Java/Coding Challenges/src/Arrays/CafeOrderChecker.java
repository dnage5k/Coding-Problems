package Arrays;

public class CafeOrderChecker {

	public static void main(String[] args) {
		int[] takeOut = {1,3,5};
		int[] dineIn = {2,4,6};
		int[] servedOrders = {1,2,4,6,5,3};
		
		int[] TakeOutOrders =  {17, 8, 24};
		int[] DineInOrders = {12, 19, 2};
		int[] ServedOrders = {17, 8, 12, 19, 24, 2};
	  
		System.out.println(orderChecker(TakeOutOrders, DineInOrders, ServedOrders));
		System.out.println(orderChecker(takeOut, dineIn, servedOrders));
	}
	
	public static boolean orderChecker(int[] takeOut, int[] dineIn, int[] servedOrders) {
		// The purpose of this problem is to see if the served orders are in orders so it must be boolean
		// the served orders must in the same order as takeout and dineIn. it doesnt matter which finish first
		// but the order has to be the same as takeout and dineIn
		
		// Method
		// I woulcat d do a for loop on served Orders so the runtime would be the length of servedOrders O(servedOrders.length)
		// Check every loop to see if it matches either dineIn or takeOut
		// if one of them doesnt equal to one or the other then return false else return true
		int takeOutP = 0;
		int dineInP = 0;
		for(int i = 0; i < servedOrders.length; i++) {
			boolean takeOutEmpty = takeOutP < takeOut.length;
			boolean dineInEmpty = dineInP < dineIn.length;
			
			if(takeOutEmpty && takeOut[takeOutP] == servedOrders[i]) {
				takeOutP++;
			}else if(dineInEmpty && dineIn[dineInP] == servedOrders[i]) {
				dineInP++;
			}else {
				return false;
			}
			
		}
		return true;
	}

}
