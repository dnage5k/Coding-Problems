package Arrays;
import java.util.*;
public class MergeMeetingTime {
	
	public static class Meeting{
		 private int startTime;
		 private int endTime;

		    public Meeting(int startTime, int endTime) {
		        // number of 30 min blocks past 9:00 am
		        this.startTime = startTime;
		        this.endTime   = endTime;
		    }

		    public int getStartTime() {
		        return startTime;
		    }

		    public void setStartTime(int startTime) {
		        this.startTime = startTime;
		    }

		    public int getEndTime() {
		        return endTime;
		    }

		    public void setEndTime(int endTime) {
		        this.endTime = endTime;
		    }
		    
		    @Override
		    public String toString() {
		    	return ("("+this.getStartTime()+ ", " + this.getEndTime() + ")");
		    }
	}
	
	//  [Meeting(0, 1), Meeting(3, 5), Meeting(4, 8), Meeting(10, 12), Meeting(9, 10)]

    //  [Meeting(0, 1), Meeting(3, 8), Meeting(9, 12)]
	
	// Sorted
	// [Meeting(0,1) Meeting(3,5) Meeting(4,8) Meeting(9,10) Meeting(10,12)]
	
	public static List<Meeting> sortedMeetings(List<Meeting> meetings){
		// First Sort the list
		// then grab the beginning time as your starting value
		// if the beginning time is less than end time of the first one grabbed, then
		// compare both ending times to see which is bigger
		
		// Sort by start time first
		Collections.sort(meetings, new Comparator<Meeting>(){
			@Override
			public int compare(Meeting one, Meeting two) {
				return one.getStartTime() - two.getStartTime();
			}
		});
		
		// Sorted now, time to compare starting time the curr meeting vs next meeting
		
		List<Meeting> arrangedMeetings = new ArrayList<>();
		arrangedMeetings.add(meetings.get(0));
		
		for(Meeting currMeeting : meetings) {
			Meeting lastMeeting = arrangedMeetings.get(arrangedMeetings.size()-1);
			
			if(currMeeting.getStartTime() <= lastMeeting.getEndTime()) {
				lastMeeting.setEndTime(Math.max(currMeeting.getEndTime(), lastMeeting.getEndTime()));
			}else {
				arrangedMeetings.add(currMeeting);
			}
		}
		return arrangedMeetings;
	}
	
	public static void main(String[] args) {
		List<Meeting> list = new ArrayList<Meeting>();
		list.add(new Meeting(0,1));
		list.add(new Meeting(3,5));
		list.add(new Meeting(4,8));
		list.add(new Meeting(10,12));
		list.add(new Meeting(9,10));
		
		System.out.println(list.toString());
		System.out.println(sortedMeetings(list));
	}
	

}


