import java.lang.reflect.Array;
import java.util.Arrays;

public class twoSingleNumbers {

    public int[] singleNumbers(int[] nums) {

        int res = 0;

        for (int i = 0; i < nums.length; i++) {
            res = res ^ nums[i];
        }

        int mask = 1;

        mask = mask & (-mask);

        int a = 0;
        int b = 0;

        for (int i : nums) {
            if ((i & mask) == 0) {
                a = a ^ i;
            } else {
                b = b ^ i;
            }
        }

        return new int[]{a, b};
    }

    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(-2));
        System.out.println(Integer.toBinaryString(2));
    }

}
