/**
 * @author fengzhou <fengzhou@kuaishou.com>
 * Created on 2020-03-29
 */
public class asFarFromLandAsPossible {

    public int maxDistance(int[][] grid) {

        int n = grid.length;

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 0) {
                    continue;
                } else {
                    for (int k = 0; k < n; k++) {
                        for (int l = 0; l < n; l++) {
                            if (grid[k][l] == 1) {
                                continue;
                            } else {
                                max = Math.max(max, distance(i, j, k, l));
                            }
                        }
                    }

                }
            }
        }

        return max;


    }

    private int distance(int x1, int y1, int x2, int y2) {

        return Math.abs(x2 - x1) + Math.abs(y2 - y1);


    }
}
