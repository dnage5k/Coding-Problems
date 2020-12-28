package stack;
import java.util.*;
public class RemoveOuterMost1021 {
// 		problem
	
// 		Input: "(()())(())"
//		Output: "()()()"
//		Explanation: 
//		The input string is "(()())(())", with primitive decomposition "(()())" + "(())".
//		After removing outer parentheses of each part, this is "()()" + "()" = "()()()".
//		Example 2:
//
//		Input: "(()())(())(()(()))"
//		Output: "()()()()(())"
//		Explanation: 
//		The input string is "(()())(())(()(()))", with primitive decomposition "(()())" + "(())" + "(()(()))".
//		After removing outer parentheses of each part, this is "()()" + "()" + "()(())" = "()()()()(())".
//		Example 3:
//
//		Input: "()()"
//		Output: ""
//		Explanation: 
//		The input string is "()()", with primitive decomposition "()" + "()".
//		After removing outer parentheses of each part, this is "" + "" = "".
	
	
	public static void main(String[] args) {
		String s = "(())()()((())())";
		System.out.println(sol(s));

	}
	
	public static String sol(String s) {
		StringBuilder s2 = new StringBuilder();
		Stack<Character> stk = new Stack<>();
		
		for(char c : s.toCharArray()) {
			if(c == '(') {
				if(!stk.empty()) {
					s2.append(c);
				}
				stk.push(c);
				
			}else{
				stk.pop();
				if(!stk.empty()) {
					s2.append(c);
				}
			}
		}
		
		return s2.toString();
	}

}
