package Arrays;
import java.util.*;
public class FiveDigitPrimeNumber {
	// Purpose of this problem is when given an integer i, generate a five digit prime number starting at the ith number of the prime string
	// For example
	// i = 3
	// return a prime string of 71113
	// The idea is that you have to create a prime string then go to the ith part of the string
	public static void main(String[] args) {
		int id = 10;
//		System.out.println(generate5Num(id));


	}
	
	// Method
	// In order to generate a prime string based off the index given, we would have to use Sieve of Eratosthenes
	// The idea is that we could find all the prime numbers up to a given limit
	// We first start with 2 and find all the multiples of that and set them false for every multiple of 2
	// we increment up and do the same where we square the next number and keep going until it is above the limit
	// The final array will be filled with false and true
	// We append everytime the array is true creating our string
	// we then find the ith index of the string and get the substring of it.
	
	public static String generate5Num(int i) {
		int a;
		if(i <= 2) {
			 a = i + 15;
		}else{
			a = i * 5 + 1;
		}
		boolean[] primes = new boolean[a];
		for(int s = 0; s < primes.length; s++) {
			primes[s] = true;
		}
	
		String stringID = primeGenerator(i, primes);
		return stringID.substring(i, i+5);
		
	}
	
	public static String primeGenerator(int id,boolean[] primes){
		int a;
		if(id <= 2) {
			 a = id + 15;
		}else{
			a = id * 5 + 1;
		}
		
		
		StringBuilder stringID = new StringBuilder();
		for(int i = 2; i < primes.length; i++) {
			if(primes[i]) {
				stringID.append(i);
				if(stringID.toString().length() >=10005) {
					break;
				}   

				for(int j = i*i; j < primes.length; j += i) {
					primes[j] = false;
				}
			}
		}
		
		
		return stringID.toString();
	}
	

}
