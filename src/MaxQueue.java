import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * @author fengzhou <fengzhou@kuaishou.com>
 * Created on 2020-03-07
 */
public class MaxQueue {

    Queue<Integer> list;

    Deque<Integer> slaveList;

    public MaxQueue() {
        this.list = new LinkedList<>();
        this.slaveList = new ArrayDeque<>();
    }

    public void push_back(int value) {
        list.add(value);
        if (slaveList.size() == 0) {
            slaveList.add(value);
            return;
        }

        while (slaveList.size()>0 && slaveList.getLast() < value) {
            slaveList.pollLast();
        }
        slaveList.offerLast(value);
    }

    public int pop_front() {
        if (list.size() == 0) {
            return -1;
        }

        int res = list.poll();

        if (slaveList.size()>0 && res == slaveList.peek()){
            slaveList.poll();
        }

        {
            return res;
        }
    }

    public int max_value() {

        if (list.size() == 0) {
            return -1;
        } else {
            return slaveList.peek();
        }

    }

}
