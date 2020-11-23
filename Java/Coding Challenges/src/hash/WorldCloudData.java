package hash;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class WorldCloudData {
//	You want to build a word cloud, an infographic where the size of a word corresponds to how often it appears in the body of text.
//
//	To do this, you'll need data. Write code that takes a long string and builds its word cloud data in a hash map ↴ , where the keys are words and the values are the number of times the words occurred.
	
	// Purpose
	// Create a cloud system that stores all keywords and a value associate with how many times it has appeared
	public static void main(String[] args) {
		String s =   "After beating the eggs, Dana read the next step:"
				+" Add milk and eggs, then add flour and sugar.";
		System.out.println(cloudStorage(s));
	}
	
	public static Map<String,Integer> cloudStorage(String data){
		// Method
		// I want to split the sentences using string split
		// then go through each indexes to store each word as a key and increment the value by one
		// inside the for loop
		// if hashmap contains that key in that index, increment it by one, else put it in the map
		
		Map<String,Integer> map = new HashMap<String,Integer>();
		String[] split = data.toLowerCase().split(" ");
		System.out.println(Arrays.toString(split));
		String punc = ",./ ';:{[}]+=-_!@#/?";
		
		for(String word: split) {
			if(punc.contains(word.substring(word.length()-1))) {
				if(map.containsKey(word.substring(word.length()-1))){
					map.put(word.substring(word.length()-1), map.get(word.substring(word.length()-1))+1);
				}else {
					map.put(word.substring(word.length()-1),1);
				}
				
				if(map.containsKey(word.substring(0,word.length()-1))) {
					map.put(word.substring(0,word.length()-1), map.get(word.substring(0,word.length()-1))+1);
				}else {
					map.put(word.substring(0,word.length()-1), 1);
				}
			}else if(map.containsKey(word)) {
				map.put(word, map.get(word)+1);
			}else {
				map.put(word, 1);
			}
		}
		return map;
	}
	
	// Helper method
	// Check if the word is either in the map or not

}
