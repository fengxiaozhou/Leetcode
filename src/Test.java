import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static int aMethod(int i) throws Exception {
        try {
            return 10 / i;
        } catch (Exception ex) {
            System.out.printf("catch");
            throw new Exception("exception in a aMethod");
        } finally {
            System.out.printf("finally");
        }
    }

    public List<List<Integer>> test(String S) {
        List<List<Integer>> res = new ArrayList<>();

        int len = S.length();

        if (len < 3) {
            return res;
        }

        for (int i = 0; i < len; ) {
            int temp = 0;
            for (int j = i + 1; j < len; j++) {
                if (S.charAt(i) == S.charAt(j)) {
                    temp++;
                } else {
                    break;
                }
            }
            if (temp >= 2) {

                res.add(new ArrayList<>(Arrays.asList(i, i + temp)));
                i = i + temp;
            } else {
                i++;
            }
        }

        return res;

    }

//    public String countAndSay(int n) {
//
//        String s = "1";
//
//        if (n <= 1) {
//            return "1";
//        }
//
//        for (int i = 2; i <= n; i++) {
//
//        }
//
//    }
//
//    private String Say(String s) {
//
//        String res = "";
//
//        for (int i = 0; i < s.length(); i++) {
//            int temp = 1;
//
//        }
//
//    }

    public int coinChange(int[] coins, int amount) {

        int[] dp = new int[amount + 1];

        Arrays.fill(dp, amount+1);

        dp[0] = 0;

        for (int i = 0; i < amount + 1; i++) {
            for(int coin :coins){
                if(i-coin>=0){
                    dp[i] = Math.min(dp[i-coin]+1,dp[i]);
                }
            }
        }

        return dp[amount] == amount+1 ? -1 : dp[amount];

    }

    public static void main(String[] args) {
        Integer res = new Test().coinChange(new int[]{2},3);
        System.out.println(res);
    }
}