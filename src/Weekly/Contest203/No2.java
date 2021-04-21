package Weekly.Contest203;

import java.lang.reflect.Array;
import java.util.Arrays;

public class No2 {
    public int maxCoins(int[] piles) {
        int length = piles.length;
        int n = length / 3;

        Arrays.sort(piles);

        int sum = 0;
        for (int i = n ; i < piles.length; i = i + 2) {
            sum = sum +piles[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(new No2().maxCoins(new int[]{9, 8, 7, 6, 5, 1, 2, 3, 4}));
    }
}
