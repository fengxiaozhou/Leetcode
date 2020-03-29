package Weekly.Contest181;

import java.util.HashSet;
import java.util.Set;

/**
 * @author fengzhou <fengzhou@kuaishou.com>
 * Created on 2020-03-22
 */
public class No2 {

    public static Set<Integer> factor(int num) {
        Set<Integer> res = new HashSet<>();
        if (num == 1) {
            res.add(1);
            return res;
        } else {
            res.add(1);
            res.add(num);

            for (int i = 2; i <=Math.sqrt(num); i++) {
                if (num % i == 0) {
                    res.add(i);
                    res.add(num/i);
                }
            }
        }
        return res;
    }

    public static int factorSum(Set<Integer> num) {
        int res = 0;
        for (int i : num) {
            res = res + i;
        }
        return res;
    }


    public int sumFourDivisors(int[] nums) {

        int res = 0;
        for (int i : nums) {
            Set<Integer> temp = factor(i);
            if (temp.size() == 4) {
                res = res + factorSum(temp);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Math.sqrt(21));

        System.out.println(factorSum(factor(21)));
    }
}
