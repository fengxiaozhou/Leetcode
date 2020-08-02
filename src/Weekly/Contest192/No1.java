package Weekly.Contest192;

import java.lang.reflect.Array;
import java.util.Arrays;

public class No1 {
    public int[] shuffle(int[] nums, int n) {
        int[] res = new int[n * 2];
        int index = 0;
        for (int i = 0; i < n; i++) {
            res[index++] = nums[i];
            res[index++] = nums[i+n];
        }
        return res;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.asList(new No1().shuffle(new int[]{1, 1, 2, 2}, 2)).toString());
    }
}
