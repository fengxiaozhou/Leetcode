package Weekly.Contest188;

import java.util.ArrayList;
import java.util.List;

public class No1 {
    public List<String> buildArray(int[] target, int n) {

        List<String> res = new ArrayList<>();
        int num = 1;

        for (int i : target) {
            while (num != i) {
                pushDouble(res);
                num++;
            }
            pushSingle(res);
            num++;
        }
        return res;
    }

    private void pushDouble(List<String> res) {
        res.add("Push");
        res.add("Pop");
    }

    private void pushSingle(List<String> res) {
        res.add("Push");
    }

    public static void main(String[] args) {
        System.out.println(new No1().buildArray(new int[]{4}, 4));
    }
}
