import java.util.HashSet;
import java.util.Set;

public class minCostTickets {
    public int minCostTickets(int[] days, int[] costs) {

        int lastDay = days[days.length - 1];
        int dp[] = new int[lastDay + 1];
        dp[0] = 0;
        Set<Integer> ds = new HashSet<>();
        for (int i : days) {
            ds.add(i);
        }

        for (int i = 1; i <= lastDay; i++) {
            if (!ds.contains(i)) {
                dp[i] = dp[i - 1];
            } else {
                int a = dp[i - 1] + costs[0];
                int b;
                int c;
                if (i - 7 >= 0) {
                    b = dp[i - 7] + costs[1];
                } else {
                    b = costs[1];
                }
                if (i - 30 >= 0) {
                    c = dp[i - 30] + costs[2];
                } else {
                    c = costs[2];
                }
                dp[i] = Math.min(a, b);
                dp[i] = Math.min(dp[i], c);
            }
        }
        return dp[lastDay];
    }

    public static void main(String[] args) {
        System.out.println(new minCostTickets().minCostTickets(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 30, 31}, new int[]{2, 7, 15}));
    }
}
