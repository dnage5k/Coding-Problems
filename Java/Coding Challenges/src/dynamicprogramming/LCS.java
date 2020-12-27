package dynamicprogramming;

public class LCS {

	public static void main(String[] args) {
		String text1 = "ace";
		String text2 = "abcde";
		int i = 0;
		int j = 0;
		int[][] memo = new int[text1.length()][text2.length()];
		System.out.println(lcs(text1,text2,i,j, memo));
		System.out.println(lcsIterative(text1, text2));
		System.out.println(lcsIterative2(text1, text2));

	}
	
	public static int lcs(String text1, String text2, int i, int j,int[][] memo) {
		if(i == text1.length() || j == text2.length()) {
			return 0;
		}else if(memo[i][j] != 0) {
			return memo[i][j];
		}else if(text1.charAt(i) == text2.charAt(j)) {
			int a = 1 + lcs(text1,text2,i+1,j+1,memo);
			memo[i][j] = a;
			return a;
				
		}else {
			return Math.max(lcs(text1,text2,i+1,j, memo), lcs(text1,text2,i,j+1, memo));
		}
	}
	
	public static int lcsIterative(String text1, String text2) {

		int[][] memo = new int[text1.length()+1][text2.length()+1];
		
		for(int i = 0; i < text1.length(); i++) {
			for(int j = 0; j < text2.length(); j++) {
				if(text1.charAt(i) == text2.charAt(j)) {
					memo[i+1][j+1] = 1 + memo[i][j];
				}else {
					memo[i+1][j+1] = Math.max(memo[i+1][j], memo[i][j+1]);
				}
			}
			
			
		}
		return memo[text1.length()][text2.length()];
	}
	
	public static int lcsIterative2(String text1, String text2) {
		int[][] memo = new int[text1.length()+1][text2.length()+1];
		for(int i = 1; i <= text1.length(); i++) {
			for(int j = 1; j <= text2.length();j++) {
				if(text1.charAt(i-1) == text2.charAt(j-1)) {
					memo[i][j] = 1 + memo[i-1][j-1];
				}else {
					memo[i][j] = Math.max(memo[i-1][j], memo[i][j-1]);
				}
			}
		}
		return memo[text1.length()][text2.length()];
	}

}
