import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**不能重复使用元素
 * @author Fz
 * @date 2018/10/22 11:07
 */
public class CombinationSumII {
    public static void main(String[] args) {
        System.out.println(combinationSum2(new int[]{10,1,2,7,6,1,5},8));
    }
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res=new ArrayList<>();
        backTrack(res,new ArrayList<>(),candidates,target,0);
        return res;
    }
    public static void backTrack(List<List<Integer>> lists,List<Integer> temp,int[] nums,int target,int start){
        if(target<0) return;
        if(target==0) lists.add(new ArrayList<>(temp));
        else{
            for(int i=start;i<nums.length;i++){
                if(i>start&&nums[i]==nums[i-1]) continue;
                temp.add(nums[i]);
                backTrack(lists,temp,nums,target-nums[i],i+1);
                temp.remove(temp.size()-1);
            }
        }
    }
}
