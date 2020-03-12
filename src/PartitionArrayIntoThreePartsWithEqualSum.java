/**
 * @author fengzhou <fengzhou@kuaishou.com>
 * Created on 2020-03-11
 */
public class PartitionArrayIntoThreePartsWithEqualSum {

    public boolean canThreePartsEqualSum(int[] A) {
        if (A.length < 3) {
            return false;
        }
        int sum = 0;
        int partSum;
        for (int i : A) {
            sum += i;
        }
        if (sum % 3 != 0) {
            return false;
        } else {
            partSum = sum / 3;
        }

        int tempSum = 0;
        int num = 0;

        for (int i = 0; i < A.length; i++) {

            tempSum += A[i];
            if (tempSum == partSum) {
                tempSum = 0;
                num++;
            }
            if (num == 3 && i != A.length - 1) {
                int s = 0;
                for (int j = i + 1; j < A.length; j++) {
                    s += A[j];
                }
                return s == 0;
            }
        }

        return num == 3;
    }

    public static void main(String[] args) {
        System.out.println(new PartitionArrayIntoThreePartsWithEqualSum()
                .canThreePartsEqualSum(new int[] {10, -10, 10, -10, 10, -10, 10, -10}));
    }
}
