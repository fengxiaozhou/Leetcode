/**
 * @author Fz
 * @date 2018/10/31 11:08
 */
public class Binary_Subarrays_With_Sum {
    public static void main(String[] args) {
        System.out.println(numSubarraysWithSum2(new int[]{1,0,1,0,1},2));
    }
    public static int numSubarraysWithSum(int[] A, int S) {
        if(A==null||A.length==0) return 0;
        int sum=0;
        int count=0;
        for(int i=0;i<A.length;i++){
            for(int j=i;j<A.length;j++){
                sum+=A[j];
                if(sum==S){
                    count++;
                }
                if(sum>S){
                    break;
                }
            }
            sum=0;
        }
        return count;
    }

    public static int numSubarraysWithSum2(int[] a, int s) {
        int n = a.length;
        int[] map = new int[n + 1];
        map[0] = 1;

        int count = 0;
        for (int i = 0, sum = 0; i < n; i++) {
            sum += a[i];
            if (sum - s >= 0) {
                count += map[sum - s];
            }
            map[sum]++;
        }
        return count;
    }
}
