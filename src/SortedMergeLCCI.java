import java.util.Arrays;

/**
 * @author fengzhou <fengzhou@kuaishou.com>
 * Created on 2020-03-03
 */
public class SortedMergeLCCI {

    public void merge(int[] A, int m, int[] B, int n) {

        if(B.length==0){
            return;
        }

        for(int i =0 ; i < n;i++){
            A[m+i] = B[i];
        }

        Arrays.sort(A);

    }

    public void merge2(int[] A, int m, int[] B, int n) {    //倒着排序插入

        int pa = m-1;

        int pb = n-1;

        int Alen = A.length-1;

        while (pa>=0 && pb>=0){

            if(A[pa]>B[pb]){
                A[Alen--] = A[pa--];
            }else{
                A[Alen--] = B[pb--];
            }

        }
        while (pa>=0){
            A[Alen--] = A[pa--];
        }
        while (pb>=0){
            A[Alen--] = B[pb--];
        }

    }


}
