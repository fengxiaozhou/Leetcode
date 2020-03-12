import java.util.Arrays;

/**
 * @author fengzhou <fengzhou@kuaishou.com>
 * Created on 2020-03-09
 */
public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {

        if(prices.length<=0){
            return 0;
        }

        int len = prices.length;

        int res = 0;

        int maxValue = prices[len - 1];


        for (int i = len - 2; i >= 0; i--) {

            if (maxValue - prices[i] > 0) {
                res = Math.max(res, maxValue - prices[i]);
            }

            maxValue = Math.max(maxValue, prices[i]);
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(new BestTimeToBuyAndSellStock().maxProfit(new int[] {}));
    }
}
