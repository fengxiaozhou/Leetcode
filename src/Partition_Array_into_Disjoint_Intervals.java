/**
 * @author Fz
 * @date 2018/12/20 9:43
 */
public class Partition_Array_into_Disjoint_Intervals {
    public static int partitionDisjoint(int[] a) {
        int localMax = a[0], partitionIdx = 0, max = localMax;
        for (int i = 1; i < a.length; i++)
            if (localMax > a[i]) {
                localMax = max;
                partitionIdx = i;
            } else max = Math.max(max, a[i]);
        return partitionIdx + 1;
    }

    public static void main(String[] args) {
        System.out.println(partitionDisjoint(new int[]{1,0,0,4,5,6,7}));
    }
}
