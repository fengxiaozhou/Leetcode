import java.lang.reflect.Array;
import java.util.*;

public class frogJump {

    public boolean canCross(int[] stones) {

        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < stones.length; i++) {
            map.put(stones[i], new ArrayList<>());
        }

        map.get(stones[0]).add(0);


        for (int i = 0; i < stones.length; i++) {
            for (int k : map.get(stones[i])) {
                for (int step = k - 1; step <= k + 1; step++) {
                    if (step > 0 && map.containsKey(stones[i] + step)) {
                        map.get(stones[i] + step).add(step);
                    }
                }
            }
        }

        return map.get(stones[stones.length - 1]).size() > 0;
    }


    public boolean canCross2(int[] stones) {

        int len = stones.length;

        if (stones[1] != 1) {
            return false;
        }

        boolean[][] dp = new boolean[len][len + 1];
        dp[0][0] = true;
        for (int i = 1; i < len; i++) {
            for (int j = 0; j < i; j++) {
                int k = stones[i] - stones[j];
                if (k <= i) {
                    dp[i][k] = dp[j][k - 1] || dp[j][k] || dp[j][k + 1];
                    if (i == len - 1 && dp[i][k]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
