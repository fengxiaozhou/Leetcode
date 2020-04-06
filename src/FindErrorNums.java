import java.util.Arrays;

public class FindErrorNums {
    public static int[] findErrorNums(int[] nums) {
         int r = 0, xor0 = 0, xor1 = 0;;

         for(int num : nums){
             r ^= num;
         }
        for (int i = 1; i <= nums.length; i++)
            r ^= i;
        System.out.println(Integer.toBinaryString(r));
         int sign = r&(-r);
        System.out.println(Integer.toBinaryString(sign));

        for (int n: nums) {
            if ((n & sign) != 0)
                xor1 ^= n;
            else
                xor0 ^= n;
        }
        for (int i = 0; i <= nums.length; i++) {
            if ((i & sign) != 0)
                xor1 ^= i;
            else
                xor0 ^= i;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == xor0)
                return new int[]{xor0, xor1};
        }
        return new int[]{xor1, xor0};

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findErrorNums(new int[]{1, 1})));
    }
}
