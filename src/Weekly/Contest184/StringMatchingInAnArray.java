package Weekly.Contest184;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringMatchingInAnArray {
    public static  List<String> stringMatching(String[] words) {

        Set<String> res= new HashSet<>();

        for(String i : words){
            for (String j : words){
                if(!i.equals(j)&&i.contains(j)){
                    res.add(j);
                }
            }
        }

        List<String> list = new ArrayList<>(res);

        return list;
    }

    public static void main(String[] args) {
        System.out.println(stringMatching(new String[]{"leetcoder","leetcode","od","hamlet","am"}));
    }
}
