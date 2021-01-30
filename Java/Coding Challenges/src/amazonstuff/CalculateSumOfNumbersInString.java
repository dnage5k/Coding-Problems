package amazonstuff;
import java.util.*;
public class CalculateSumOfNumbersInString {

	public static void main(String[] args) {
		String s = "123 342";
		System.out.println(calculateSumOfNumbersInString(s));

	}
	/* ORIGINAL
	 * The following function returns a positive integer representing the sum of numbers in the inputString.
	   The following code compiles successfully but fails to return the desired result. Your task is to fix the 
	   code so that it passes all test cases.
	   
	   Purpose:
	   The purpose of this problem is to add the individual numbers of the string and output the sum of it 
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
