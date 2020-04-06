public class EditDistance {
    public int minDistance(String word1, String word2) {

        int len1 = word1.length() + 1;
        int len2 = word2.length() + 1;

        int[][] dp = new int[len1][len2];

        dp[0][0] = 0;

        for (int i = 1; i < len1; i++) {
            dp[i][0] = i;
        }

        for (int i = 1; i < len2; i++) {
            dp[0][i] = i;
        }

        for (int i = 1; i < len1; i++) {
            for (int j = 1; j < len2; j++) {
                if (word1.charAt(i-1) == word2.charAt(j-1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.min(dp[i][j - 1], Math.min(dp[i - 1][j - 1], dp[i - 1][j])) + 1;
                }
            }
        }

        return dp[len1-1][len2-1];
    }

    public static void main(String[] args) {
        System.out.println(new EditDistance().minDistance("intention", "execution"));
    }
}
