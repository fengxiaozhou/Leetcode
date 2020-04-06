package Weekly.Contest185;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class No3 {
    public int minNumberOfFrogs(String croakOfFrogs) {

        int[] num = new int[5];
        int res = 0;
        for(int i = 0 ; i<croakOfFrogs.length();i++){
            if(croakOfFrogs.charAt(i)=='c'){
                if(num[0]==0){
                    res++;
                    continue;
                }
            }else{

            }
        }
    }

    public static void main(String[] args) {
        System.out.println(new No3().minNumberOfFrogs("croakcrook"));
    }
}
