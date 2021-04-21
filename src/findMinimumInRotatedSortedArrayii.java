/**
 * @author fengzhou <fengzhou@kuaishou.com>
 * Created on 2021-04-09
 */
public class findMinimumInRotatedSortedArrayii {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        if(nums.length==1){
            return nums[0];
        }
        if(nums[left]<nums[right]){
            return nums[left];
        }

        int mid = (left+right)>>1;
        while (left<right){
            if(nums[left] <= nums[mid]){
                left = mid;
            }
            if(nums[right] >= nums[mid]){
                right = mid;
            }
        }
        return nums[left];
    }

}
