package Weekly.Contest187;

public class No3 {
    public int longestSubarray(int[] nums, int limit) {

        int len = nums.length;

        int res = 0;

        int start = 0;
        int end = 0;
        int max = nums[0];
        int min = nums[0];

        while (start < len && end < len) {
            if (Math.abs(max - min) <= limit) {
                res = Math.max(res, end - start + 1);
                end++;
                if (end < len && nums[end] > max) {
                    max = nums[end];
                }
                if (end < len && nums[end] < min) {
                    min = nums[end];
                }
            } else {
                start++;
                end = start;
                if (end < len){
                    max = nums[start];
                    min = nums[start];
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new No3().longestSubarray(new int[]{4,2,2,2,4,4,2,2}, 0));
    }
}
