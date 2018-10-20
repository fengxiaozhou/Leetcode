import java.util.ArrayList;
import java.util.List;

/**
 * @author Fz
 * @date 2018/10/15 15:53
 */
public  class Solution18_4Sum {
    public  List<List<Integer>>  fourSum(int[] nums, int target) {
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<nums.length-3;i++){
            for(int j=i+1;i<nums.length-2;j++){
                for(int k=j+1;k<nums.length-1;k++){
                    for(int l=k+1;l<nums.length;l++){
                        if(nums[i]+nums[j]+nums[k]+nums[l]==target){
                            List<Integer> list=new ArrayList<>();
                            list.add(nums[i]);
                            list.add(nums[j]);
                            list.add(nums[k]);
                            list.add(nums[l]);
                            res.add(list);
                        }
                    }
                }
            }
        }
        return res;
    }
}
