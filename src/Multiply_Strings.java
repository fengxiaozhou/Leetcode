import java.util.Arrays;

/**
 * @author Fz
 * @date 2018/10/30 10:42
 */
public class Multiply_Strings {
    public static void main(String[] args) {
        System.out.println(multiply("0","0"));
    }
    public static String multiply(String num1, String num2) {
        if(num1==null||num2==null||num1.equals("0")||num2.equals("0")) return "0";
       int a=num1.length();
       int b=num2.length();
       int[] arr=new int[a+b];
       for(int i=a-1;i>=0;i--){
           for(int j=b-1;j>=0;j--){
               int mul=(num1.charAt(i)-'0')*(num2.charAt(j)-'0');
               int sum=mul+arr[i+j+1];

               arr[i+j]+=sum/10;
               arr[i+j+1]=sum%10;
           }
       }
       StringBuilder res=new StringBuilder("");
        int i=0;
        for(;i<arr.length;i++){
            if(arr[i]!=0) break;
        }
        for(int j=i;j<arr.length;j++){
            res.append(arr[j]);
        }
        return res.toString();
    }
}
