import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author fengzhou <fengzhou@kuaishou.com>
 * Created on 2020-03-20
 */
public class getLeastNumbers {

    public int[] getLeastNumbers(int[] arr, int k) {

        if (k == 0 || arr.length == 0 ) {
            return new int[0];
        }

        Queue<Integer> queue = new PriorityQueue<>((v1, v2) -> v2 - v1);

        for (int i : arr) {
            if(queue.size()<k){
                queue.offer(i);
            } else if (queue.peek()>i) {
                queue.poll();
                queue.offer(i);
            }
        }

        int [] res = new int[k];
        int index = 0;
        for(int i: queue){
            res[index++] = i;
        }

        return res;

    }

}
