package amazonstuff;

public class ReverseAlphabetCharsOnly {

	public static void main(String[] args) {
		String s = "abcAc&d";
		System.out.println(reverseAlphabetCharsOnly(s));
	}
	
	public static String reverseAlphabetCharsOnly(String inputString) {
		/* ORIGINAL
		 * char[] inputChar = inputString.toCharArray();
        int right = inputString.length() - 1;
        int left = 0;
        while(left < right) {
            if(!Character.isAlphabetic(inputChar[left]))
                left++;
            else if(!Character.isAlphabetic(inputChar[right]))
                right--;
            else {
                char temp = inputChar[left];
                inputChar[left] = inputChar[right];
                inputChar[right] = temp;
                left++;
                right--;
            }
            
        }
        return new String(inputChar);
		 */
        char[] inputChar = inputString.toCharArray();
        int right = inputString.length() - 1;
        int left = 0;
        while(left < right) {
            if(!Character.isAlphabetic(inputChar[left]))
                left++;
            else if(!Character.isAlphabetic(inputChar[right]))
                right--;
            else {
                char temp = inputChar[left];
                inputChar[left] = inputChar[right];
                inputChar[right] = temp;
                left++;
                right--;
            }
            
        }
        return new String(inputChar);
    }

}
