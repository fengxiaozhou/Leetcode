import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * @author fengzhou <fengzhou@kuaishou.com>
 * Created on 2020-03-01
 */
public class MyStack {

    private static List list;

    private static int end;

    /**
     * Initialize your data structure here.
     */
    public MyStack() {
        list = new ArrayList();
        end = 0;
    }

    /**
     * Push element x onto stack.
     */
    public void push(int x) {

        list.add(x);
        end++;
    }

    /**
     * Removes the element on top of the stack and returns that element.
     */
    public int pop() {

        end--;
        int res = (int)list.remove(end);
        return res;
    }

    /**
     * Get the top element.
     */
    public int top() {
        int temp = end;
        return (int)list.get(--temp);
    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty() {
        return list.size() == 0;
    }

    public static void main(String[] args) {
        MyStack stack = new MyStack();

        stack.push(1);
        stack.push(2);
        System.out.println(stack.top());
        System.out.println(stack.pop());
        System.out.println(stack.empty());
    }
}
