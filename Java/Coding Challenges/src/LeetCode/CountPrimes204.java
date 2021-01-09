package LeetCode;
import java.util.*;
public class CountPrimes204 {
	// Purpose
	// The purpose of this problem is to count the numbers of prime given a limit n.
	public static void main(String[] args) {
		int i = 5000000;
		System.out.println(countPrimes(i));

	}
	
	// Method
	// In order to find all prime number count from a given n, we will used sieve method
	// Sieve method is to create a boolean array containing n amount of number. 
	// Each index will contain true or false based on if the value is prime or not
	// false is when the value is prime and we increment count
	// loops through all multiples of the prime number and set them to true for it be not prime
	public static int countPrimes(int n) {
        int count = 0;
        if(n < 2){
            return count;
        }
        boolean[] isNotPrime = new boolean[n];
        for(int i = 2; i < n; i++) {
        	if(!isNotPrime[i]) {
        		count++;
        		for(int j = i; j < n; j+=i) {
        			isNotPrime[j] = true;
        		}
        	}
        }
        

        
        return count;
    }
	


}
