import java.util.Arrays;

/**
 * @author Fz
 * @date 2019/9/3 22:49
 */
public class Rotate_Image {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        for (int i=0; i<n/2; i++)
            for (int j=i; j<n-i-1; j++) {
                int tmp=matrix[i][j];
                matrix[i][j]=matrix[n-j-1][i];
                matrix[n-j-1][i]=matrix[n-i-1][n-j-1];
                matrix[n-i-1][n-j-1]=matrix[j][n-i-1];
                matrix[j][n-i-1]=tmp;
            }
        }

    public void swap(int[][] matrix,int n,int m,int i ,int j) {
        int temp;
        temp = matrix[j][n];
        System.out.println(temp);
        matrix[j][n] = matrix[m][j];
        System.out.println(matrix[j][n]);
        matrix[n][j] = matrix[i][m];
        System.out.println(matrix[n][j]);
        matrix[i][m] = matrix[n][i];
        System.out.println(matrix[i][m]);
        matrix[n][i] =temp;
        System.out.println("+++++++++++++++++++++++++++");
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        for (int[] a:matrix) {
            System.out.println(Arrays.toString(a));
        }
        new Rotate_Image().rotate(matrix);
        for (int[] a:matrix) {
            System.out.println(Arrays.toString(a));
        }
    }
}
