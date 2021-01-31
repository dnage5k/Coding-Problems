package amazonstuff;

public class RemoveConVowels {

	public static void main(String[] args) {
		String s = "aabaic";
		System.out.println(removeConsecutiveVowels(s));

	}
	/* ORIGINAL
	 * 
	 * Purpose:
	 * The purpose of this problem is to find and fix the error in the algorithm. The algo works by returning a non-consecutive vowel string
	 * For example, if the input string is aaba then the output should be aba. The algo should not be returning any consecutive vowel
	 * 
	 * Original Code:
	 * In the original code, we have a helper boolean function called is_vowel which checks if the character is a vowel or not
	 * Then we have the main function that returns the string without consecutive vowels
	 * We have a for loop that starts at index 1 since the beginning of the function starts the new string as the first index of the input string
	 * in the loop, theres an if statement condition that states if the character i-1 in the string is not a vowel and the current index character 
	 * is not a vowel too then we add it to str1
	 * We return the final string
	 * 
	 * Debugging the code:
	 * The normal thing to do in an amazon coding assessment is to output the answer to see what is expected and what was the actual output
	 * What was expected was "aba" but what output was "a" given the input string was "aba"
	 * It seems that the string is only added when the if statement is true which means it has something to do with the if statement
	 * The original if statement states: if((!is_vowel(str.charAt(i-1))) && (!is_vowel(str.charAt(i)))) which means the if statement is only true
	 * if the character at i-1 is not a vowel AND current i is not a vowel then its true
	 * The problem is that it will never be true unless both the previous char and current char is not a vowel
	 * We need to change the conditional statement to OR because in order to add a non vowel into a string then we put OR conditional
	 * 
	 * boolean is_vowel(char ch) {
        return (ch == 'a') || (ch == 'e') ||
                (ch == 'i') || (ch == 'o') ||
                (ch == 'u');
    }

    public String removeConsecutiveVowels(String str) {
        String str1 = "";
        str1 = str1+str.charAt(0);
        for(int i = 1; i < str.length(); i++)
            if((!is_vowel(str.charAt(i - 1))) &&
                    (!is_vowel(str.charAt(i)))) {
                char ch = str.charAt(i);
                str1 = str1 + ch;
            }
        return str1;
    }
	 */
	public static String removeConsecutiveVowels(String str) {
        String str1 = "";
        str1 = str1+str.charAt(0);
        for(int i = 1; i < str.length(); i++)
            if((!is_vowel(str.charAt(i - 1))) ||
                    (!is_vowel(str.charAt(i)))) {
                char ch = str.charAt(i);
                str1 = str1 + ch;
            }
        return str1;
    }
	public static boolean is_vowel(char ch) {
        return (ch == 'a') || (ch == 'e') ||
                (ch == 'i') || (ch == 'o') ||
                (ch == 'u');
    }

}
