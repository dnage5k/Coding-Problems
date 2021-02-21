package amazonstuff;
import java.util.*;
public class secretFruitList {

	public static void main(String[] args) {
		List<String> list1 = List.of("orange", "mango");
		List<String> list2 = List.of("watermelon", "mango");
		List<String> custList = List.of("orange", "mango", "watermelon", "mango");
		List<List<String>> fruitList = List.of(list1,list2);
		System.out.println(matchSecretLists(fruitList,custList));

	}
	/*
	 * 
	 * Cases:
	 * - when secret list contains "anything"
	 * - ignoring stuff not on the list
	 */
	 
	 
	public static boolean matchSecretLists(List<List<String>> secretFruitList, List<String> customerPurchasedList) {
		boolean state = true;
		boolean ans = true;
		int p = 0;

		// 3 pointers to iterate through two arrays
		// one pointer iterates through the list of secret list, another pointer iterates within the secret list and one that iterates through the customer's list
		
		// let k be the one iterate through the customer list while j iterate within the secret Fruit List 
		int k = 0 ;
		int j = 0;
		int i = 0;
		while(i < secretFruitList.size() &&  state) {
			if(secretFruitList.get(i).get(j) == "anything" || secretFruitList.get(i).get(j) == customerPurchasedList.get(k)) {
				k++;
				j++;
			}else{
				k++;
			}
			
			if(j == secretFruitList.get(i).size()) {
				i++;
				j = 0;
			}
			
		}
		return true;
		
		
    }
	
	public static boolean sol(List<List<String>> secretFruitList, List<String> customerPurchasedList) {
		 if(secretFruitList == null || secretFruitList.size() == 0)
		        return true;
		    if(customerPurchasedList == null || customerPurchasedList.size() == 0)
		        return false;
		    int i=0,j=0;
		    for(int k=0;k<customerPurchasedList.size();k++) {
		        //when match success
		        if(secretFruitList.get(i).get(j).equals(customerPurchasedList.get(k)) || secretFruitList.get(i).get(j).equals("anything")) {
		            j++;
		            if(j == secretFruitList.get(i).size()) {
		                i++;
		                j=0;
		            }
		            if(i == secretFruitList.size())
		                return true;
		        }else {
		            //when match failed, k and j both go back.
		            k-=j;
		            j=0;
		        }
		    }
		    return false;

	}

}
