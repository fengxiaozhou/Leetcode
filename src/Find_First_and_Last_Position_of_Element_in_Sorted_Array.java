import java.util.Arrays;

/**
 * @author Fz
 * @date 2018/10/20 11:01
 */
public class Find_First_and_Last_Position_of_Element_in_Sorted_Array {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(searchRange(new int[]{1},4)));
    }
    public static int[] searchRange(int[] nums, int target) {
        if(nums==null||nums.length==0) return new int[]{-1,-1};
        if(nums.length==1){
            if(nums[0]==target){
                return new int[]{0,0};
            }
            return new int[]{-1,-1};
        }
        int[] res=new int[2];
        int left=0;
        int right=nums.length-1;
        while (left<=right&&((nums[left]!=target)||nums[right]!=target)){
            if(nums[left]<target)
                left++;
            if(nums[left]>target){
                return new int[]{-1,-1};
            }
            if(nums[right]>target)
                right--;
            if(nums[right]<target){
                return new int[]{-1,-1};
            }
        }
        res[0]=left;
        res[1]=right;
        return res;
    }
}
