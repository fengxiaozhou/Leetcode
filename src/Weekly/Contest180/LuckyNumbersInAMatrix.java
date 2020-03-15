package Weekly.Contest180;

import java.util.ArrayList;
import java.util.List;

/**
 * @author fengzhou <fengzhou@kuaishou.com>
 * Created on 2020-03-15
 */
public class LuckyNumbersInAMatrix {
    public List<Integer> luckyNumbers(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;

        List<Integer> res = new ArrayList<>();

        if (m == 1 && n == 1) {
            res.add(matrix[0][0]);
            return res;
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (minInrow(matrix, i, j) && maxIncol(matrix, i, j)) {
                    res.add(matrix[i][j]);
                }
            }
        }

        return res;
    }

    private boolean minInrow(int[][] matrix, int row, int col) {

        int n = matrix[0].length;
        for (int i = 0; i < n; i++) {
            if (matrix[row][col] > matrix[row][i]) {
                return false;
            }
        }
        return true;
    }

    private boolean maxIncol(int[][] matrix, int row, int col) {

        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            if (matrix[row][col] < matrix[i][col]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] arr = new int[][]{{3}};
        System.out.println(new LuckyNumbersInAMatrix().luckyNumbers(arr));
    }


}
