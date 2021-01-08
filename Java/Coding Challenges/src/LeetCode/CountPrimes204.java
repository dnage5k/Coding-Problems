package LeetCode;

public class CountPrimes204 {

	public static void main(String[] args) {
		int i = 12;
		System.out.println(countPrimes(i));

	}
	
	public static int countPrimes(int n) {
        int count = 0;
        if(n < 1){
            return count;
        }else if(n == 2){
            return 1;
        }
        
        boolean[] sieve = new boolean[n];
        for(int i = 0; i < sieve.length; i++){
            sieve[i] = true;
        }
        
        for(int i = 2; i < sieve.length; i++){
            if(sieve[i]){
                count++;
                for(int j = i*i; j < n; j += i){
                    sieve[j] = false;
                }
            }
        }
        return count;
    }

}
