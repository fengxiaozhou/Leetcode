package Weekly.Contest180;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author fengzhou <fengzhou@kuaishou.com>
 * Created on 2020-03-15
 */
public class CustomStack {

    private static Stack<Integer> stack;

    private static int max;

    public CustomStack(int maxSize) {
        stack = new Stack<>();
        max = maxSize;
    }

    public void push(int x) {

        if (stack.size() < max) {
            stack.push(x);
        } else {

        }
    }

    public int pop() {
        if (stack.empty()) {
            return -1;
        } else {
            return stack.pop();
        }
    }

    public void increment(int k, int val) {

        List<Integer> res = new ArrayList<>();

        while (!stack.empty()) {
            res.add(stack.pop());
        }
        if (k >= res.size()) {
            for(int i = res.size() - 1; i >= 0; i--){
                res.set(i, res.get(i) + val);

            }
        } else {
            for (int i = res.size() - 1; i >= res.size() - k; i--) {
                res.set(i, res.get(i) + val);
            }
        }

        for(int i = res.size() - 1; i >= 0; i--){
            stack.push(res.get(i));
        }
    }

    public static void main(String[] args) {
        CustomStack s =new CustomStack(3);
        s.push(1);
        s.push(2);
        System.out.println(s.pop());
        s.push(2);
        s.push(3);
        s.push(4);
        s.increment(5,100);
        s.increment(2,100);
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());

    }
}
