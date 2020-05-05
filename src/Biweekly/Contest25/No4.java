package Biweekly.Contest25;

import java.lang.reflect.Array;
import java.util.*;

public class No4 {
    public int numberWays(List<List<Integer>> hats) {
        long count = 0;
        Set<Integer> mem;
        for (int i = 0; i < hats.get(0).size(); i++) {
            mem = new HashSet<>();
            mem.add(hats.get(0).get(i));
            int everyTime = 1;
            for (int j = 1; j < hats.size(); j++) {
                int everyNum = 0;
                for (int k:hats.get(j)) {
                    if(!mem.contains(k)){
                        everyNum++;
                        mem.add(k);
                    }
                }
                everyTime = everyTime*everyNum;
            }
            count = count+everyTime;
        }
        return (int)count%(1000000007);
    }

    public static void main(String[] args) {
        List<Integer> t1 = Arrays.asList(3,4);
        List<Integer> t2 = Arrays.asList(5,4);
        List<Integer> t3 = Arrays.asList(5);

        List<List<Integer>> hats = Arrays.asList(t1,t2,t3);

        System.out.println(new No4().numberWays(hats));
    }
}
