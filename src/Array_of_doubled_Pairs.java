import javafx.scene.chart.AxisBuilder;
import org.omg.PortableServer.POA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Fz
 * @date 2019/5/11 15:42
 */
public class Array_of_doubled_Pairs {
    public boolean canReorderDoubled(int[] A){
        if(A.length%2!=0){
            return false;
        }
        int zero=0;
        ArrayList<Integer> negative=new ArrayList();
        ArrayList<Integer> positive=new ArrayList();
        for(int i=0;i<A.length;i++){
            if(A[i]>0) positive.add(A[i]);
            if(A[i]<0) negative.add(A[i]);
            if(A[i]==0) zero++;
        }

        return (postDoubled(positive.toArray(new Integer[positive.size()]))&&negDoubled(negative.toArray(new Integer[negative.size()]))&&(zero%2==0));
    }

    public boolean postDoubled(Integer[] A){
        if(A.length==0) return true;
        if(A.length%2!=0) return false;
        Arrays.sort(A);
        int[] temp=new int[A.length];
        for(int i=0;i<A.length;i++){
            if(temp[i]==1){
                continue;
            }
            boolean flag=false;
            for(int j=i+1;j<A.length;j++){
                if(temp[j]==1) continue;
                if(A[i]*2==A[j]){
                    temp[i]=1;
                    temp[j]=1;
                    flag=true;
                    break;
                }
            }
            if(flag==false){
                return false;
            }
        }
        for (int i:temp) {
            if(i!=1) return false;
        }
        return true;
    }

    public boolean negDoubled(Integer[] A){
        if(A.length==0) return true;
        if(A.length%2!=0) return false;
        Arrays.sort(A);
        int[] temp=new int[A.length];
        for(int i=A.length-1;i>=0;i--){
            if(temp[i]==1){
                continue;
            }
            boolean flag=false;
            for(int j=i-1;j>=0;j--){
                if(temp[j]==1) continue;
                if(A[i]*2==A[j]){
                    temp[i]=1;
                    temp[j]=1;
                    flag=true;
                    break;
                }
            }
            if(flag==false){
                return false;
            }
        }
        for (int i:temp) {
            if(i!=1) return false;
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println(new Array_of_doubled_Pairs().canReorderDoubled(new int[]{0,0}));

    }

}
