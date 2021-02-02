package amazonstuff;

public class MarsRover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] cmds = {"RIGHT", "UP", "DOWN", "LEFT", "DOWN", "DOWN"};
		String[] cmds2 = {"RIGHT", "RIGHT", "DOWN", "UP", "LEFT", "LEFT"};
		
		int n = 3;
//		System.out.println(roverControl(cmds, n));
		System.out.println(roverControl(cmds2, n));
	}
	/* Purpose
	 * 
	 */
	
	// Method
	// Move the robot
	public static int roverControl(String[] cmds, int n) {
		int roverLocation = 0;
		int totalSpaces = (int) (Math.pow(n, 2));
		for(String x : cmds) {
			if(x == "UP"  && roverLocation - n > 0) {
				roverLocation -= n;
			}else if(x == "RIGHT" && (roverLocation + 1)  % n != 0) {
				roverLocation += 1;
			}else if(x == "DOWN" && roverLocation + n < totalSpaces) {
				roverLocation += n;
			}else if(x == "LEFT" && roverLocation % n != 0){
				roverLocation -= 1;
			}
		}
		
		return roverLocation;
	}

}
