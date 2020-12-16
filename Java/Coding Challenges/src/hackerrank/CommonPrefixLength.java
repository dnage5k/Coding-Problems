package hackerrank;

public class CommonPrefixLength {

	public static void main(String[] args) {
		String input = "abcabcd";
		System.out.println(input.substring(0,input.length()));
		System.out.println(checkingSuffix(input));

	}
	
	public static int checkingSuffix(String input) {
		if(input.length() < 2) {
			return input.length();
		}
		int length = input.length();
		
		int pointer2;
		
		char[] cha = input.toCharArray();
		for(int i = 1; i < input.length(); i++) {
			pointer2 = i+1;
			int count = 0;
			for(int j = 1; j <= input.length(); j++) {
				
				String a = input.substring(i, pointer2);
				String b = input.substring(0, j);
				if( !a.equals(b)) {
					length += count;
					break;
				}
				pointer2++;
				count++;
				if(pointer2 > input.length()) {
					length += count;
					break;
				}
			}
		}
		return length;
		
	}

}
