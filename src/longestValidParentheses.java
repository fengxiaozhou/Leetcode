import java.util.Stack;

public class longestValidParentheses {

	public static void main(String[] args) {
        System.out.println(longestValidParentheses("())(())("));
	}
	
    public static int longestValidParentheses(String s) {
        int max=0;
        int left=-1;
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(') stack.push(i);
            else {
                if(stack.isEmpty()) left=i;
                else {
                    stack.pop();
                    if(stack.isEmpty())
                        max=Math.max(max,i-left);
                    else max=Math.max(max,i-stack.peek());
                }
            }
        }
        return max;
    }
}
