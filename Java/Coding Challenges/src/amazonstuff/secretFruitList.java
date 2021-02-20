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
		int p = 0;
		for(int i = 0; i < secretFruitList.size(); i++) {
			
			for(int j = 0; j < secretFruitList.get(i).size(); j++) {
				if(!customerPurchasedList.get(p).equals(secretFruitList.get(i).get(j))) {
					return false;
				}
				p++;
			}
		}
		return true;
		
		
    }

}
