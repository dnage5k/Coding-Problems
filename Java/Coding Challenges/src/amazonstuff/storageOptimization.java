package amazonstuff;
import java.util.*;
public class storageOptimization {

	public static void main(String[] args) {
		int h = 3;
		int w = 2;
		int[] hc = {1,2,3};
		int[] vc = {1,2};
		System.out.println(sol(h,w,hc,vc));

	}
	
	public static int sol(int h, int w, int[] hc, int[] vc) {
		int maxHeight = 0;
		int maxWidth = 0;
		int range = 0;
		int pointer = 0;
		int temp = 0;
		Arrays.sort(hc);
		Arrays.sort(vc);
		for(int i = 1; i <= w + 1; i++) {
			if(pointer < vc.length) {
				temp = vc[pointer];
			}
			
			if(temp != i) {
				maxWidth = Math.max(maxWidth, i - range);
				range = i;
			}else {
				pointer++;
			}
			
		}
		
		pointer = 0;
		range = 0;
		for(int i = 1; i <= h + 1; i++) {
			if(pointer < hc.length) {
				temp = hc[pointer];
			}
			
			if(temp != i) {
				maxHeight = Math.max(maxHeight, i - range);
				range = i;
			}else {
				pointer++;
			}
		}
		
		return maxHeight * maxWidth;
	}

}
