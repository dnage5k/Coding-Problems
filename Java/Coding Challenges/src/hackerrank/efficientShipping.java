package hackerrank;
import java.util.*;
import java.util.Map.Entry;;


public class efficientShipping {
	public static void main(String[] args) {
		List<Long> boxes = new ArrayList<Long>();
		boxes.add((long) 4);
		boxes.add((long) 3);
		boxes.add((long) 1);
		List<Long> unitsPerBox = new ArrayList<Long>();
		unitsPerBox.add((long) 2);
		unitsPerBox.add((long) 7);
		unitsPerBox.add((long) 4);
		int truckSize = 6;
		System.out.println(unitsShipped(boxes,unitsPerBox,truckSize));
	}
	
	public static int unitsShipped(List<Long> boxes, List<Long> unitsPerBox, int truckSize) {
		int shipped = 0;
		Map<Integer, Long> map = new HashMap<>();
		for(int i = 0; i < boxes.size(); i++) {
			map.put(i, unitsPerBox.get(i));
		}
		
		
		// Created Comparator method to sort hashmap
		Comparator<Entry<Integer, Long>> valueComparator = new Comparator<Entry<Integer,Long>>() {
            
            @Override
            public int compare(Entry<Integer, Long> m1, Entry<Integer, Long> m2) {
                return m2.getValue().compareTo(m1.getValue());
            }
        };
        List<Entry<Integer, Long>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list,valueComparator);
		
        for(Entry<Integer, Long> a : list) {
        	truckSize -= boxes.get(a.getKey());
        	shipped =  shipped + (int) (a.getValue() * boxes.get(a.getKey()));
        	if(truckSize <= 0) {
        		shipped =  shipped - (int) (-truckSize * a.getValue());
        		return shipped;
        	}
        }
		return shipped;
	}

}
