import java.util.Arrays;

/**
 * @author fengzhou <fengzhou@kuaishou.com>
 * Created on 2021-04-21
 */
public class NumDecodings {
    public int numDecodings(String s) {
        char[] chars = s.toCharArray();
        int[] dp = new int[s.length() + 1];
        Arrays.fill(dp, 0);
        dp[0] = 1;
        for (int i = 1; i <= s.length(); i++) {
            if (chars[i - 1] != '0') {
                dp[i] += dp[i - 1];
            }
            if (i > 1 && chars[i - 2] > '0' && ((s.charAt(i - 2) - '0') * 10 + (s.charAt(i - 1) - '0') <= 26)) {
                dp[i] += dp[i - 2];
            }
        }
        return dp[s.length()];
    }
}
