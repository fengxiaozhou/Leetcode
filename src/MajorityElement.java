import java.util.Arrays;

/**
 * @author fengzhou <fengzhou@kuaishou.com>
 * Created on 2020-03-13
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {

        Arrays.sort(nums);

        return nums[nums.length/2];
    }


    public static void main(String[] args) {
        System.out.println(new MajorityElement().majorityElement(new int[] {2,2,1,1,1,2,2}));
    }
}
