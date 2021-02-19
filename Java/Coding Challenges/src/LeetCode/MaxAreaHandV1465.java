package LeetCode;
import java.util.*;
public class MaxAreaHandV1465 {

	public static void main(String[] args) {
		int h = 5;
		int w = 4;
		int[] hc = {3,1};
		int[] vc = {1};
		System.out.println(maxArea(h,w,hc,vc));

	}
	
	/*
	 * Purpose:
	 * The purpose of this problem is to find the maximum area given two arrays containing vertical and horizontal cuts.
	 * 
	 * Method:
	 * Create a maxV and a maxH variable to store highest value of the width and highest value of the height when cut
	 * sort the arrays in so we can iterate through the loop accordingly
	 * 
	 * iterate through each cuts to find the maximum height and width
	 * compare current high and new high every then store prev as the new cut
	 * 
	 * do the same for horizontal cuts the return the multiplication of maxH and maxV
	 */
	public static int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        int maxV = 0;
        int maxH = 0;
        int high = 0;
        int prev = 0;
        int highestV = 0;
        int highestH = 0;
        
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
        
        for(int i = 0; i < verticalCuts.length; i++) {
        	high = Math.max(high, verticalCuts[i] - prev);
        	prev = verticalCuts[i];
        }
        
        maxV = Math.max(high, w - verticalCuts[verticalCuts.length-1]);
        high = 0;
        prev = 0;
        
        for(int i = 0; i < horizontalCuts.length; i++) {
        	high = Math.max(high, horizontalCuts[i] - prev);
        	prev = horizontalCuts[i];
        }
        
        maxH = Math.max(high, h - horizontalCuts[horizontalCuts.length-1]);
        
        return maxV*maxH;
    }

}
