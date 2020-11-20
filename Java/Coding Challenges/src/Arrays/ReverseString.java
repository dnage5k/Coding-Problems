package Arrays;

public class ReverseString {

	public static void main(String[] args) {
		char[] s = {'t','h','e',' ','c','a','t'};
		System.out.println(reverseString(s));
	}
	
	public static char[] reverseString(char[] s) {
		int left = 0;
		int right = s.length - 1;
		char temp;
		while(left < right) {
			temp = s[left];
			s[left] = s[right];
			s[right] = temp;
			
			left++;
			right--;
		}
		
		return s;
	}

}
