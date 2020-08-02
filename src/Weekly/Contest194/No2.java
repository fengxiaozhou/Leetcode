package Weekly.Contest194;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class No2 {
    public String[] getFolderNames(String[] names) {

        ArrayList<String> res = new ArrayList<>();

        Set<String> temp = new HashSet<>();
        HashMap<String,Integer> map = new HashMap<>();

        for (String s : names) {
            if (temp.contains(s)) {
                int i = 1;
                if(map.containsKey(s)){
                    i = map.get(s);
                }
                String t = s + "(" + i + ")";
                while (temp.contains(t)) {
                    i++;
                    t = s + "(" + i + ")";
                }
                map.put(s,i);
                s = t;
            }else {
                map.put(s,1);
            }
            res.add(s);
            temp.add(s);
        }

        int i = 0;
        String[] array = new String[res.size()];

        for (String s : res) {
            array[i] = s;
            i++;
        }

        return array;

    }

    public static void main(String[] args) {
        System.out.println(new No2().getFolderNames(new String[]{"kaido","kaido(1)","kaido","kaido(1)","kaido(2)"}));
    }
}
