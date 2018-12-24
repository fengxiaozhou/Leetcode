import java.util.*;

/**
 * @author Fz
 * @date 2018/12/18 14:51
 */
public class Reverse_Only_Letters {
    public static String reverseOnlyLetters(String S) {
        char[] chars=S.toCharArray();
        int left=0;
        int right=chars.length-1;
        while (left<right){
            if((chars[left]>='A'&&chars[left]<='Z')||(chars[left]>='a'&&chars[left]<='z')){
                if((chars[right]>='A'&&chars[right]<='Z')||(chars[right]>='a'&&chars[right]<='z')){
                     swap(chars,right,left);
                     left++;
                     right--;
                }else{
                     right--;
                }
            }else {
                left++;
            }
        }
        return new String(chars);

    }

    public static void swap(char[] chars,int left,int right){
        char temp;
        temp=chars[left];
        chars[left]=chars[right];
        chars[right]=temp;
    }

    public static void main(String[] args) {
        System.out.println(reverseOnlyLetters("a-bC-dEf-ghIj"));
    }

}
