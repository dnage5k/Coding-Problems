package amazonstuff;
import java.util.*;
public class CalculateSumOfNumbersInString {

	public static void main(String[] args) {
		String s = "123 456";
		System.out.println(calculateSumOfNumbersInString(s));

	}
	/* ORIGINAL
	 * The following function returns a positive integer representing the sum of numbers in the inputString.
	   The following code compiles successfully but fails to return the desired result. Your task is to fix the 
	   code so that it passes all test cases.
	   
	   Purpose:
	   The purpose of this problem is to add the individual numbers of the string and output the sum of it
	   The problem with the original is that it always output 0
	   To understand this problem I had to understand what the program was doing
	   
	   The for loop loops through the each character of the in the string
	   it checks if the character is a digit, if it is then it adds that to the String temp
	   else then we add sum with Integer.parseInt(temp) and equate back to sum
	   then temp is set to 0
	   
	   How to Debug it:
	   From looking at this, I outputted the answer everytime to see what I would get with the given result and
	   the result was that sum was always zero for some reason
	   And the reason was that temp will always reset to zero after the previous statement, hence always returning zero
	   So what we need to do is put temp ="0" into the else statement so we can reset temp every time to zero when we add it to sum
	   
	   
	 * public int calculateSumOfNumbersInString(String inputString) {
        String temp = "";
        int sum = 0;
        for(int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
            if(Character.isDigit(ch))
                temp += ch;
            else
                sum += Integer.parseInt(temp);
            temp = "0";
        }
        return sum + Integer.parseInt(temp);
    }
	 */
	public static int calculateSumOfNumbersInString(String inputString) {
        String temp = "";
        int sum = 0;
        for(int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
            if(Character.isDigit(ch))
                temp += ch;
            else {
                sum += Integer.parseInt(temp);
                temp = "0";
            }
            
            
            
        }
        return sum + Integer.parseInt(temp);
    }

}
