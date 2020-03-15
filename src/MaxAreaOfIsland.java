import java.util.Arrays;

/**
 * @author fengzhou <fengzhou@kuaishou.com>
 * Created on 2020-03-15
 */
public class MaxAreaOfIsland {

    public int maxAreaOfIsland(int[][] grid) {

        if (grid == null) {
            return 0;
        }

        int max = 0;
        int row = grid.length;
        int col = grid[0].length;
        boolean[][] flag;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                max = Math.max(max, dfs(grid, i, j));
            }
        }
        return max;

    }

    public int dfs(int[][] grid, int i, int j) {

        if (i >= grid.length || i < 0) {
            return 0;
        }

        if (j >= grid[0].length || j < 0) {
            return 0;
        }

        if (grid[i][j] == 1) {
            grid[i][j] = 0;
            return 1 + dfs(grid, i - 1, j) + dfs(grid, i, j + 1) + dfs(grid, i, j - 1) + dfs(grid,
                    i + 1, j);
        } else {
            return 0;
        }
    }


}
