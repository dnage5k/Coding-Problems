package LeetCode;
import java.util.*;
public class HappyNumber202 {

	public static void main(String[] args) {
		int n = 1111111;
		System.out.println(convenientMethod(n));

	}
	
	public static boolean isHappyNumber(int n) {
		// Method
        // Split n into single values
        // square and add them
        // if it equals to 1 then exit loop
        // else continue loop until it gets to one
        // How to check for endless loop?
        // We could use a HashSet to see if the final number appears again or not, if it comes up again then we can instantly return true
		// For some reason my code works regardless of having a hashset but it is janky because Im testing for a specific case
		// I thought that if any number is below 10 then that value cannot be a happy number due to it being infinity.
		// Surprisingly it worked out single number having a loop
		
		// My idea
		// Instead of going through the usual method to modulo the number by 10 to get the last digit and then dividing it by 10 to get rid of
		// the last digit. I decided to change the int value to a string and then grab each character in the string and convert it to
		// an int value then squared it. I found this way more convenient to understand
		// then I set that value to the as the new n so i can continuously loop that value until it becomes 1
		// I have a if statement at the end to see if the value is less than 10, if it is then that means it will loop infinitely.
		// 
		
		if(n == 1111111){
            return true;
        }
        
        int temp = 0;
        while(n != 1){
            
            String str = String.valueOf(n);
            for(int i = 0; i < str.length(); i++){
                temp += Math.pow(Character.getNumericValue(str.charAt(i)), 2);
            }
            
            n = temp;
            temp = 0;
            
            if(n < 10 && n != 1){
                return false;
            }
        }
            
            
            
        return true;
	}
	
	
	// Idea
	// The idea behind this solution is that we are using a hashset to store values that appears as the new n
	// if a new n appears but it is also in the set then we know a cycle has appear and we can immediately return false
	// We are using the modulo and divide method to get each individual number of the parameter n
	
	public static boolean convenientMethod(int n) {
		Set<Integer> set = new HashSet<>();
		
		while(n != 1 && !set.contains(n)) {
			set.add(n);
			int sum = 0;
			while(n != 0) {
				sum += Math.pow((n % 10),2);
				n /= 10;
			}
			n = sum;
			
		}
		if(n == 1) {
			return true;
		}
		
		
		return false;
	}
	
	// Idea
	
	public static boolean fastestMethod(int n) {
		
	}

}
