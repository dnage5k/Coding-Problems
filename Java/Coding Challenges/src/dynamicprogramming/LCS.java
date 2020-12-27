package dynamicprogramming;

public class LCS {

	public static void main(String[] args) {
		String text1 = "ace";
		String text2 = "abcde";
		int i = 0;
		int j = 0;
		System.out.println(lcs(text1,text2,i,j));

	}
	
	public static int lcs(String text1, String text2, int i, int j) {
		if(i == text1.length() || j == text2.length()) {
			return 0;
		}else if(text1.charAt(i) == text2.charAt(j)) {
			return 1 + lcs(text1,text2,i+1,j+1);
				
		}else {
			return Math.max(lcs(text1,text2,i+1,j), lcs(text1,text2,i,j+1));
		}
	}

}
