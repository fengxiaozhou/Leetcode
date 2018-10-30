import java.util.LinkedList;
import java.util.List;

/**
 * @author Fz
 * @date 2018/10/24 14:56
 */
public class 获取字符串的回文子串 {
    public List<String> countSubstrings(String s) {
        List<String> res= new LinkedList<>();
        if (s == null || s.length() == 0) {
            return res;
        }
        int length = s.length();
        for (int i = 0; i < length; i++)
        System.out.println(res);
        System.out.println(res.size());
        return res;
    }

    public List<String> extendRoundCenter(String s, int start, int end) {
        List<String> res = new LinkedList<>();
        while (start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
            res.add(s.substring(start,end+1));
            start --;
            end ++;
        }
        return res;
    }
}
