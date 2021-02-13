package amazonstuff;
import java.util.*;
import java.util.Map.Entry;
public class LargestDeficit {

	public static void main(String[] args) {
		
		List<debtRecord> importers = new ArrayList<>();
		debtRecord rec1 = new debtRecord();
		debtRecord rec2 = new debtRecord();
		debtRecord rec3 = new debtRecord();
		debtRecord rec4 = new debtRecord();
		debtRecord rec5 = new debtRecord();
		debtRecord rec6 = new debtRecord();
		debtRecord rec7 = new debtRecord();
		debtRecord rec8 = new debtRecord();
		debtRecord rec9 = new debtRecord();
		debtRecord rec10 = new debtRecord();
		
		rec1.borrower = "Jeff";
		rec1.lender = "Ivy";
		rec1.amount = 3;

		rec2.borrower = "Jeff";
		rec2.lender = "Greg";
		rec2.amount = 6;
		
		rec3.borrower = "Ivy";
		rec3.lender = "Casey";
		rec3.amount = 5;

		rec4.borrower = "Ellen";
		rec4.lender = "Casey";
		rec4.amount = 4;
		
		rec5.borrower = "Alex";
		rec5.lender = "Jeff";
		rec5.amount = 8;
		
		rec6.borrower = "Ivy";
		rec6.lender = "Ellen";
		rec6.amount = 8;
		
		rec7.borrower = "Ivy";
		rec7.lender = "Casey";
		rec7.amount = 4;
		
		rec8.borrower = "Ivy";
		rec8.lender = "Alex";
		rec8.amount = 2;
		
		rec9.borrower = "Frank";
		rec9.lender = "Ivy";
		rec9.amount = 8;
		
		rec10.borrower = "Casey";
		rec10.lender = "David";
		rec10.amount = 4;
		List<debtRecord> records = List.of(rec1,rec2,rec3,rec4,rec5,rec6,rec7,rec8,rec9,rec10);
//		List<debtRecord> records = new ArrayList<>();
		System.out.println(minimumDebtMembers(records));
	}
	
	// Method
	public static List<String> minimumDebtMembers(List<debtRecord> records){

        List<String> list2 = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        Comparator<Entry<String, Integer>> valueComparator = new Comparator<Entry<String,Integer>>() {    
            @Override
            public int compare(Entry<String, Integer> m1, Entry<String, Integer> m2) {
                return m2.getValue().compareTo(m1.getValue());
            }
        };
        
		
		for(debtRecord x: records) {
			map.put(x.borrower, map.getOrDefault(x.borrower, 0) -  x.amount);
			map.put(x.lender, map.getOrDefault(x.lender, 0) + x.amount);
		}
		List<Entry<String, Integer>> list = new ArrayList<>();
		for(Entry<String,Integer> x:map.entrySet()) {
			if(x.getValue() < 0) {
				list.add(x);
			}
		}
		
		if(map.size() == 0) {
			list2.add("None");
			return list2;
		}
		
		
		Collections.sort(list,valueComparator);
		list2.add(list.get(list.size()-1).getKey());
		int temp = list.get(list.size()-1).getValue();
		list.remove(list.size()-1);
		for(int i = list.size()-1; i >= 0; i-- ){
		    if(list.get(i).getValue() == temp) {
		    	list2.add(list.get(i).getKey());
		    }
		}
		
		
		return list2;
    }
	
	

}

// If no constructor is specify then it has one automatically as an empty constructor
 class debtRecord{
    public  String borrower = ""; // importer
    public  String lender = ""; //exporter
    int amount = 0;
    

}
