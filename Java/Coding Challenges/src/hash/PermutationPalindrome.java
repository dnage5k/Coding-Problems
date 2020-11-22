package hash;
import java.util.*;

public class PermutationPalindrome {
//	Write an efficient method that checks whether any permutation ↴ of an input string is a palindrome. ↴
//
//	You can assume the input string only contains lowercase letters.
//
//	Examples:
//
//	"civic" should return true
//	"ivicc" should return true
//	"civil" should return false
//	"livci" should return false
	
	// Purpose of this question is to see if the word given is a permutation palindrome which means if it contains some sort palindrome regardless of ordering.
	
	// Method
	// iterate through the array aka the string
	// since its a permutation palindrome then we know that all the letters have a copy beside one
	// I would create a hashset to store a value each iteration
	// if the hashset contains a value of that iteration then we want to remove because that means theres a copy of that already else add it to the hashset
	// return a boolean value if the size of the hashset is <= to one because that means all the values store has a copy which is a permutation palindrome.
	
	// Originally I created an array to obtain the char value of the string which means it is using O(n) space since I created an array
	// A better way to do this is grab the char value using i then storing it to compare to the set
	public static void main(String[] args) {
		String s1 = "civic";
		String s2 = "ivicc";
		String s3 = "civil";
		String s4 = "livci";
		
		System.out.println(diffPermutation(s1));
		System.out.println(diffPermutation(s2));
		System.out.println(diffPermutation(s3));
		System.out.println(diffPermutation(s4));
		

	}
	
	public static boolean diffPermutation(String s) {
		Set<Character> set = new HashSet<>();
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(set.contains(c)) {
				set.remove(c);
			}else {
				set.add(c);
			}
		}
		return set.size() <= 1;
	}

}
