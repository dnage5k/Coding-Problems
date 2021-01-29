package amazonstuff;

public class CountTripletSumPermutations {

	public static void main(String[] args) {
		int size = 5;
		int[] arr = {1,3,5,8,11};
		int trip = 15;
		System.out.println(countTripletSumPermutations(size,arr,trip));

	}
	
	/* ORIGINAL
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
