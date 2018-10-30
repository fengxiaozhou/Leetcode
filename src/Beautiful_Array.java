import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Fz
 * @date 2018/10/30 15:20
 */
public class Beautiful_Array {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(beautifulArray(30)));
    }
    public static int[] beautifulArray(int N){
        ArrayList<Integer> res=new ArrayList<>();
        res.add(1);
        while (res.size()<N){
            ArrayList<Integer> temp=new ArrayList<>();
            for(int i:res)
                if(i*2-1<=N) temp.add(i*2-1);
            for(int i:res)
                if(i*2<=N) temp.add(i*2);
            res=temp;
        }
        return res.stream().mapToInt(i->i).toArray();
    }
}
