package stack;
import java.util.Stack;
public class ValidParantheses {

	public static void main(String[] args) {
		

	}
	public static boolean validParentheses(String s) {
        Stack<Character> stk = new Stack<>();
        for(Character c : s.toCharArray()){
            if(c == '(' || c == '{' || c== '['){
                stk.push(c);
            }else{
                if(!stk.empty()){
                    if(c == ')'){
                        if(stk.peek() == '('){
                            stk.pop();
                        }else{
                            return false;
                        }
                    }else if(c == '}'){
                        if(stk.peek() == '{'){
                            stk.pop();
                        }else{
                            return false;
                        }
                    }else if(c == ']'){
                        if(stk.peek() == '['){
                            stk.pop();
                        }else{
                            return false;
                        }
                    }
                }else{
                    return false;
                }
            }
        }
        
        if(!stk.empty()){
            return false;
        }else{
            return true;
        }
	}

}
