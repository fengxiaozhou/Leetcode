package Biweekly.Contest22;

/**
 * @author fengzhou <fengzhou@kuaishou.com>
 * Created on 2020-03-21
 */
public class NO1 {

    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {

        int res = arr1.length;

        for (int i : arr1) {
            for (int j : arr2) {
                if (Math.abs(i - j) <= d) {
                    res--;
                    break;
                }
            }
        }

        return res;

    }

    public static void main(String[] args) {
        System.out.println(new NO1().findTheDistanceValue(new int[] {2,1,100,3}, new int[] {-5,-2,10,-3,7}, 6));
    }
}
