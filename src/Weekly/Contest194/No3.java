package Weekly.Contest194;

import java.util.HashMap;
import java.util.Objects;
import java.util.Stack;

public class No3 {
    public int[] avoidFlood(int[] rains) {
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] res = new int[rains.length];
        for (int i = rains.length-1 ;  i >=0 ; i--) {
            int t = rains[i];
            if(t>0){
                if(map.containsKey(t)){
                    if(map.get(t)==1){
                        return new int[0];
                    }else{
                        map.put(t,1);
                        res[i] = -1;
                    }
                } else {
                    map.put(t,1);
                    res[i] = -1;
                }
                stack.push(t);
            }else{
                if(stack.size()==0){
                    res[i] = 10;
                }else{
                    int k = stack.pop();
                    map.put(k,0);
                    res[i] = k;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        new No3().avoidFlood(new int[]{1,0,2,0,2,1});
    }
}
