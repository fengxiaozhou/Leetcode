/**
 * @author Fz
 * @date 2018/10/20 10:15
 */
public class Search_in_Rotated_Sorted_Array {
    public static void main(String[] args) {
        System.out.println(search(new int[]{5,1,3},3));
    }
    public static int search(int[] nums, int target) {
        if(nums==null||nums.length==0) return -1;
        if(nums.length<2){
            int res=nums[0]==target?0:-1;
            return res;
        }
        int left=0;
        int right=nums.length-1;
        while (left<=right){
            int mid=(left+right)>>1;
            if(nums[mid]==target) return mid;
            if(nums[left]<=nums[mid]){
                if(target>=nums[left]&&target<=nums[mid]){
                    right=mid-1;
                }
                else{
                    left=mid+1;
                }
            }else{
                if(target>=nums[mid]&&target<=nums[right]){
                    left=mid+1;
                }
                else{
                    right=mid-1;
                }
            }
        }
        return -1;
    }
}
