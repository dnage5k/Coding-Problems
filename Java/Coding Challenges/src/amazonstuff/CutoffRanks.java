package amazonstuff;
import java.util.*;
public class CutoffRanks {

	public static void main(String[] args) {
		int coutOffRank = 4;
		int[] scores = {2,2,3,4,5};
		int num = scores.length;
		System.out.println(cutOffRanks(coutOffRank,num,scores));

	}
	
	public static int cutOffRanks(int cutOffRank, int num, int[] scores) {
		Arrays.sort(scores);
		int count = 1;
		int ppl = 0;
		int temp= -1;

		for(int i = num-1; i >= 0;i--) {
			if(scores[i] == temp) {
				temp = scores[i];
				scores[i] = scores[i+1];
				count++;
				if(scores[i] > cutOffRank) {
					break;
				}else {
					ppl++;
				}
			}else {
				temp = scores[i];
				scores[i] = count++;
				if(scores[i] > cutOffRank) {
					break;
				}else {
					ppl++;
				}
				
			}
			
			
		}
		return ppl;
	}

}
