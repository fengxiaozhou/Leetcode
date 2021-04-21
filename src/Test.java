import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Semaphore;

public class Test {

    public static  boolean squareIsWhite(String coordinates) {
       int a = coordinates.charAt(0) - 'a'+1;
       int b = coordinates.charAt(1) - '0';
       if(a%2==0){
           return b % 2 != 0;
       }else {
           return b % 2 == 0;
       }
    }

    public static boolean areSentencesSimilar(String sentence1, String sentence2) {

        if(sentence1.equals(sentence2)){
            return true;
        }

        String[] split1 = sentence1.split(" ");
        String[] split2 = sentence2.split(" ");

        if(split1.length == split2.length){
            return false;
        }

        List<String> big;
        List<String> small;
        if(split1.length>split2.length){
            big = Arrays.asList(split1);
            small = Arrays.asList(split2);
        }else{
            big = Arrays.asList(split2);
            small = Arrays.asList(split1);
        }

        if(small.size()==1){
            return (big.get(0).equals(small.get(0)))|| (big.get(big.size()-1).equals(small.get(0)));
        }else{
            int fIndex = 0;
            int lIndex = 0;
            for(int i = 0 ;i<small.size();i++){
                if(big.get(i).equals(small.get(i))){
                    fIndex++;
                }else{
                    break;
                }
            }
            for(int i = 0;i<small.size();i++){
                if(big.get(big.size()-i-1).equals(small.get(small.size()-i-1))){
                    lIndex++;
                }else{
                    break;
                }
            }
            return fIndex+lIndex==small.size();
        }
    }

    public static void main(String[] args) {
        System.out.println(areSentencesSimilar("c h p Ny","c BDQ r h p Ny"));
    }


    public static double myPow(double x, int n) {
        double res = 1;
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        boolean flag = n>0;
        while(n!=0){
            if((n & 1)==1){
                res = res*x;
            }
            x = x*x;
            n=n/2;
        }
        return flag?res:1/res;
    }

    public static int[] printNumbers(int n) {
        int num = 1;
        for(int i = 0; i< n ;i++){
            num = num *10;
        }
        int[] res = new int[num-1];
        for(int i =1;i<num;i++){
            res[i-1]=i;
        }
        return res;
    }



    static class FooBar {
        private int n;

        public FooBar(int n) {
            this.n = n;
        }

        private Semaphore fooSemaphore = new Semaphore(2);
        private Semaphore barSemaphore = new Semaphore(0);
        public void foo() throws InterruptedException {

            for (int i = 0; i < n; i++) {
                // printFoo.run() outputs "foo". Do not change or remove this line.
                fooSemaphore.acquire(2);
                System.out.println("foo");
                barSemaphore.release(2);
            }
        }

        public void bar() throws InterruptedException {

            for (int i = 0; i < n; i++) {
                barSemaphore.acquire(2);
                // printBar.run() outputs "bar". Do not change or remove this line.
                System.out.println("bar");
                fooSemaphore.release(2);
            }
        }
    }
}