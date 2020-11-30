package GreedyAlgo;

public class ProductOf3 {
//	Given an array of integers, find the highest product you can get from three of the integers.
//
//	The input arrayOfInts will always have at least three integers.	
	
	// Purpose
	// The purpose of this problem is to find the highest product of 3 numbers in the array
	
	// Method
	// One way is we can sort the array and grab the last 3 values then return the product of it
	// The O(n) solution Im thinking of would be 
	public static void main(String[] args) {
		int[] ex1 = {3,6,7,2,6};
		int[] ex2 = {-10, 1, 3, 2, -10};
		int[] ex3 = {1,2,3,4};
//		System.out.println(productOf3(ex1));
//		System.out.println(productOf3(ex2));
		System.out.println(productOf3(ex3));
	}
	
	public static int productOf3(int[] intArray) {
//		int[] ex1 = {3,6,7,2,6};
		if(intArray.length < 3) {
			throw new IllegalArgumentException("array length less than 3");
		}
		
		
		int one = intArray[0];
		int two = intArray[1];
		
		int negOne = intArray[0];
		int negTwo = intArray[1];
		
		int product = -10000000;
		

		if( intArray.length == 3) {
			return intArray[0] * intArray[1] * intArray[2];
		}
		int lowest = Math.max(negOne, negTwo);
		int highest = Math.min(one, two);
		for(int i = 2; i < intArray.length; i++) {
			
			
			
			
			 
		}
		return product;
		
//		
//		 	int highest = Math.max(intArray[0], intArray[1]);
//		    int lowest  = Math.min(intArray[0], intArray[1]);
//
//		    int highestProductOf2 = intArray[0] * intArray[1];
//		    int lowestProductOf2  = intArray[0] * intArray[1];
//
//		    // except this one--we pre-populate it for the first *3* items.
//		    // this means in our first pass it'll check against itself, which is fine.
//		    int highestProductOf3 = intArray[0] * intArray[1] * intArray[2];
//
//		    // walk through items, starting at index 2
//		    for (int i = 2; i < intArray.length; i++) {
//		        int current = intArray[i];
//
//		        // do we have a new highest product of 3?
//		        // it's either the current highest,
//		        // or the current times the highest product of two
//		        // or the current times the lowest product of two
//		        highestProductOf3 = Math.max(Math.max(highestProductOf3, current * highestProductOf2),current * lowestProductOf2);
//
//		        // do we have a new highest product of two?
//		        highestProductOf2 = Math.max(Math.max(
//		            highestProductOf2,
//		            current * highest),
//		            current * lowest);
//
//		        // do we have a new lowest product of two?
//		        lowestProductOf2 = Math.min(Math.min(
//		            lowestProductOf2,
//		            current * highest),
//		            current * lowest);
//
//		        // do we have a new highest?
//		        highest = Math.max(highest, current);
//
//		        // do we have a new lowest?
//		        lowest = Math.min(lowest, current);
//		
		
//		 return product;
	}
		   
	
		   


}
