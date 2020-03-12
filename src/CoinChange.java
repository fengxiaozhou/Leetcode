import java.util.Arrays;

/**
 * @author fengzhou <fengzhou@kuaishou.com>
 * Created on 2020-03-08
 */
public class CoinChange {


    public static int coinChange(int[] coins, int amount) {

        int[] dp = new int[amount + 1];

        Arrays.fill(dp, amount+1);

        dp[0] = 0;

        for (int i = 0; i < dp.length; i++) {
            for (int j : coins) {
                if (i - j < 0) {
                    continue;
                }
                dp[i] = Math.min(dp[i - j] + 1, dp[i]);
            }
        }

        return dp[amount] == amount+1 ? -1 :dp[amount];
    }

    public static void main(String[] args) {
        int[] coins = new int[] {1, 2, 5};
        System.out.println(coinChange(coins, 11));
    }
}
