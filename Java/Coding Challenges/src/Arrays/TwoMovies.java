package Arrays;
import java.util.*;

public class TwoMovies {
//	Users on longer flights like to start a second movie right when their first one ends, but they complain that the plane usually lands before they can see the ending. So you're building a feature for choosing two movies whose total runtimes will equal the exact flight length.
//
//	Write a method that takes an integer flightLength (in minutes) and an array of integers movieLengths (in minutes) and returns a boolean indicating whether there are two numbers in movieLengths whose sum equals flightLength.
//
//	When building your method:
//
//	Assume your users will watch exactly two movies
//	Don't make your users watch the same movie twice
//	Optimize for runtime over memory

// This problem is exactly like twosums.
// Given a target number that must reach, in this case the flight length, there will always be two movies that will equal to the flight length

// Create either a hashmap or a hashset to store the value.
	
// Method
// There will always be two movies that adds up to the total flight time
// Iterate throught the movies length
// then Create a hashset to add values that are not in the set.
// take the flight length and subtract it with the first value of the iteration to take the complement
// If hashset contains both values then return it else add it to the hashset

	public static void main(String[] args) {
		int[] ex1 = {100,200,300,400,600};
		int target1 = 800;
		int[] ex2 = {100,200,300,400,600};
		int target2 = 400;
		int[] ex3 = {100,200,300,400,600};
		int target3 = 4000;
		
		System.out.println(twoMovies(target1,ex1));
		System.out.println(twoMovies(target2,ex2));
		System.out.println(twoMovies(target3,ex3));
		

	}
	
	public static boolean twoMovies(int flightLength, int[] movieLengths) {
		Set<Integer> set = new HashSet<Integer>();
		
		for(int i = 0; i < movieLengths.length; i++) {
			int complement = flightLength - movieLengths[i];
			if(set.contains(complement)) {
				return true;
			}else {
				set.add(movieLengths[i]);
			}
		}
		return false;
	}

}
