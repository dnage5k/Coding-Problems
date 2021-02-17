package LeetCode;

public class MaxAreaHandV {

	public static void main(String[] args) {
		int h = 5;
		int w = 4;
		int[] hc = {3,1};
		int[] vc = {1};
		System.out.println(maxArea(h,w,hc,vc));

	}
	
	public static int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        int maxV = 0;
        int maxH = 0;
        int high = 0;
        int prev = 0;
        int highestV = 0;
        int highestH = 0;
        
        for(int i = 0; i < verticalCuts.length; i++) {
        	
        	highestV = Math.max(highestV, verticalCuts[i]);
        	high = Math.max(high, verticalCuts[i] - prev);
        	prev = verticalCuts[i];
        	
        	
        }
        maxV = Math.max(high, w - highestV);
        high = 0;
        prev = 0;
        for(int i = 0; i < horizontalCuts.length; i++) {
        	highestH = Math.max(highestH, horizontalCuts[i]);
        	high = Math.max(high, horizontalCuts[i] - prev);
        	prev = horizontalCuts[i];
        }
        maxH = Math.max(high, h - highestH);
        
        return maxV*maxH;
    }

}
