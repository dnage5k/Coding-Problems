package hackerrank;
import java.util.*;
public class CommonPrefixLength {

	public static void main(String[] args) {
		String input = "ababaa";

//		System.out.println(checkingSuffix(input));
//		System.out.println(input.length());
		System.out.println(commonSuffix(input));
		System.out.println(betterMethod(input));

	}
	
	public static int checkingSuffix(String input) {
		if(input.length() < 2) {
			return input.length();
		}
		int length = input.length();
		
		int pointer2;
		
		char[] cha = input.toCharArray();
		for(int i = 1; i < input.length(); i++) {
			pointer2 = i+1;
			int count = 0;
			for(int j = 1; j <= input.length(); j++) {
				
				String a = input.substring(i, pointer2);
				String b = input.substring(0, j);
				if( !a.equals(b)) {
					length += count;
					break;
				}
				pointer2++;
				count++;
				if(pointer2 > input.length()) {
					length += count;
					break;
				}
			}
		}
		return length;
		
	}
	
	public static int commonSuffix(String input) {
		if(input.length() < 2) {
			return input.length();
		}
		int length = input.length();
		String[] arr = new String[input.length()-1];
		int pointer1 = 1;
		for(int i = 0; i < arr.length;i++) {
			arr[i] = input.substring(pointer1++, input.length());
		}
		pointer1 = 1;
		int i = 0;
		int j = 0;
		while(i < arr.length) {
			String a = input.substring(0, pointer1);
			String b = arr[i].substring(0,pointer1++);
			if(a.equals(b)) {
				length++;
				if(arr[i].length() < pointer1) {
					pointer1 = 1;
					i++;
				}
			}else {
				pointer1 = 1;
				i++;
			}
			
		}
		return length;
	}
	
	public static int betterMethod(String input) {
		int len = input.length();
		char[] arr = input.toCharArray();
		Set<Integer> index = new HashSet<>();
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] == arr[0] ) {
				index.add(i);
			}
		}
		
		for(int a : index) {
			int pointer1 = a;
			int pointer2 = 0;
			while(pointer1 < arr.length) {
				if(arr[pointer1++] == arr[pointer2++]) {
					len++;
				}else {
					break;
				}
			}
		}
		return len;
	}
		

}
