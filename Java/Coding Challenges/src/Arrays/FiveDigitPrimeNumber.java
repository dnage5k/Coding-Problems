package Arrays;
import java.util.*;
public class FiveDigitPrimeNumber {

	public static void main(String[] args) {
		long id = 9300;
		int a = 9300*9300;
		System.out.println(a);
		System.out.println(generate5Num(id));

	}
	
	public static String generate5Num(long id) {
		boolean[] primes = new boolean[(int) (id*5 +1)];
		for(int i = 0; i < id*5; i++) {
			primes[i] = true;
		}
		List<Integer> list = primeGenerator(id, primes);
		System.out.println(list);
		
		StringBuilder stringID = new StringBuilder();
		for(int i = 0; i < id/2; i++) {
			stringID.append(list.get(i));
		}
		String newString = stringID.toString();
		String newID = newString.substring((int)id, (int)id+5);
		return newID;
		
	}
	
	public static List<Integer> primeGenerator(long id,boolean[] primes){
		List<Integer> list = new ArrayList<>();
		
		for(int i = 2; i < primes.length; i++) {
			if(primes[i]) {
				System.out.print(i);
				for(int j = i*i; j < primes.length; j += i) {
					
					primes[j] = false;
				}
			}
		}
		
		for(int i = 2; i < primes.length; i++) {
			if(primes[i]) {
				list.add(i);
			}
		}
		
		return list;
	}

}
