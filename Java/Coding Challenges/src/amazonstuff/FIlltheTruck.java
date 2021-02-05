package amazonstuff;
import java.util.*;
public class FIlltheTruck {

	public static void main(String[] args) {
		int num = 3;
		int[] containers = {2,2,3,1,1};
		int itemSize = 3;
		int cargoSize = 20;
		int[] itemsPerContainer = {2,3,5,1,5};
		System.out.println(maximumCargo(num,containers, itemSize, itemsPerContainer, cargoSize));
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
	
	

}
