package amazonstuff;

// WORkING ON THIS PROBLEM STILL
import java.util.*;

public class FiveStarSellers {

	public static void main(String[] args) {
		int ratingsThreshold = 77;
		int[][] productRatings = {{4,4},
								 {1,2},
								 {3,6}};
		System.out.println(fiveStarReviews(productRatings, ratingsThreshold));
	}
	
	public static int fiveStarReviews(int[][] productRatings, int ratingsThreshold) {
		int count = 0;
		double rating = 0;
		final Comparator<Integer[][]> compare = new Comparator<Integer[][]>() {
			@Override
			public int compare(Integer[][] o1, Integer[][] o2) {
				return o1[0][0]/o1[0][1].compareTo(o2[0][0]/o2[0][1]);
			}
		};
		
		Arrays.sort(productRatings, compare);
		for(int i = 0; i < productRatings.length;i++) {
			for(int j = 0; j < productRatings[i].length; j++ ) {
				System.out.print(productRatings[i][j]);
			}
			System.out.println();
		}
		
		for(int i = 0; i < productRatings.length; i++) {
			rating = rating + ((double)productRatings[i][0] / (double)productRatings[i][1] * 100);
			
			
		}
////		System.out.println(rating);
		System.out.println(rating/productRatings.length);
		
		return count;
	}

}
