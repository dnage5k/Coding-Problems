package LeetCode;
import java.util.*;

public class ValidAnagram {

	public static void main(String[] args) {
		String s = "anagram";
		String t = "nagaram";
		
		String s1 = "rat";
		String t1 = "car";
		System.out.println(validAnagram(s,t));
		System.out.println(validAnagram(s1,t1));

	}
	
	public static boolean validAnagram(String s, String t) {
		Map<Character, Integer> map = new HashMap<>();

        if(s.length() != t.length()){
            return false;
        }else if(s == null && t == null){
            return true;
        }
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(!map.containsKey(c)){
                map.put(c, 1);
            }else{
                map.put(c, map.get(c) + 1);
            }
        }
        
        for(int i = 0; i < t.length(); i++){
            char c = t.charAt(i);
            if(map.containsKey(c)){
                map.put(c, map.get(c) - 1);
                if(map.get(c) < 0){
                    return false;
                }
            }else{
                return false;
            }
        }
        
        return true;
	}

}
