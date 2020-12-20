package dynamicprogramming;

// Question
// Given a string s and a string t, check if s is subsequence of t.

//A subsequence of a string is a new string which is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (ie, "ace" is a subsequence of "abcde" while "aec" is not).
//
//Follow up:
//If there are lots of incoming S, say S1, S2, ... , Sk where k >= 1B, and you want to check one by one to see if T has its subsequence. In this scenario, how would you change your code?

// Example

public class IsSubSequence392 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static boolean subSequence(String s, String t) {
		if(s.length() == 0) {
			return true;
		}else if(t.length() == 0) {
			return false;
		}
		
		int pointer1 = 0;
		
		char[] str = s.toCharArray();
		char[] newT = t.toCharArray();
		
		for(int i = 0; i < newT.length; i++) {
			if(str[pointer1] == (newT[i])) {
				pointer1++;
			}
			if(pointer1 == str.length) {
				return true;
			}
		}
		
		return false;
	}

}
