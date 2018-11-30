import java.util.Arrays;

/**
 * @author Fz
 * @date 2018/11/30 9:53
 */
public class Sort_Array_By_Parity_II {
    public static void main(String[] args) {
        int[] A=new int[]{4,2,5,7};
        System.out.println(Arrays.toString(new Sort_Array_By_Parity_II().sortArrayByParityII(A)));
    }
    public  int[] sortArrayByParityII(int[] A) {
        int temp=1;
        for(int i=0;i<A.length;i+=2){
            if(A[i]%2==1){
                while (A[temp]%2!=0){
                    temp+=2;
                }
                swap(i,temp,A);
            }
        }
        return A;
    }
    public void swap(int i,int j,int[] arr){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
