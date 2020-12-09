package hash;
import java.util.*;
public class minimumDistinctElements {

	public static void main(String[] args) {
		int[] arr = {4,3,1,1,3,3,2};
		int k = 3;
		int[] arr1 = {2,1,1,3,3,3};
		int k1 = 3;		
		System.out.println(distinctElement(arr1,k1));

	}
	
	// Method
	// I want to get rid of m elements in the array completely outputting only whats left in the array (distinct elements)
	// put the all the values in the array as key value pairs. value being the amount of times it appears
	// Use another for loop to iterate through the map to see which one is the lowest 
	// Use another loop to remove them from the map then return the size of the map
	public static int distinctElement(int[] arr, int k) {
		// {2,2,1,3,3,3}
		// m = 3

		Map<Integer, Integer> map = new HashMap<>();
		for(int i : arr) {
			map.put(i, map.getOrDefault(i, 0)+1);
		}
		List<Integer> list = new ArrayList<>(map.values());
		Collections.sort(list);
		int total = 0;
		for(Integer i : list) {
			k -= i;
			if(k < 0) {
				break;
			}else {
				total++;
			}
		}
		return map.size() - total;
		
		
	}

}
