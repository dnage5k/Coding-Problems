package hash;
import java.util.*;

public class TopScores {
//	You created a game that is more popular than Angry Birds.
//
//	Each round, players receive a score between 0 and 100, which you use to rank them from highest to lowest. So far you're using an algorithm that sorts in O(n\lg{n})O(nlgn) time, but players are complaining that their rankings aren't updated fast enough. You need a faster sorting algorithm.
//
//	Write a method that takes:
//
//	an array of unsortedScores
//	the highestPossibleScore in the game
//	and returns a sorted array of scores in less than O(n\lg{n})O(nlgn) time.
//
//	For example:
//
//	  int[] unsortedScores = {37, 89, 41, 65, 91, 53};
//	final int HIGHEST_POSSIBLE_SCORE = 100;
//
//	int[] sortedScores = sortScores(unsortedScores, HIGHEST_POSSIBLE_SCORE);
//	// sortedScores: [91, 89, 65, 53, 41, 37]

	
	// Purpose
	// Given an array of integers that are unsorted, try to order them from highest to least in O(n) time 
	
	// Method
	// Definitely will be O(N) space complexity due to making an hashmap and possibly an arraylist
	// I want to use a hashmap problem to store the unsorted array
	// store with the index key 
	public static void main(String[] args) {
		final int HIGHEST_POSSIBLE_SCORE = 100;
		int[] unsortedScores = {30,60};
		
		System.out.println(Arrays.toString(scoreSort(unsortedScores, HIGHEST_POSSIBLE_SCORE)));
		System.out.println(Arrays.toString(sortScores1(unsortedScores, HIGHEST_POSSIBLE_SCORE)));
	}
	
	public static int[] scoreSort(int[] scores, int highestScore) {
		
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		int pointer = 0;
		int[] sortedArray = new int[scores.length];
		
		for(int i = 0; i < scores.length; i ++) {
			if(!map.containsKey(scores[i])) {
				map.put(scores[i], 1);
			}else {
				map.put(scores[i], map.get(scores[i])+1);
			}
		}
		
		for(int i = highestScore;  i >= 0; i--) {
			if(map.containsKey(i)) {
				for(int j = 0; j < map.get(i); j++) {
					sortedArray[pointer++] = i;
				}
			}
		}

		return sortedArray;
	}
	
	  public static int[] sortScores1(int[] unorderedScores, int highestPossibleScore) {

	        // sort the scores in O(n) time
	        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
			int pointer = 0;
			int[] sortedArray = new int[unorderedScores.length];
			
			for(int i = 0; i < unorderedScores.length; i ++) {
				if(!map.containsKey(unorderedScores[i])) {
					map.put(unorderedScores[i], 1);
				}else {
					map.put(unorderedScores[i], map.get(unorderedScores[i])+1);
				}
			}
			System.out.println(map.entrySet());
			for(int i = highestPossibleScore; i >= 0; i--) {
				if(map.containsKey(i)) {
					for(int j = 0; j < map.get(i); j++) {
						sortedArray[pointer++] = i;
					}
				}
			}

	        return unorderedScores;
	    }
	

}
