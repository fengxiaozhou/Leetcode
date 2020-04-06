package Biweekly.Contest24;

public class NO1 {
    public int minStartValue(int[] nums) {

        int min = 0;

        for (int i = 1; i < nums.length; i++) {

            nums[i] = nums[i] + nums[i - 1];

        }

        for (int i = 0; i < nums.length; i++) {
            min = Math.min(min, nums[i]);
        }


        return  1 - min;
    }

    public static void main(String[] args) {
        System.out.println(new NO1().minStartValue(new int[]{1,2}));
    }
}
