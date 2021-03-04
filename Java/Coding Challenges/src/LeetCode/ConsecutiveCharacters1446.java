package LeetCode;

public class ConsecutiveCharacters1446 {

	public static void main(String[] args) {
		int max = 0;
		
	}
	
	public static int maxPower1(String s) {
		int count = 0;
        int max = 0;
        int p0 = 0;
        int p1 = 0;
        while(p0 < s.length() && p1 < s.length()){
            if(s.charAt(p0) == s.charAt(p1)){
                count++;
                p1++;
                max = Math.max(count, max);
            }else{
                count = 0;
                p0 = p1;
            }
            
        }
        return max;
	}
	
	public static int maxPower2(String s) {
		int max = 1;
		int count = 1;
		for(int i = 1; i < s.length(); i++) {
			if(s.charAt(i) == s.charAt(i-1)){
				count++;
				max = Math.max(max, count);
			}else {
				count = 1;
			}
		}
		
		return max;
		
	}

}
