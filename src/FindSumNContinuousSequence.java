import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author fengzhou <fengzhou@kuaishou.com>
 * Created on 2020-03-06
 */
public class FindSumNContinuousSequence {

    public int[][] findContinuousSequence(int target) {

        List<int[]> res = new ArrayList<>();

        int half = target/2;

        for(int i =1 ; i<= half ; i++){
            int sum = 0;
            int j = i;
            List<Integer> temp = new ArrayList<>();
            while(sum<target){
                sum+=j;
                temp.add(j);
                if(sum == target){
                    int[] entry = new int[temp.size()];
                    for (int k = 0; k < temp.size(); k++) {
                        entry[k] = temp.get(k);
                    }
                    res.add(entry);

                }
                j++;
            }
        }



        int len = res.size();

        int[][] Res = new int[len][];

        res.toArray(Res);

        return Res;

    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(new FindSumNContinuousSequence().findContinuousSequence(9)));
    }
}
