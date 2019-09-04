import java.util.ArrayList;
import java.util.List;

/**
 * @author Fz
 * @date 2019/5/24 10:20
 */
public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        if(nums.length==0)  return result;

        collectPermutations(nums,0,new ArrayList<>(),result);
        return result;
    }

    private void collectPermutations(int[] nums,int start,List<Integer> permutation,List<List<Integer>> result){
        if(permutation.size()==nums.length){
            result.add(permutation);
            return;
        }
        for(int i=0;i<=permutation.size();i++){
            List<Integer> newPermutation=new ArrayList<>(permutation);
            newPermutation.add(i, nums[start]);
            collectPermutations(nums,start+1,newPermutation,result);
        }
    }

    public static void main(String[] args) {
        System.out.println(new Permutations().permute(new int[]{1,2,3}));
    }
}
