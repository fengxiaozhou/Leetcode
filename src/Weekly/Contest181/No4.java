package Weekly.Contest181;

/**
 * @author fengzhou <fengzhou@kuaishou.com>
 * Created on 2020-03-22
 */
public class No4 {

    public String longestPrefix(String s) {
        int len = s.length();
        String prefix;
        String endfix;

        int max = 0;
        String res="";

        for (int i = 1; i < s.length(); i++) {
            prefix = s.substring(0, i);
            endfix = s.substring(len - i, len);
            if (prefix.equals(endfix)) {
                max = Math.max(max,prefix.length());
                res = s.substring(0, i);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new No4().longestPrefix("level"));
    }

}
