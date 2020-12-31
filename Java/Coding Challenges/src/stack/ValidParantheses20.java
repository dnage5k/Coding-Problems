package stack;
import java.util.Stack;
public class ValidParantheses20 {

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
	
	// Cleaner Version
	// I cleaned up the code above
	// Instead of checking if the c is the closed braces i could directly check which closed c it is
	// The reason is because there is only two choices its either opened or closed so the else case is can be condensed that it will be a closed one
	// I incorporate checking c and the top of the stack to see if they match instead of checking it with two separate if statements
	
	// Method
	// Create a stack
	// iterate through the array to see if its an opened bracket or closed bracket
	// if its open then push it in the stack
	// if its close bracket, check to see if the stack is empty. If its empty return false because we know that there is no open brackets to compliment the close brackets 
	// if its not empty then store the iteration value into a variable
	// check if the top of the stack value corresponds with the closed bracket, if it does then pop else return false
	// Lastly, check if the stack is not empty, if it is not empty then that means that there were only open brackets so return false
	// else return true
	public static boolean cleanerVersion(String s) {
		Stack<Character> stk = new Stack<>();
        for(Character c : s.toCharArray()){
            if(c == '(' || c == '{' || c== '['){
                stk.push(c);
            }else{
                if(!stk.empty()){
                    char val = stk.peek();
                    if(val == '(' && c == ')'){
                        stk.pop();
                    }else if(val == '{' && c == '}'){
                        stk.pop();
                    }else if(val == '[' && c == ']'){
                        stk.pop();
                    }else {
                        return false;
                    }
        
                }else{
                    return false;
                }
            }
        }
        
        if(!stk.empty()) {
        	return false;
        }else {
        	return true;
        }
	}

}
