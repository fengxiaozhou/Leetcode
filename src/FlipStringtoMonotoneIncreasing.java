/**
 * @author Fz
 * @date 2018/11/13 15:59
 */
public class FlipStringtoMonotoneIncreasing {
    public static void main(String[] args) {
        System.out.println(minFilpsMonoIncr("10011111110010111011"));
    }
    public static int minFilpsMonoIncr(String S){
       int one=0;
       int zero=0;
       for(char c:S.toCharArray()){
           if(c=='0'){
               one=Math.min(one,zero)+1;
               zero=zero;
           }else {
               one=Math.min(one,zero);
               zero=zero+1;
           }
       }
       return Math.min(one,zero);
    }
}
