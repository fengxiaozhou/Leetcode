import java.util.Stack;

public class ValidParentheses {
	public static void main(String[] args) {
		Solution20 s=new Solution20();
		System.out.println(s.isValid("{(]{)}"));
	}
	

}
class Solution20{
	public boolean isValid(String s){
	    Stack<Character> stack = new Stack<Character>();  
	    for (char c : s.toCharArray()) {  
	        if (c == '(')  
	            stack.push(')');  
	        else if (c == '{')  
	            stack.push('}');  
	        else if (c == '[')  
	            stack.push(']');  
	        else if (stack.isEmpty() || stack.pop() != c)  
	            return false;  
	    }  
	    return stack.isEmpty();  
	}
}	
