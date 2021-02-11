package amazonstuff;
import java.util.*;
import java.util.Map.Entry;
public class LargestDeficit {

	public static void main(String[] args) {
		List<debtRecord> records = new ArrayList<>();
		

	}
	
	// Method
	public static List<String> minimumDebtMembers(List<debtRecord> records){

        List<String> list2 = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        Comparator<Entry<String, Integer>> valueComparator = new Comparator<Entry<String,Integer>>() {
            
            @Override
            public int compare(Entry<String, Integer> m1, Entry<String, Integer> m2) {
                return m1.getValue().compareTo(m2.getValue());
            }
        };
        
		
		for(debtRecord x: records) {
			map.put(x.borrower, map.getOrDefault(x.borrower, 0) -  x.amount);
			map.put(x.lender, map.getOrDefault(x.lender, 0) + x.amount);
		}
		
		List<Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
		Collections.sort(list,valueComparator);
		list2.add(list.get(0).getKey());
		int temp = list.get(0).getValue();
		list.remove(0);
		for(Entry<String,Integer> x : list){
		    if(x.getValue() == temp) {
		    	
		    }
		}
		
		
		return list2;
    }
	
	class debtRecord{
	    String borrower = ""; // importer
	    String lender = ""; //exporter
	    int amount = 0;
	}

}
