import java.util.Stack;

/**
 * @author fengzhou <fengzhou@kuaishou.com>
 * Created on 2020-03-16
 */
public class CompresStringLcci {

    public String compressString(String S) {

        if (S.length() == 0) {
            return "";
        }

        Stack<Character> stack = new Stack<>();

        char[] s = S.toCharArray();

        StringBuilder res = new StringBuilder();

        int temp = 0;

        for (char c : s) {
            if (stack.empty()) {
                stack.push(c);
                temp++;
            }else if (c == stack.peek()) {
                temp++;
            } else {
                res.append(stack.pop());
                res.append(temp);
                stack.push(c);
                temp = 1;
            }
        }
        res.append(stack.pop()).append(temp);

        return res.length() < S.length() ? res.toString() : S;

    }

}
