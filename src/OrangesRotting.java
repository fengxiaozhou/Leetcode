import java.util.ArrayList;
import java.util.List;

/**
 * @author fengzhou <fengzhou@kuaishou.com>
 * Created on 2020-03-04
 */
public class OrangesRotting {   //todo

    private List<List<Integer>> speadpoint = new ArrayList<>();

    public int orangesRotting(int[][] grid) {

        int rl = grid.length;
        int cl = grid[0].length;

        for (int row = 0; row < rl; row++) {
            for (int col = 0; col < cl; col++) {
                if (grid[row][col] == 2) {
                    List<Integer> point = new ArrayList<>();
                    point.add(row);
                    point.add(col);
                    speadpoint.add(point);
                }
            }
        }

        int num = 0;
        while (!judge(grid)){
            num++;
            int res = spread(grid);
            if(res == -1){
                return -1;
            }
        }

        return num;
    }

    public int spread(int[][] grid) {

        int rl = grid.length;
        int cl = grid[0].length;

        speadpoint.forEach(r->{
            int row = r.get(0);
            int col = r.get(1);

            if (row - 1 >= 0 && grid[row - 1][col] == 1) {
                grid[row - 1][col] = 2;
            }
            if (row + 1 < rl && grid[row + 1][col] == 1) {
                grid[row + 1][col] = 2;
            }
            if (col - 1 >= 0 && grid[row][col - 1] == 1) {
                grid[row][col - 1] = 2;
            }
            if (col + 1 < cl && grid[row][col + 1] == 1) {
                grid[row][col + 1] = 2;
            }
        });
        speadpoint.clear();

        return 0;
    }

    public boolean judge(int[][] grid) {
        int rl = grid.length;
        int cl = grid[0].length;
        for (int i = 0; i < rl; i++) {
            for (int j = 0; j < cl; j++) {
                if (grid[i][j] == 1){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int [][] grid = {{2,1,1},{0,1,1},{1,0,1}};
        int [][] grid2 = {{2},{2},{1},{0},{1},{1}};

        System.out.println(new OrangesRotting().orangesRotting(grid));
    }
}
