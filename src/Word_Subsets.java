import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Fz
 * @date 2018/12/18 15:33
 */
public class Word_Subsets {
    public static List<String> wordSubsets(String[] A, String[] B) {
        int[] temp;
        int[] count=new int[26];
        List <String> res=new ArrayList();
        for (String str:B) {
            temp =counter(str,new int[26]);
            for(int i=0;i<26;i++){
                count[i]=Math.max(count[i],temp[i]);
            }
        }
        for(String str:A){
            temp=counter(str,new int[26]);
            for(int i=0;i<26;i++){
                if(temp[i]<count[i]) break;
                if(i==25) res.add(str);
            }
        }
        return res;

    }
    public static int[] counter(String A,int[] temp){
        for(char c:A.toCharArray()){
            temp[c-'a']+=1;
        }
        return temp;
    }
    public static void main(String[] args) {
        String[] A=new String[]{"amazon","apple","facebook","google","leetcode"};
        String[] B=new String[]{"lo","eo"};
        System.out.println(wordSubsets(A,B));
    }
}
