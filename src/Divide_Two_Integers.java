/**
 * @author Fz
 * @date 2018/10/17 16:18
 */
public class Divide_Two_Integers {

    public int divideViolence(int dividend, int divisor) {

        long a = (long) dividend;

        long b = (long) divisor;

        boolean flag = false;

        if ((a > 0 && b > 0) || (a < 0 && b < 0)) {
            flag = true;
        }

        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0 || a < b) {
            return 0;
        }

        if (b == 1) {
            if (flag) {
                if(a>=Integer.MAX_VALUE) return Integer.MAX_VALUE;
                return (int)a;
            } else {
                return (int)a * -1;
            }
        }

        int sum = 0;

        int res = 0;

        while (sum < a) {
            res++;
            sum += b;
        }

        if (a - sum != 0) {
            res -= 1;
        }

        if (flag) {
            if(res>Integer.MAX_VALUE) return Integer.MAX_VALUE;
            return res;
        } else {
            return res * -1;
        }

    }


    public int divide(int dividend, int divisor) {

        if(dividend == 0) return 0;

        if(dividend == Integer.MIN_VALUE && divisor == -1){
            return Integer.MAX_VALUE;
        }

        boolean flag = false;

        if ((dividend > 0 && divisor > 0) || (dividend < 0 && divisor < 0)) {
            flag = true;
        }

        long a = Math.abs((long) dividend);

        long b = Math.abs((long) divisor);

        int n = 31;

        int result = 0;

        for(int i =31 ; i>=0 ; i--){
            if((a>>i)>=b){
                result+=1<<i;
                a-=b<<i;
            }
        }

        return flag ? result : -result;


    }


    public static void main(String[] args) {
        System.out.println(new Divide_Two_Integers().divide(100, 3));

       System.out.println(100>>(2));

    }

}
