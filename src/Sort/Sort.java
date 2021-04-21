package Sort;

import java.util.Arrays;

public class Sort {
    public void bubbleSort(int[] Array) {
        int len = Array.length;
        if (len < 1) {
            return;
        }
        for (int i = 0; i < len; i++) {
            boolean flag = false;
            for (int j = i + 1; j < len; j++) {
                if (Array[j] < Array[i]) {
                    int temp = Array[j];
                    Array[j] = Array[i];
                    Array[i] = temp;
                    flag = true;
                }
            }
            if (!flag) {
                return;
            }
        }
    }

    private void quickSort(int[] arr, int left, int right) {

        int i,j,temp;
        if(left>right){
            return;
        }
        temp = arr[left];
        i = left;
        j = right;
        while (i!=j){
            while (arr[j]<temp&&i<j){
                j--;
            }
            while (arr[i]>temp&&i<j){
                j--;
            }
            swap(arr,i,j);
        }
        swap(arr,left,i);
        quickSort(arr,left,i-1);
        quickSort(arr,i+1,right);
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static void main(String[] args) {
        int[] array = new int[]{-1,9, 3, 7, 5, 5, 3, 2};
        new Sort().quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
//        System.out.println(Math.round(-1.4));
//        System.out.println(Math.round(-0.6));

        String s= "";
        s= s+'c';
        System.out.println(s);
    }

}
