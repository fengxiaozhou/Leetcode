package Weekly.Contest192;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class No2 {
    static int mid;
    public int[] getStrongest(int[] arr, int k) {
        Arrays.sort(arr);
        mid = arr[(arr.length - 1) / 2];
        Integer[] arr2 = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        Arrays.sort(arr2,
                (o1, o2) -> {
                    if (Math.abs(o1 - mid) > Math.abs(o2 - mid)) {
                        return -1;
                    } else {
                        if (Math.abs(o1 - mid) < Math.abs(o2 - mid)) {
                            return 1;
                        } else {
                            if (o1 - o2 > 0) {
                                return -1;
                            } else {
                                return 1;
                            }
                        }
                    }
                });
        int[] res= new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = arr2[i];
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new No2().getStrongest(new int[]{6,-3,7,2,11}, 3));
    }
}
