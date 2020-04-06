import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @author fengzhou <fengzhou@kuaishou.com>
 * Created on 2020-04-08
 */
public class movingCount {
    public int movingCount(int m, int n, int k) {

        int[][] direction = new int[][]{{1, -1, 0, 0}, {0, 0, 1, -1}};

        int[][] array = new int[m][n];
        int sum = 1;

        Queue<NodeArray> queue = new ArrayDeque<>();
        queue.offer(new NodeArray(0, 0));
        array[0][0] = 1;

        while (queue.size() > 0) {
            NodeArray temp = queue.poll();
            for (int i = 0; i < 4; i++) {
                int x = temp.i + direction[0][i];
                int y = temp.j + direction[1][i];
                if (x >= 0 && x <= m - 1 && y >= 0 && y <= n - 1 && array[x][y] == 0) {
                    if (twoNumberSum(x, y) <= k) {
                        queue.offer(new NodeArray(x, y));
                        System.out.println(x + "," + y);
                        array[x][y] = 1;
                        sum++;
                    }
                }
            }
        }

        return sum;

    }

    public int twoNumberSum(int m, int n) {

        int sum = 0;
        while (m != 0) {
            sum = sum + m % 10;
            m = m / 10;
        }
        while (n != 0) {
            sum = sum + n % 10;
            n = n / 10;
        }

        return sum;
    }

    static class NodeArray {
        int i;
        int j;

        public NodeArray(int i, int j) {
            this.i = i;
            this.j = j;
        }

        public int getI() {
            return i;
        }

        public void setI(int i) {
            this.i = i;
        }

        public int getJ() {
            return j;
        }

        public void setJ(int j) {
            this.j = j;
        }
    }

    public static void main(String[] args) {
        System.out.println(new movingCount().movingCount(2, 3, 1));
    }
}
