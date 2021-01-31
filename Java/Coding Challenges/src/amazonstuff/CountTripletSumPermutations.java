package amazonstuff;

public class CountTripletSumPermutations {

	public static void main(String[] args) {
		int size = 5;
		int[] arr = {1,3,5,8,11};
		int trip = 15;
		System.out.println(countTripletSumPermutations(size,arr,trip));

	}
	
	/* ORIGINAL
	 * 
	 * Purpose:
	 * The purpose of this problem is find how many times given the target sum appears with the product of 3 numbers in the array
	 * 
	 * Original Code:
	 * The code consist of 3 for loops
	 * The first for loops goes from i = 0 to size -2 where size is the size of the array
	 * if target sum is a multiplier of the ith index of the array then we move onto the 2nd loop
	 * The 2nd for loop goes from j = to size -1
	 * if the target multiplier of the ith and jth index is equal to zero then we move on
	 * set value equal to the division of target and multiplication of ith and jth index of the array
	 * last loop finds the kth index of the array if it matches value since its the last multiplier to equate to the target
	 * 
	 * Debugging the code:
	 * the problem starts off by looking at the jth index of the 2nd loop.
	 * Immediately we know that it shouldnt be zero because it doesnt make sense to check the same index twice so we would need to
	 * set it to j = i+1
	 * 
	 * public int countTripletSumPermutations(int size, int[] arr, int tripletSum)
    {
        int count = 0;
        for(int i = 0; i < size - 2; i++)
        {
            if(tripletSum % arr[i] == 0)
            {
                for(int j = 0; j < size - 1; j++)
                {
                    if(tripletSum % (arr[i] * arr[j]) == 0)
                    {
                        int value = tripletSum / (arr[i] * arr[j]);
                        for(int k = j + 1; k < size; k++)
                            if(arr[k] == value)
                                count++;
                    }
                }
            }

        }
        return count;
    }
	 */
	public static int countTripletSumPermutations(int size, int[] arr, int tripletSum)
    {
        int count = 0;
        for(int i = 0; i < size - 2; i++)
        {
            if(tripletSum % arr[i] == 0)
            {
                for(int j = i+1; j < size - 1; j++)
                {
                    if(tripletSum % (arr[i] * arr[j]) == 0)
                    {
                        int value = tripletSum / (arr[i] * arr[j]);
                        for(int k = j + 1; k < size; k++)
                            if(arr[k] == value)
                                count++;
                    }
                }
            }

        }
        return count;
    }

}
