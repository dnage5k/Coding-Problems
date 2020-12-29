package tiktokquestions;

import java.math.BigInteger;

import java.util.*;
public class PlusOne {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
//		for(int i = 0; i < 10; i++) {
//			list.add(3);
//		}
		
		list = Arrays.asList(1,0,0,1);
		System.out.println(plusOne(list));

	}
	
	public static String plusOne(List<Integer> m) {
		StringBuilder s = new StringBuilder();
		m = new ArrayList<>(m);
		for(int i = m.size()-1; i >= 0; i--) {
			if((m.get(i) + 1) % 10 == 0) {
				m.set(i, 0);
				if(i == 0) {
					m.add(0, 1);
				}
			}else {
				m.set(i, m.get(i)+1);
				break;
			}
		}
		
		for(Integer i : m) {
			s.append(i);
		}
		
		
		
		return s.toString();
		
	}

}
