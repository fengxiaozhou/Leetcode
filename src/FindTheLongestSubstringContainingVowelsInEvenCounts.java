import java.util.HashMap;
import java.util.Map;

/**
 * @author fengzhou <fengzhou@kuaishou.com>
 * Created on 2020-03-07
 */
public class FindTheLongestSubstringContainingVowelsInEvenCounts {


    public int findTheLongestSubstring(String s) {

        int res = 0;

        int gap = 1;

        for (int i = 0; i < s.length(); i++) {
            if (s.length() - i < res) {
                break;
            }
            for (int j = i; j <= s.length() - i + 1; j++) {
                String temp = s.substring(i, j);
                if (judge(temp)) {
                    res = Math.max(res, temp.length());
                }
            }
            gap = Math.max(gap, res);
        }

        return res;
    }


    public boolean judge(String s) {

        int a = 0;
        int e = 0;
        int i = 0;
        int o = 0;
        int u = 0;

        for (int j = 0; j < s.length(); j++) {
            switch (s.charAt(j)) {
                case 'a':
                    a++;
                    break;
                case 'e':
                    e++;
                    break;
                case 'i':
                    i++;
                    break;
                case 'o':
                    o++;
                    break;
                case 'u':
                    u++;
                    break;
                default:
                    break;
            }
        }

        return a % 2 == 0 && e % 2 == 0 && i % 2 == 0 && o % 2 == 0 && u % 2 == 0;

    }

    public int findTheLongestSubstring2(String s) {

        int arr = 0 ;

        Map<Integer, Integer> map = new HashMap<>();

        map.put(0, -1);

        int res = 0;

        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'a':
                    arr ^= 1;
                    break;
                case 'e':
                    arr ^= 2;
                    break;
                case 'i':
                    arr ^= 4;
                    break;
                case 'o':
                    arr ^= 8;
                    break;
                case 'u':
                    arr ^= 16;
                    break;
                default:
                    break;
            }

            if (!map.containsKey(arr)) {
                map.put(arr, i);
            }else{
                res = Math.max(res, i - map.get(arr));
            }
        }

        return res;

    }


    public static void main(String[] args) {
        System.out.println(
                new FindTheLongestSubstringContainingVowelsInEvenCounts().findTheLongestSubstring2("eleetminicoworoep"));
    }

}
