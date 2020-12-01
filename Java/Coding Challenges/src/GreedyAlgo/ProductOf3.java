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
		System.out.println(productOf3(ex1));
		System.out.println(productOf3(ex2));
		System.out.println(productOf3(ex3));
		
		System.out.println(secondWay(ex1));
		System.out.println(secondWay(ex2));
		System.out.println(secondWay(ex3));
	}
	
	public static int productOf3(int[] intArray) {
//		int[] ex1 = {3,6,7,2,6};
		if(intArray.length < 3) {
			throw new IllegalArgumentException("array length less than 3");
		}
		if( intArray.length == 3) {
			return intArray[0] * intArray[1] * intArray[2];
		}
		
		int highest1 = Integer.MIN_VALUE;
		int highest2 = Integer.MIN_VALUE;
		int highest3 = Integer.MIN_VALUE;
		
		int lowest1 = Integer.MAX_VALUE;
		int lowest2 = Integer.MAX_VALUE;

		
		
		
		for(int i = 0; i < intArray.length; i++) {
			if(highest3 < intArray[i]) {
				highest1 = highest2;
				highest2 = highest3;
				highest3 = intArray[i];
			}else if(highest2 < intArray[i]) {
				highest1 = highest2;
				highest2 = intArray[i];
			}else if(highest1 < intArray[i]) {
				highest1 = intArray[i];
			}
			
			if(lowest2 > intArray[i]) {
				lowest1 = lowest2;
				lowest2 = intArray[i];
			}else if(lowest1 > intArray[i]) {
				lowest1 = intArray[i];
			}
			
			
			
			
		}
		return Math.max(highest1*highest2*highest3,lowest1*lowest2*highest3);
		
		
		 

		   
	}
		   
	public static int secondWay(int[] nums) {
		if(nums.length < 3) {
			throw new IllegalArgumentException("array length less than 3");
		}else if(nums.length == 3) {
			return nums[0]*nums[1]*nums[2];
		}
		int highest = Math.max(nums[0], nums[1]);
	    int lowest  = Math.min(nums[0], nums[1]);

	    int highestProductOf2 = nums[0] * nums[1];
	    int lowestProductOf2  = nums[0] * nums[1];

	    // except this one--we pre-populate it for the first *3* items.
	    // this means in our first pass it'll check against itself, which is fine.
	    int highestProductOf3 = nums[0] * nums[1] * nums[2];
	    
//	  	example  {-10, 1, 3, 2, -10}
		for(int i = 2; i < nums.length; i++) {
			highestProductOf3 = Math.max(highestProductOf3, Math.max(highestProductOf2*nums[i], lowestProductOf2*nums[i]));
			
			highestProductOf2 = Math.max(highestProductOf2, Math.max(highest*nums[i], lowest*nums[i]));
			
			lowestProductOf2 = Math.min(lowestProductOf2, Math.min(highest*nums[i], lowest*nums[i]));
			
			highest = Math.max(highest, nums[i]);
			lowest = Math.min(lowest, nums[i]);
		}
		return highestProductOf3;
	}
		   


}
