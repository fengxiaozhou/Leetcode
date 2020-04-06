package Biweekly.Contest24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class No3 {

    List<String> dict = new ArrayList<>();
    List<String> chars = new ArrayList<>(Arrays.asList("a", "b", "c"));

    public String getHappyString(int n, int k) {

        recursion(n,"");

        List<String> res = new ArrayList<>();

        for(String s : dict){
            if (isFunny(s)) {
                res.add(s);
            }
        }
        if (res.size() < k) {
            return "";
        } else {
            return res.get(k - 1).toString();
        }

    }

    private void recursion(int n, String s) {
        if (s.length() != n) {
            for (int i = 0; i < chars.size(); i++) {
                recursion(n, s + chars.get(i));
            }
        } else {
            dict.add(s);
        }
    }

    private boolean isFunny(String s) {

        boolean res = true;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                res = false;
                break;
            }
        }
        return res;

    }

    public static void main(String[] args) {
        System.out.println(new No3().getHappyString(1, 3));
    }

}
