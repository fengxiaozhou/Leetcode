package Biweekly.Contest22;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author fengzhou <fengzhou@kuaishou.com>
 * Created on 2020-03-21
 */
public class NO3 {

    public int getKth(int lo, int hi, int k) {


        Queue<NUM> res = new PriorityQueue<>(
                (r1, r2) -> {
                    if (r1.getCount() == r2.getCount()) {
                        return r1.getNum() - r2.getNum();
                    }
                    return r1.getCount() - r2.getCount();
                }
        );


        List<NUM> list = new ArrayList<>();

        list.sort((r1, r2) -> {
            if (r1.getCount() == r2.getCount()) {
                return r1.getNum() - r2.getNum();
            }
            return r1.getCount() - r2.getCount();
        });


        for (int i = lo; i <= hi; i++) {
            NUM temp = new NUM();
            temp.setNum(i);
            temp.setCount(count(i, 0));
            if (res.size() < k) {
                res.offer(temp);
            } else {
                if (temp.getCount() <= res.peek().getCount()) {
                    res.poll();
                    res.offer(temp);
                }
            }
        }

        while (--k > 0) {
            res.poll();
        }
        return res.poll().getNum();
    }


    class NUM {
        int num;
        int count;

        public int getNum() {
            return num;
        }

        public void setNum(int num) {
            this.num = num;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }
    }

    private static int count(int i, int count) {

        if (i == 1) {
            return count;
        }

        if (i % 2 == 0) {
            return count(i / 2, count + 1);
        } else {
            return count(i * 3 + 1, count + 1);
        }

    }


    public static void main(String[] args) {
        System.out.println(new NO3().getKth(10, 20, 5));
    }

}
