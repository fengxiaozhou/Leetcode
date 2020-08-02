package Weekly.Contest190;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class No2 {
    private static List<Character> vowelList = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

    public int maxVowels(String s, int k) {
        int temp = vowelNumber(s.substring(0, k)); //当前的值
        int max = temp;  //最大值
        for (int i = 1; i <= s.length() - k; i++) {
            if (vowelList.contains(s.charAt(i - 1))) {
                temp = temp - 1;
            }
            if (vowelList.contains(s.charAt(i + k - 1))) {
                temp = temp + 1;
            }
            if (temp == k) {
                return k;
            } else {
                max = Math.max(max, temp);
            }
        }
        return max;
    }

    private int vowelNumber(String s) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new No2().maxVowels("ibpbhixfiouhdljnjfflpapptrxgcomvnb", 33));
    }
}


