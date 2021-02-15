package amazonstuff;
import java.util.*;
import java.util.Map.Entry;
public class FIlltheTruck {

	public static void main(String[] args) {
		int num = 3;
		int[] containers = {3,2,1};
		int itemSize = 3;
		int cargoSize = 3;
		int[] itemsPerContainer = {1,2,3};
		

		System.out.println(efficientWay(num,containers, itemSize, itemsPerContainer, cargoSize));
	}
	
	public static int maximumCargo(int num, int[] containers, int itemSize, int[] itemsPerContainer, int cargoSize) {
		int max = 0;
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i < containers.length; i++) {
			for(int j = 0; j < containers[i]; j++) {
				list.add(itemsPerContainer[i]);
			}
		}

		Collections.sort(list);
		int i = list.size()-1;
		while(cargoSize > 0) {
			if(i < 0) {
				break;
			}
			max += list.get(i);
			i -= 1;
			cargoSize -=1;
		
		}
	
		return max;
	}
	
	public static int efficientWay(int num, int[] containers, int itemSize, int[] itemsPerContainer, int cargoSize) {
		int max = 0;
		Map<Integer, Integer> map = new HashMap<>();
		Comparator<Entry<Integer, Integer>> valueComparator = new Comparator<Entry<Integer,Integer>>() {
            
            @Override
            public int compare(Entry<Integer, Integer> m1, Entry<Integer, Integer> m2) {
                return m2.getValue().compareTo(m1.getValue());
            }
        };
        
        for(int i = 0; i < containers.length; i++) {
        	map.put(i, itemsPerContainer[i]);
        }
        List<Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, valueComparator);
		
		for(Entry<Integer, Integer> x: list) {
			cargoSize -= containers[x.getKey()];
			max += x.getValue() * containers[x.getKey()];
			if(cargoSize <= 0) {
				max -= x.getValue()*Math.abs(cargoSize);
				break;
			}
		}
		return max;
	}
	
//	public static int maxHeap(int num, int[] containers, int itemSize, int[] itemsPerContainer, int cargoSize) {
//		
//	}
	
	public static void max_heapify(int[] arr, int i, int n) {
		int largest;
		int left = 2*i;
		int right = 2*i + 1;
		if(left <= n && arr[left] > arr[i]) {
			largest = left;
		}
	}

}
