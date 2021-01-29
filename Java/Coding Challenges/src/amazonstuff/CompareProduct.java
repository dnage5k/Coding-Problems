package amazonstuff;

public class CompareProduct {

	public static void main(String[] args) {
		int num = 99;
		System.out.println(9/10);
		System.out.println(compareProduct(num));

	}
	
	/* ORIGINAL
	 * public boolean compareProduct(int num) {
        if (num < 10)
            return false;
        int oddProdValue = 1, evenProdValue = 1;

        while(num > 0) {
            int digit = num / 10;
            oddProdValue *= digit;
            num = num / 10;
            if(num == 0)
                break;
            digit = num / 10;
            evenProdValue *= digit;
            num = num / 10;
        }
        if(evenProdValue == oddProdValue)
            return true;
        return false;
    }
	 */
	public static boolean compareProduct(int num) {
        if (num < 10)
            return false;
        int oddProdValue = 1, evenProdValue = 1;

        while(num > 0) {
            int digit = num % 10;
            oddProdValue *= digit;
            num = num / 10;
            if(num == 0)
                break;
            digit = num % 10;
            evenProdValue *= digit;
            num = num / 10;
        }
        if(evenProdValue == oddProdValue)
            return true;
        return false;
    }

}
