package Biweekly.Contest25;

import java.util.ArrayList;
import java.util.List;

public class No1 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int max = 0;
        for (int i : candies) {
            max = Math.max(i,max);
        }

        List<Boolean> res = new ArrayList<>();

        for(int i : candies){
            if(i+extraCandies>=max){
                res.add(true);
            }else {
                res.add(false);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(new No1().kidsWithCandies(new int[]{2, 3, 5, 1, 3}, 3));
    }
}
