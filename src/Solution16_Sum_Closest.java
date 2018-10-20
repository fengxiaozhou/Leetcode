import java.util.Arrays;

/**
 * @author Fz
 * @date 2018/10/15 13:55
 */
public class Solution16_Sum_Closest {
    public static void main(String[] args) {
        System.out.println(funtion2(new int[]{-1,2,1,-4},1));
    }
    public static int threeSumClosest(int[] nums, int target) {
        int sum=0;
        int local=Integer.MAX_VALUE;
        int res=0;
        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                for(int k=j+1;k<nums.length;k++){
                    sum=nums[i]+nums[j]+nums[k];
                    if(Math.abs(sum-target)<local){
                        local=Math.abs(sum-target);
                        res=sum;
                    }
                }
            }
        }
        return res;
    }
    public static int funtion2(int[] nums, int target){
        Arrays.sort(nums);
        int result=nums[0]+nums[1]+nums[2];
        int diff=Math.abs(result-target);
        for(int i=0;i<nums.length-2;i++){
            int left=i+1;
            int right=nums.length-1;
            while (left<right){
                int sum=nums[i]+nums[left]+nums[right];
                if(sum==target){
                    return sum;
                }else if(sum<target){
                    if(target-sum<diff){
                        result=sum;
                        diff=target-sum;
                    }
                    left++;
                }else{
                    if(sum-target<diff){
                        result=sum;
                        diff=sum-target;
                    }
                    right--;
                }
            }
        }
        return result;
    }
}
