package Arrays;
import java.util.*;
public class FiveDigitPrimeNumber {

	public static void main(String[] args) {
		int id = 0;
		System.out.println(generate5Num(id));


	}
	
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
		List<Integer> list = new ArrayList<>();
		StringBuilder stringID = new StringBuilder();
		for(int i = 2; i < primes.length; i++) {
			if(primes[i]) {
				stringID.append(i);
				if(stringID.toString().length() >=10005) {
					break;
				}   

				for(long j = i*i; j < primes.length; j += i) {
					primes[(int) j] = false;
				}
			}
		}
		
		
		return stringID.toString();
	}

}
