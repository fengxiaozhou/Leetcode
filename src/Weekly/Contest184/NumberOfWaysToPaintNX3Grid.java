package Weekly.Contest184;

import java.util.Stack;

public class NumberOfWaysToPaintNX3Grid {

    int[][] direction = new int[][]{{1, -1, 0, 0}, {0, 0, 1, -1}};

    public int numOfWays(int n) {
       int res = 0 ;
       int array[][] = new int[n][3];
        array[0][0] = 1;

       Stack<NodeArray> stack = new Stack<>();

       stack.push(new NodeArray(0,0));
       int num = 1;

        while (stack.size() > 0) {
            NodeArray temp = stack.pop();
            for (int i = 0; i < 4; i++) {
                int x = temp.i + direction[0][i];
                int y = temp.j + direction[1][i];
                if (x >= 0 && x <= 2 && y >= 0 && y <= n - 1 && array[x][y] == 0) {
                        stack.push(new NodeArray(x, y));
                        num++;
                        System.out.println(x + "," + y);
                        array[x][y] = 1;
                    }
                }
            }
        return 0;
        }
    class NodeArray {
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
}
