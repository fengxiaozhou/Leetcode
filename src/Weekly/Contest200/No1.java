package Weekly.Contest200;

import sun.nio.cs.ext.MacThai;

/**
 * @author Fz
 * @date 2020/8/2 10:41
 */
public class No1 {

    public static int countGoodTriplets(int[] arr, int a, int b, int c) {
        int result = 0;
        for(int i = 0 ; i<arr.length-2 ;i++){
            for(int j = i+1 ; j <arr.length-1 ;j++){
                for(int k = j+1 ; k<arr.length;k++){
                    if(Math.abs(arr[i]-arr[j])<=a &&
                            Math.abs(arr[j]-arr[k])<=b &&
                            Math.abs(arr[k]-arr[i])<=c){
                        System.out.println(""+arr[i]+arr[j]+arr[k]);
                        result++;
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(countGoodTriplets(new int[]{1,1,2,2,3}, 0, 0, 1));
    }
}
