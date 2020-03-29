package Weekly.Contest182;

import java.util.HashMap;
import java.util.Map;

/**
 * @author fengzhou <fengzhou@kuaishou.com>
 * Created on 2020-03-29
 */
public class findLucky {

    public int findLucky(int[] arr) {

        Map<Integer, Integer> map = new HashMap<>();

        int max = -1;

        for (int i : arr) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue().equals(entry.getKey())) {
                max = Math.max(max, entry.getValue());
            }
        }

        return max;
    }

}
