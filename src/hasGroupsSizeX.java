import java.util.HashMap;
import java.util.Map;

/**
 * @author fengzhou <fengzhou@kuaishou.com>
 * Created on 2020-03-27
 */
public class hasGroupsSizeX {

    public boolean hasGroupsSizeX(int[] deck) {

        if (deck.length <= 1) {
            return false;
        }

        int n = 0;

        Map<Integer, Integer> map = new HashMap();

        for (int i = 0; i < deck.length; i++) {
            if (map.containsKey(deck[i])) {
                map.put(deck[i], map.get(deck[i]) + 1);
            } else {
                map.put(deck[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            n = gcd(n, entry.getValue());
            if (n == 1) {
                return false;
            }
        }

        return true;
    }


    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static void main(String[] args) {
        System.out.println(new hasGroupsSizeX().hasGroupsSizeX(new int[] {1, 1, 1, 2, 2, 2, 3, 3}));
    }

}
