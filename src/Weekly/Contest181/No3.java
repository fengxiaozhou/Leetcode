package Weekly.Contest181;

/**
 * @author fengzhou <fengzhou@kuaishou.com>
 * Created on 2020-03-22
 */
public class No3 {

    public boolean hasValidPath(int[][] grid) {

        return dfs(grid,0,0);

    }

    public boolean dfs(int[][] grid, int curR, int curC) {

        if (curC == grid.length - 1 && curR == grid[0].length - 1) {
            return true;
        }
        if (curC > grid.length - 1 || curR > grid[0].length - 1 || curC < 0 || curR < 0) {
            return false;
        }
        if (grid[curR][curC] == 1 && grid[curR][curC] != 7) {
            grid[curR][curC] = 7;
            return  dfs(grid,curR,curC-1)||dfs(grid,curR,curC+1);

        }

        if (grid[curR][curC] == 2 && grid[curR][curC] != 7) {
            grid[curR][curC] = 7;
            return  dfs(grid,curR+1,curC)||dfs(grid,curR-1,curC);

        }

        if (grid[curR][curC] == 3 && grid[curR][curC] != 7) {
            grid[curR][curC] = 7;
            return  dfs(grid,curR,curC-1)||dfs(grid,curR+1,curC);

        }

        if (grid[curR][curC] == 4 && grid[curR][curC] != 7) {
            grid[curR][curC] = 7;
            return  dfs(grid,curR,curC+1)||dfs(grid,curR+1,curC);

        }

        if (grid[curR][curC] == 5 && grid[curR][curC] != 7) {
            grid[curR][curC] = 7;
            return  dfs(grid,curR,curC-1)||dfs(grid,curR-1,curC);

        }

        if (grid[curR][curC] == 6 && grid[curR][curC] != 7 ) {
            grid[curR][curC] = 7;
            return  dfs(grid,curR-1,curC)||dfs(grid,curR,curC+1);

        }
        return false;
    }


    public static void main(String[] args) {
        System.out.println(new No3().hasValidPath(new int[][] {{2, 4, 3}, {6, 5, 2}}));
    }


}
