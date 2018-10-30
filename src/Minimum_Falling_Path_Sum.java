/**
 * @author Fz
 * @date 2018/10/30 16:32
 */
public class Minimum_Falling_Path_Sum {
    public static void main(String[] args) {
        System.out.println(minFallingPathSum(new int[][]{{1,2,3},{4,5,6},{7,8,9}}));
    }
    public static int minFallingPathSum(int[][] A) {
        int rows=A.length;
        int cols=A[0].length;
        int[][]dp=new int[rows][cols+2];
        for(int i=0;i<rows;i++){
            dp[0][i+1]=A[0][i];
        }
        for(int j=0;j<cols;j++){
            dp[j][0]=Integer.MAX_VALUE;
            dp[j][cols+1]=Integer.MAX_VALUE;
        }
        for(int i=1;i<rows;i++){
            for(int j=1;j<cols+1;j++){
                int temp=Math.min(dp[i-1][j-1],dp[i-1][j]);
                int min=Math.min(temp,dp[i-1][j+1]);
                dp[i][j]=A[i][j-1]+min;
            }
        }
        int res=Integer.MAX_VALUE;
        for(int i=1;i<cols+1;i++){
            res=Math.min(res,dp[rows-1][i]);
        }
        return res;
    }
}
