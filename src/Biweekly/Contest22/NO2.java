package Biweekly.Contest22;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @author fengzhou <fengzhou@kuaishou.com>
 * Created on 2020-03-21
 */
public class NO2 {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {

        int res = 0;

        Map<Integer, int[]> map = new HashMap<>();

        for (int i = 1; i < n+1; i++) {
            map.put(i,new int[11]);
        }

        for (int[] i : reservedSeats) {

            if (map.containsKey(i[0])) {
                int[] temp = map.get(i[0]);
                temp[i[1]] = 1;
                map.put(i[0], temp);
            } else {
                int[] temp = new int[11];
                temp[i[1]] = 1;
                map.put(i[0], temp);
            }
        }

        for (Map.Entry<Integer, int[]> entry : map.entrySet()) {

            res = res + count(entry.getValue());

        }
        return res;
    }

    private int count(int[] entry) {

        if (entry[2] == 0 && entry[3] == 0 && entry[4] == 0 && entry[5] == 0 && entry[6] == 0 && entry[7] == 0
                && entry[8] == 0
                && entry[9] == 0) {
            return 2;
        }

        if (entry[2] == 0 && entry[3] == 0 && entry[4] == 0 && entry[5] == 0) {
            return 1;
        }

        if (entry[6] == 0 && entry[7] == 0 && entry[8] == 0 && entry[9] == 0) {
            return 1;
        }
        if (entry[4] == 0 && entry[5] == 0 && entry[6] == 0 && entry[7] == 0) {
            return 1;
        }

        return 0;

    }


}
