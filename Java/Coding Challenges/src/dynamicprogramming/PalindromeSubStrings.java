package dynamicprogramming;

public class PalindromeSubStrings {

	public static void main(String[] args) {
		 String s = "cac";
		 int sum = s.length();
	        
	        for(int i = 0; i < s.length(); i++){
	            int pointer = i;
	            for(int j = i; j < s.length(); j++){
	                if(i != j){
	                    if(s.charAt(pointer) == s.charAt(j)){
	                        sum += 1;
	                    }else{
	                        
	                    }
	                }
	            }
	        }
	        System.out.println(sum);

	}
	
//	public static int recursive(String s, int sum) {
//		
//	}

}
d