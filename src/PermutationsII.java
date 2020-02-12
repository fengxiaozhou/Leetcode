import java.util.AbstractList;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author fengzhou <fengzhou@kuaishou.com>
 * Created on 2020-02-06
 */
public class PermutationsII {

    public List<List<Integer>> permuteUnique(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();
        if(nums.length == 0){
            return res;
        }

        recursion(nums,0,new ArrayList<>() ,res);

        Set set = new HashSet(res);

        return new ArrayList(set);

    }

    public void recursion(int[] nums , int start , List<Integer> permutation , List<List<Integer>> result){
        if(permutation.size() == nums.length){
            result.add(permutation);
            return;
        }

        for(int i = 0 ; i<=permutation.size() ; i++){
            List<Integer> newPermutation=new ArrayList<>(permutation);
            newPermutation.add(i,nums[start]);
            recursion(nums,start+1,newPermutation,result);
        }
    }

    public static void main(String[] args) {
        System.out.println(new PermutationsII().permuteUnique(new int[] {1, 1, 2}));
    }

}
