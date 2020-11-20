package Arrays;

import java.util.Arrays;

public class MergeSorted {

	public static void main(String[] args) {
	  int[] myArray = new int[]{3, 4, 6, 10, 11, 15};
	  int[] alicesArray = new int[]{};
	  
	  System.out.println(Arrays.toString(mergeArrays(myArray, alicesArray)));
	}
	
	public static int[] mergeArrays(int[] array1, int[] array2) {
		// two arrays are given and we have to merge them in order
		// Create new array to store both of them so thats space complexity of O(n)
		// grab both numbers and compare them to see which is smaller
		// store the smaller to the new array
		// increment the one that has been taken away from
		// return once both are empty
		
		// Questions 
		// Will the given array lengths always be the same?
		// Are both arrays sorted already
		int[] mergeArray = new int[array1.length + array2.length];
		int array1Length = 0;
		int array2Length = 0;
		
		if(array1.length == 0) {
			return array1;
		}
		if(array2.length == 0) {
			return array2;
		}
		for(int i = 0; i < mergeArray.length; i++) {
			boolean array1Empty = array1Length <= array1.length-1;
			boolean array2Empty = array2Length <= array2.length-1;;
			if(array1Empty && (!array2Empty || array1[array1Length] <= array2[array2Length])) {
				mergeArray[i] = array1[array1Length];
				array1Length++;
			}else {
				mergeArray[i] = array2[array2Length];
				array2Length++;
			}
		}
		
		return mergeArray;
		
	}

}
