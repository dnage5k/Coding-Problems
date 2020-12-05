package GreedyAlgo;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

public class InPlaceShuffling {
	private static Random rand = new Random();
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int[] arr1 = {0,1,2};
//		System.out.println(getRandom(0,arr1.length-1));
		System.out.println(Arrays.toString(shuffledArray(arr)));
	}
	
	public static int[] shuffledArray(int[] arr) {
//		int[] newArr = new int[arr.length];
//		ArrayList<Integer> list = new ArrayList<Integer>();
//		for(int i : arr) {
//			list.add(i);
//		}
//
//	
//		for(int i = 0; i < arr.length; i++) {
//			
//			int n = list.size();
//			int shuffle = (int) (Math.random()* n);
//			newArr[i] = list.get(shuffle);
//			list.remove(shuffle);
//			
//		}

		for(int i = 0; i < arr.length; i++) {
			int shuffle = getRandom(i,arr.length-1);
			int temp = arr[i];
			arr[i] = arr[shuffle];
			arr[shuffle] = temp;
			
		}
		return arr;
	}
	// getRandom(floor, ceiling)
	 private static int getRandom(int floor, int ceiling) {
	        return rand.nextInt((ceiling - floor) + 1) + floor;
	    }
	
}

// [0, 1, 2, 3, 4]