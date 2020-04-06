import java.util.Arrays;

public class NumArray {

    int[] array;

    public NumArray(int[] nums) {
        array = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            array[i + 1] = nums[i] + array[i];
        }
    }

    public int sumRange(int i, int j) {
        return array[j + 1] - array[i];
    }
}
