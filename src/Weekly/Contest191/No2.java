package Weekly.Contest191;

import java.lang.reflect.Array;
import java.util.*;

public class No2 {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        List<Double> horizontalCutList = new ArrayList();
        List<Double> verticalCutList = new ArrayList();

        for (int i : horizontalCuts) {
            horizontalCutList.add((double) i);
        }
        for (int j : verticalCuts) {
            verticalCutList.add((double) j);
        }
        horizontalCutList.add((double) 0);
        verticalCutList.add((double) 0);
        horizontalCutList.add((double) h);
        verticalCutList.add((double) w);

        horizontalCutList.stream().distinct();
        verticalCutList.stream().distinct();

        horizontalCutList.sort(Comparator.comparingDouble(o -> o));
        verticalCutList.sort(Comparator.comparingDouble(o -> o));

        double maxH = Double.MIN_VALUE;
        double maxL = Double.MIN_VALUE;

        for (int i = 1; i < horizontalCutList.size(); i++) {
            maxH = Math.max(maxH, (horizontalCutList.get(i) - horizontalCutList.get(i - 1)));
        }
        for (int j = 1; j < verticalCutList.size(); j++) {
            maxL = Math.max(maxL, (verticalCutList.get(j) - verticalCutList.get(j - 1)));
        }

        double res = maxH * maxL;

        return (int) res % 1000000007;
    }

    public static void main(String[] args) {
        System.out.println(new No2().maxArea(1000000000
                , 1000000000, new int[]{5, 2, 6, 3}, new int[]{1, 4}));
    }
}
