package amazonstuff;
import java.util.*;
public class TrasactionLogs {

	public static void main(String[] args) {
		String[] logs = {"88 99 200", "88 99 300", "99 32 100", "12 12 15"};
		int threshold = 2;
		System.out.println(Arrays.toString(transactionLogs(logs,threshold)));

	}
	
	public static String[] transactionLogs(String[] logs, int threshold) {
		Map<String, Integer> map = new HashMap<>();
		List<String> list = new ArrayList<>(); 
		int counter = 0;
		for(int i = 0; i < logs.length; i++) {
			String[] split = logs[i].split(" ");
			String temp = "";
			for(int j = 0; j < 2; j++) {
				if(!temp.equals(split[j])) {
					map.put(split[j], map.getOrDefault(split[j], 0)+1);
				}
				temp = split[j];
			}
		}
		
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
			if(entry.getValue() >= threshold) {
				list.add(entry.getKey());
			}
		}
		String[] output = new String[list.size()];
		for(int i = 0; i < list.size(); i++) {
			output[i] = list.get(i);
		}
		
		return output;
	}

}
