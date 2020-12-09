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
	public static int distinctElement(int[] arr, int m) {
		// {2,2,1,3,3,3}
		// m = 3
		List<Integer> list = new ArrayList<>();
		int minNum = 0;
		int[] removeNums = new int[arr.length];
		int p = 0;
		Map<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < arr.length; i++) {
			if(!map.containsKey(arr[i])) {
				map.put(arr[i], 1);
				removeNums[p++] = arr[i];
				
			}else {
				map.put(arr[i], map.get(arr[i]) + 1);
			}
		}

		for(int i = 0; i < map.size(); i++) {
			list.add(map.get(removeNums[i]));
		}
		Collections.sort(list);
		int i = 0;
		while(m > 0) {
			list.set(i, list.get(i) - 1);
			if(list.get(i) == 0) {
				list.remove(i);
				i++;
			}
			m--;
		}
		return list.size();
		
		
	}

}
