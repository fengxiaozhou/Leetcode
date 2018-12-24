/**
 * @author Fz
 * @date 2018/12/17 17:11
 */
public class Maximum_Sum_Circular_Subarray {
    public static int maxSubarraySumCircular(int[] A) {
        if (A == null) return 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int all=0;
        int curmax=0;
        int curmin=0;
        for(int i:A){
            all+=i;
            curmax+=i;
            max=Math.max(max,curmax);
            if(curmax<0) curmax=0;
            curmin+=i;
            min=Math.min(min,curmin);
            if (curmin>0) curmin=0;
        }
        return max<0?max:Math.max(max,all-min);
    }

    public static void main(String[] args) {
        System.out.println(maxSubarraySumCircular(new int[]{-3,-1,-2,-1}));
    }
}