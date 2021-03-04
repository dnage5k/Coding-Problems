package LeetCode;

public class ConsecutiveCharacters1446 {
/*
 * Purpose:
 * The purpose of this problem is to find the highest consecutive count of letters and return that number
 */
	public static void main(String[] args) {
		String s = "leetcode";
		System.out.println(maxPower1(s));
		System.out.println(maxPower2(s));
		
	}
	
/*
 * Method:
 * The first method i did was a 2 pointer method
 * one pointer is the base and the 2nd pointer increments
 * if the first character and second character are the same, increase count, p1, and take the max of the original max and count
 * else set the count back to zero and set p0 to p1 to start the new pointer 
 * return max
 */
	public static int maxPower1(String s) {
		int count = 0;
        int max = 0;
        int p0 = 0;
        int p1 = 0;
        while(p0 < s.length() && p1 < s.length()){
            if(s.charAt(p0) == s.charAt(p1)){
                count++;
                p1++;
                max = Math.max(count, max);
            }else{
                count = 0;
                p0 = p1;
            }
            
        }
        return max;
	}
	
	/*
	 * Method:
	 * set count = 1 and max = 1
	 * use a for loop to iterate through the string
	 * if the char at index i is equal i-1 then its the same and we could increment the value
	 * Take the max of the two
	 * else set count back to one
	 * 
	 *  return max
	 */
	public static int maxPower2(String s) {
		int max = 1;
		int count = 1;
		for(int i = 1; i < s.length(); i++) {
			if(s.charAt(i) == s.charAt(i-1)){
				count++;
				max = Math.max(max, count);
			}else {
				count = 1;
			}
		}
		
		return max;
		
	}

}
