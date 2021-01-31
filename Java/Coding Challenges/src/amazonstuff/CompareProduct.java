package amazonstuff;

public class CompareProduct {

	public static void main(String[] args) {
		int num = 99;
		System.out.println(9/10);
		System.out.println(compareProduct(num));

	}
	
	/* ORIGINAL
	 * 
	 * Purpose:
	 * The purpose of this problem is to compare the product of the of the even and odd placement of the given input digits
	 * 
	 *Original Code:
	 * The beginning of the code checks if the input num is less than 10, if it is then return false (its false because there is no tenth digit)
	 * We create a while loop with condition num > 0
	 * grab the first digit of num by dividing it by 10 and setting it equal to digit
	 * multiply digit with the odd variable
	 * then divide num by 10 to get rid of the last number
	 * Check to see if num is equal to zero, if it is then we break and return false
	 * if not then we continue with the same process, getting the individual digit from num and multiplying it with even variable now
	 * then getting rid of the 2nd digit of num
	 * The loop continues util num is zero
	 * 
	 *  Debugging code:
	 *  The output is false when 99 was the input even tho it was suppose be true
	 *  So why is it outputting false even the the individual digits of the num are equal to each other for the end result?
	 *  This means the digit is wrong to begin, how is it wrong.
	 *  Well in order to get the last digit of a number we would have to do modulo instead of dividing
	 *  We divide when we only want to get rid of the digit
	 * 
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
