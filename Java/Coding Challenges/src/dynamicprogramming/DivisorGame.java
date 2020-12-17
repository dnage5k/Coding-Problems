package dynamicprogramming;

public class DivisorGame {

	public static void main(String[] args) {
		boolean alice = false;
		int n = 200;
		System.out.println(divProvider(n,alice));
	}
	
	public static boolean divProvider(int n, boolean alice) {
		if(n < 2) {
			return alice;
		}
		
		 n-=1;
		 if(alice == true) {
			 alice = false;
		 }else {
			 alice = true;
		 }
		 
		 return divProvider(n, alice);
	}
}
