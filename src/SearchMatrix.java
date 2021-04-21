/**
 * @author fengzhou <fengzhou@kuaishou.com>
 * Created on 2021-03-30
 */
public class SearchMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        int i = 0;
        int j = 0;

        while(i<row && j<col){
            if(matrix[i][j]==target){
                return true;
            } else if(matrix[i][col-1]< target){
                i++;
            }else{
                j++;
            }
        }
        return false;
    }

}

class Index{
    private int r;
    private int c;

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public Index(int r, int c) {
        this.r = r;
        this.c = c;
    }
}
