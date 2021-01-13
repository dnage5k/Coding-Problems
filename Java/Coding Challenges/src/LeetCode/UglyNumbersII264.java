package LeetCode;
import java.util.*;
public class UglyNumbersII264 {
	// Question
	
	//Write a program to find the n-th ugly number.
	//Ugly numbers are positive numbers whose prime factors only include 2, 3, 5. 
	
	public static void main(String[] args) {
		int n = 10;
//		System.out.println(originalMethod(n));
		System.out.println(fasterMethod(n));

	}
	// Long Method
	// used a helper method called isUgly to see if the number is a ugly Number.
	// used while to loop until the count is greater than n
	// if it is a uglynumber then i will swap it with that new number and increment count
	// This method is too slow since it is a nested loop.
	public static int uglyNumber(int n) {

		if(n == 1) {
			return 1;
		}
		
		int uglyNumber = 2;
		int count = 2;
		int i = 2;
		while(count <= n) {
			
			if(isUgly(i)) {
				uglyNumber = i;
				count++;
			}
			i++;
				
		}
		
		return uglyNumber;
	}
	
	public static boolean isUgly(int n) {
		
		while(n > 1) {
			int checker = n;
			if(n % 5 == 0) {
				n /= 5;
			}if(n % 3 == 0) {
				n /= 3;
			}if(n % 2 == 0) {
				n /= 2;
			}
			
			if(checker == n) {
				return false;
			}
			
		}
			
		return true;
	}
	
	// Method
	// Create an ArrayList to store all uglyNumbers and return the nth one
	// added one to this so I could just start from 2
	// Created L1, L2, L3 variables to store the incrementation of each multiples
	// While loop until the size of the array reaches to n amount
	// Get the minimum of the of the three multiples
	// if the number is already in the list then the next if statement will just be incremented too
	
	public static int originalMethod(int n) {
		List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        
        if(n == 1) {
			return 1;
		}
        int L1 = 0;
        int L2 = 0;
        int L3 = 0;
        int min = 0;
        while(list.size() < n){
            int one = list.get(L1)*2;
            int two = list.get(L2)*3;
            int three = list.get(L3)*5;
            min = Math.min(one,Math.min(two,three));
                
            if(!list.contains(min)){
                list.add(min);
            }
            
            if(one == min){
                L1++;
            }
            if(two == min){
                L2++;
            }
            if(three == min){
                L3++;
            }
           
        }
        
		return list.get(list.size()-1);
	}
	
	
	// Method
	// Same method as the one above but instead of using an arraylist, we use an primitive array
	// Much faster
	public static int fasterMethod(int n) {
		if(n == 1) {
			return 1;
		}
		int[] list = new int[1690];
		list[0] = 1;
		int L1 = 0;
		int L2 = 0;
		int L3 = 0;
		int count = 1;
		while(n > count) {
			int one = list[L1] * 2;
			int two = list[L2] * 3;
			int three = list[L3] * 5;
			list[count] = Math.min(one, Math.min(two, three));
			
			if(list[count] == one) {
				L1++;
			}
			if(list[count] == two) {
				L2++;
			}
			if(list[count] == three) {
				L3++;
			}
			count++;
		}
		
		return list[n-1];
	}

}
