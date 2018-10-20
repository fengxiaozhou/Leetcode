import java.util.*;

/**
 * @author Fz
 * @date 2018/10/17 9:30
 */
public class a_test {
    public static void main(String[] args) {
        System.out.println(funtion1(""));
    }
    public static boolean funtion1(String s1){ //回文
        if(s1.length()<2) return true;
        int left=0;
        int right=s1.length()-1;
        while (left<right){
            if(s1.charAt(left)!=s1.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void qsort(int[] arr){
        if(arr==null) return;
        qsort(arr,0,arr.length-1);
    }
    public static void qsort(int[] arr,int s,int e){
        if(s<e){
            int p=s+(int)Math.random()*(s-e+1);
        }
    }
}
