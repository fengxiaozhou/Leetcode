/**
 * @author fengzhou <fengzhou@kuaishou.com>
 * Created on 2020-02-12
 */
public class MaximumSubarray {
    public int maxSubArray(int[] nums) {

        int res = nums[0];

        int sum = 0 ;

        for(int n : nums){
            if(sum > 0){
                sum += n;
            }else {
                sum = n;
            }

            res = Math.max(res ,sum);
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(new MaximumSubarray().maxSubArray(new int[] {-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }
}
