import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class FindZeroMatrix {

    int[][] direction = new int[][]{{1, -1, 0, 0}, {0, 0, 1, -1}};

    public int[][] updateMatrix(int[][] matrix) {

        int n = matrix.length;
        int m = matrix[0].length;

        Queue<NodeArray> queue = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    queue.add(new NodeArray(i, j));
                } else {
                    matrix[i][j] = -1;
                }
            }
        }
        int step = 0;
        while (queue.size() > 0) {
            int len = queue.size();
            step++;
            for (int i = 0; i < len; i++) {
                NodeArray temp = queue.poll();
                for (int j = 0; j < 4; j++) {
                    int x = temp.row + direction[0][j];
                    int y = temp.col + direction[1][j];
                    if (x >= 0 && x <= n - 1 && y >= 0 && y <= m - 1 && matrix[x][y] == -1) {
                        matrix[x][y] = step;
                        queue.add(new NodeArray(x, y));
                    }
                }
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(new FindZeroMatrix().updateMatrix(new int[][]{{0, 0, 0}, {0, 1, 0}, {1, 1, 1}})));
    }
}
