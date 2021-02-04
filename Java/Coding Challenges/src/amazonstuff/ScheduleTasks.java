package amazonstuff;
import java.util.*;
public class ScheduleTasks {

	public static void main(String[] args) {
		int num = 5;
		Integer[] power = {4,2,8,3,5};
		int tasks = 19;
		System.out.println(scheduleTasks(num,power,tasks));
	}
	
	// time complexity O(nlogn) space: O(n)
	public static int scheduleTasks(int num, Integer[] power, int tasks) {
		int sec = 0;
		Arrays.sort(power, Collections.reverseOrder());
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i < power.length; i++) {
			list.add(power[i]);
		}
		int i = 0;
		
//		int taskNum = tasks;
		while(tasks > 0) {
			if(list.contains(tasks)) {
				tasks = tasks - list.get(list.indexOf(tasks));
				sec++;
				break;
			}
			if(list.get(i) < list.get(i+1)) {
				i++;
			}
			tasks -= list.get(i);
			list.set(i, (list.get(i)/2));
			sec++;
			
		}
		
		return sec;
	}

}
