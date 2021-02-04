package amazonstuff;
import java.util.*;
public class LRUCachMissCount {

	public static void main(String[] args) {
		int maxCacheSize = 5;
		int num = 6;
		List<Integer> pages = List.of(1, 6, 3, 7, 1, 9, 3, 6, 4, 8);
		long startTime = System.nanoTime();
		System.out.println(lruCacheMiss(num,pages,maxCacheSize));
		long endTime   = System.nanoTime();
		long totalTime = (endTime - startTime);
		System.out.println(totalTime);

	}
	
	// You can only implement ENQUEUE and DEQUEUE using a linkedlist
	public static int lruCacheMiss(int num, List<Integer> pages, int maxCacheSize) {
		int count = 0;
		LinkedList<Integer> que = new LinkedList<>();
		for(int i = 0; i < pages.size(); i++) {
			if(!que.contains(pages.get(i))) {
				if(que.size() < maxCacheSize) {
					count++;
				}else {
					que.remove();
					count++;
				}
			}else{
				que.remove(que.get(que.indexOf(pages.get(i))));
			}
			
					
			que.add(pages.get(i));
					
				
			}
	
		
		return count;
	}

}
