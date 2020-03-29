import java.util.Arrays;

/**
 * @author fengzhou <fengzhou@kuaishou.com>
 * Created on 2020-03-22
 */
public class minIncrementForUnique {

    public int minIncrementForUnique(int[] A) {

        if (A.length == 0 | A.length == 1) {
            return 0;
        }

        Arrays.sort(A);

        int res = 0;

        for (int i = 1; i < A.length; i++) {
            if (A[i] <= A[i - 1]) {
                res = res+( A[i-1] + 1 - A[i]);
                A[i] = A[i-1] + 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new minIncrementForUnique().minIncrementForUnique(new int[] {3, 2, 1, 2, 1, 7}));
    }

}
