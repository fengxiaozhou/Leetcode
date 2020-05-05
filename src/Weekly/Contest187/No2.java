package Weekly.Contest187;

import java.util.ArrayList;
import java.util.List;

public class No2 {
    public boolean kLengthApart(int[] nums, int k) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                list.add(i);
            }
        }

        if (list.size() < 2) {
            return false;
        } else {
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i + 1) - list.get(i) - 1 < k) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new No2().kLengthApart(new int[]{0,1,0,1}, 1));
    }
}
