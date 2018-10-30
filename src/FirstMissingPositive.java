/**
 * @author Fz
 * @date 2018/10/27 16:34
 */
public class FirstMissingPositive {
    public static void main(String[] args) {
        System.out.println(firstMissingPositive(new int[]{2,1}));
    }
    public static int firstMissingPositive(int[] nums) {
        if(nums==null||nums.length<1)
            return 1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<nums.length&&nums[i]>0&&nums[nums[i]-1]!=nums[i]){
                int temp=nums[nums[i]-1];
                nums[nums[i]-1]=nums[i];
                nums[i]=temp;
                i--;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i+1){
                return i+1;
            }
        }
        return nums.length+1;
    }
}
