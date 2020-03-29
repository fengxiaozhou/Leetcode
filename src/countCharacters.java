import java.util.Arrays;

/**
 * @author fengzhou <fengzhou@kuaishou.com>
 * Created on 2020-03-17
 */
public class countCharacters {

    int[] num = new int[26];

    int res = 0;

    public int countCharacters(String[] words, String chars) {

        for (char c : chars.toCharArray()) {
            num[(c - 'a')]++;
        }

        for (String s : words) {
            if (judge(s)) {
                res = res + s.length();
            }
        }

        return res;

    }

    private boolean judge(String words) {

        int[] temp = Arrays.copyOf(num, num.length);

        for (char c : words.toCharArray()) {
            temp[c - 'a']--;
            if (temp[c - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }

}
