package Weekly.Contest203;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class No1 {
    public List<Integer> mostVisited(int n, int[] rounds) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < rounds.length - 2; i++) {
            help(rounds[i], rounds[i + 1], n, map);
        }

        helpLast(rounds[rounds.length-2],rounds[rounds.length-1],n,map);

        int max = Integer.MIN_VALUE;
        List<Integer> list = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            max = Math.max(entry.getValue(), max);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == max) {
                list.add(entry.getKey());
            }
        }

        list.sort((o1, o2) -> o1 - o2);

        return list;

    }

    private void helpLast(int a, int b, int n, HashMap<Integer, Integer> map) {
        if (b > a) {
            for (int i = a; i <= b; i++) {
                if (map.containsKey(i)) {
                    map.put(i, map.get(i) + 1);
                } else {
                    map.put(i, 1);
                }
            }
        }else{
            for (int i = 1; i <= b; i++) {
                if (map.containsKey(i)) {
                    map.put(i, map.get(i) + 1);
                } else {
                    map.put(i, 1);
                }
            }
            for (int i = a ; i <=n; i++) {
                if (map.containsKey(i)) {
                    map.put(i, map.get(i) + 1);
                } else {
                    map.put(i, 1);
                }
            }
        }
    }

    private void help(int a, int b, int n, HashMap<Integer, Integer> map) {

        if (b > a) {
            for (int i = a ; i < b; i++) {
                if (map.containsKey(i)) {
                    map.put(i, map.get(i) + 1);
                } else {
                    map.put(i, 1);
                }
            }
        } else {
            for (int i = 1; i < b; i++) {
                if (map.containsKey(i)) {
                    map.put(i, map.get(i) + 1);
                } else {
                    map.put(i, 1);
                }
            }
            for (int i = a ; i <= n; i++) {
                if (map.containsKey(i)) {
                    map.put(i, map.get(i) + 1);
                } else {
                    map.put(i, 1);
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(new No1().mostVisited(4, new int[]{1,3,1,2}));
    }
}
