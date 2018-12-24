import java.util.HashMap;
import java.util.Map;

/**
 * @author Fz
 * @date 2018/12/24 9:30
 */
public class X_of_a_Kind_in_a_Deck_of_Cards {
    public static boolean hasGroupsSizeX(int[] deck) {
        int[] bucket=new int[10001];
        for(int temp:deck){
                bucket[temp]++;
        }

        int min=10001;
        for(int val:bucket){
            if(val!=0) min=Math.min(min,val);
        }
        if(min==1){
            return false;
        }

        for(int val:bucket){
            if(hcf(min,val)==1) return false;
        }
        return true;
    }

    private static int hcf(int a,int b){
        int hcf=1;
        for(int i=1;i<=a||i<=b;i++){   //因为要和零去求最小公约数，所以应用“||” 而不是“&&”
            if(a%i==0&&b%i==0){
                hcf=i;
            }
        }
        return hcf;
    }

    private static int gcd(int a,int b){
        return b>0? gcd(b,a%b) : a;
    }

    public static void main(String[] args) {
       System.out.println(hasGroupsSizeX(new int[]{1,2,3,4,4,3,2,1}));
    }
}
