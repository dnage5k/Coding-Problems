package LeetCode;
import java.util.*;
public class ShuffleString1528 {

	public static void main(String[] args) {
		String ex1 = "codeleet";
		int[] num1 = {4,5,6,7,0,2,1,3};
		
		System.out.println(diffWay(ex1, num1));

	}
	
	 public static String restoreString(String s, int[] indices) {
	        // Method
	        // Create hashmap to store key values as indicies and value as letters at that indicy
	        // iterate again to build the string by grabbing the key values at each iteration
	        
        Map<Integer, Character> map = new HashMap<>();
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < indices.length; i++){
            map.put(indices[i], s.charAt(i));
        }
        
        for(int i = 0; i < indices.length; i++){
            str.append(map.get(i));
        }
        
        return str.toString();
    }
	 
	 // codeleet
	 // 45670213
	 public static String diffWay(String s, int[] indices) {
		 StringBuilder str = new StringBuilder();
		 str.setLength(s.length());
		 char[] c = s.toCharArray();
		 for(int i = 0; i < indices.length; i++) {
			 str.setCharAt(indices[i], c[i]);
		 }
		 return str.toString();
	 }
}
