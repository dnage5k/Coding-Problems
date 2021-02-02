package amazonstuff;

public class MinimumTotalContainerSize {

	public static void main(String[] args) {
		int[] container = {10,2,20,5,15,10,1};
		int days = 3;
		System.out.println(minTotalContainerSize(days, container));

	}
	
	// Method
	// Iterate through array p to find the highest P[i] value
	// But also checking to see how many days I can bring in one day
	// for example
	// check 10, store that as max container value if it is greater than current container value
	// and also compare i with amount of days im supposed to move items
	// if it is not higher then check how many days left compared with current i
	public static int minTotalContainerSize(int days, int[] container) {
		int min = 0;
		int containerSize = 0;
		int daysRemaining = 
		
		return min;
	}

}
