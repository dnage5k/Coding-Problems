package LeetCode;
import java.util.*;
public class UglyNumbersII264 {
	// Question
	
	//Write a program to find the n-th ugly number.
	//Ugly numbers are positive numbers whose prime factors only include 2, 3, 5. 
	
	public static void main(String[] args) {
		int n = 1690;
		System.out.println(dpMethod(n));

	}
	
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
	
	public static int dpMethod(int n) {
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

}
