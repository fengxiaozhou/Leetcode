import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Fz
 * @date 2018/10/22 10:49
 */
public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(candidates);
        backTrack(res,new ArrayList<>(),candidates,target,0);
        return res;
    }
    public void backTrack(List<List<Integer>> list, List<Integer> tempList,int[] candidates,int target,int start){
        if(target<0) return;
        else if(target==0) list.add(new ArrayList<>(tempList));
        else{
            for(int i=start;i<candidates.length;i++){
                tempList.add(candidates[i]);
                backTrack(list,tempList, candidates, target - candidates[i], i);
                tempList.remove(tempList.size() - 1);
            }
        }
    }

}
