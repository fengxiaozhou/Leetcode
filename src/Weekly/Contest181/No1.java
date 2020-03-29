package Weekly.Contest181;

import java.util.LinkedList;
import java.util.List;

/**
 * @author fengzhou <fengzhou@kuaishou.com>
 * Created on 2020-03-22
 */
public class No1 {

    public int[] createTargetArray(int[] nums, int[] index) {

        int len = nums.length;

        List<Integer> res = new LinkedList<>();

        for (int i = 0; i < len; i++) {

            res.add(index[i], nums[i]);

        }

        int temp[] = new int[len];

        for(int i = 0 ;i <len ;i ++){
            temp[i] = res.get(i);
        }

        return temp;


    }
}
