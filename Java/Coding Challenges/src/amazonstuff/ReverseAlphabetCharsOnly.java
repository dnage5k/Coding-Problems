package amazonstuff;

public class ReverseAlphabetCharsOnly {

	public static void main(String[] args) {
		String s = "abcAc&d";
		System.out.println(reverseAlphabetCharsOnly(s));
	}
	
	/* ORIGINAL
	 * Purpose:
	 * The purpose of the this problem is to reverse the given string but only reverse alphabetic characters and ignore the rest
	 * 
	 * Original code:
	 * In the original code, we convert the string to an char array
	 * then iterate through the char array with having a left pointer and a right pointer
	 * the while loop continues when the left pointer is less than the right pointer
	 * in the loop, you have two if statements. The first statement checks to see if the left index of the array is not an alphabet
	 * if it is not an alphabet, then we increment the left pointer since we only care about reversing only alphabet
	 * the next if statement checks the same thing but with the right pointer
	 * if none of if statements passes then we hit the else statement where we switch both of the character of the left and right pointer
	 * exiting the conditional if statements, we increment both the left and right pointer
	 * 
	 * Debugging the code:
	 * When I output the code, it appears that not all the characters were flipped even though it should have which means the pointers
	 * are skipping
	 * I would have to look at why are the pointers skipping which consist of the if statements and the ending statements
	 * The if statements made sense since its only incrementing when its not an alphabet which what we want. So both statements are fine
	 * The ending of the while loop is wrong. Why? Because it is incrementing left and right pointer regardless of if it is a special character
	 * What we need to do is increment the left and right pointer after we do the swapping in the else statement
	 * This way, it is not going to skip any characters
	 * 
	 * public String reverseAlphabetCharsOnly(String inputString) {
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
        }
        left++;
        right--;
    }
    return new String(inputChar);
}
	 */
	public static String reverseAlphabetCharsOnly(String inputString) {
		
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
