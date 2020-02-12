/**
 * @author fengzhou <fengzhou@kuaishou.com>
 * Created on 2020-02-12
 * 快速幂
 */
public class PowFuntion {
    public double myPow(double x, int n) {

        Long N = (long) n;

        if(N<0){
            return fastPow(1d/x,-N);
        }
        Double res  ;

        if(N%2==0){
            double half = fastPow( x ,N/2 );
            res = half * half;
        }else{
            double half = fastPow( x ,(N-1)/2 );
            res = x * half * half ;
        }
        return res;
    }


    private double fastPow(double x , long N){
        if(N == 0){
            return 1D;
        }

        if(N == 1){
            return x;
        }
        double half = fastPow(x, N / 2);
        if (N % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }


    public static void main(String[] args) {
        System.out.println(new PowFuntion().myPow(1, -2147483648));
//        System.out.println(String.valueOf(Math.pow(-2.0, 31)));
    }
}
