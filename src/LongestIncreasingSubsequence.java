/**
 * @author fengzhou <fengzhou@kuaishou.com>
 * Created on 2020-03-14
 */
public class LongestIncreasingSubsequence {

    public int lengthOfLIS(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return 1;
        }

        int len = nums.length;

        int[] dp = new int[nums.length];
        dp[0] = 1;

        int max = 1;

        for (int i = 0; i < len; i++) {
            int temp = 0;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    temp = Math.max(temp, dp[j]);
                }
            }
            dp[i] = temp+1;
            max = Math.max(max,dp[i]);
        }

        return max;


    }

    public static void main(String[] args) {
        System.out.println(new LongestIncreasingSubsequence().lengthOfLIS(new int[] {10, 9, 2, 5, 3, 7, 101}));
    }

}
