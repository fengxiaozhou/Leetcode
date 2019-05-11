/**
 * @author Fz
 * @date 2018/12/25 9:16
 */
public class Smallest_Range_II {
    public int smallestRangeII(int[] A, int K) {
        if(A.length<2) return 0;
        double avg=avg(A);
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i:A){
            if(i>=avg){
                i=i-K;
                min=min>i?i:min;
            }else{
                i=i+K;
                max=max<i?i:max;
            }
        }
        return Math.abs(max-min);

    }
    public double avg(int[] A){
        double res=0;
        for (int i:A) {
           res+=i;
        }
        return res/A.length;
    }

    public static void main(String[] args) {
        System.out.println(new Smallest_Range_II().smallestRangeII(new int[]{1},3));
    }
}
