package Weekly.Contest194;

public class No1 {

    public int orx(int n, int start) {

        int[] num = new int[n];

        int res = 0;

        for (int i = 0; i < n; i++) {
            num[i] = start + 2 * i;
            res = res^num[i];
        }

        return res;

    }

    public static void main(String[] args) {
        System.out.println(new No1().orx(10, 5));
    }
}
