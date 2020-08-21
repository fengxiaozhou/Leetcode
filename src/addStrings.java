import java.util.LinkedList;

public class addStrings {
    public static String addStrings(String num1, String num2) {
        char[] n1 = num1.toCharArray();
        char[] n2 = num2.toCharArray();

        LinkedList<String> list = new LinkedList<>();

        int flag = 0;
        int i = n1.length - 1;
        int j = n2.length - 1;

        while (i >= 0 && j >= 0) {
            int a = n1[i] - '0' + n2[j] - '0' + flag;
            if (a >= 10) {
                flag = 1;
            } else {
                flag = 0;
            }
            list.addFirst(Integer.toString(a % 10));
            i--;
            j--;
        }

        while (i >= 0) {
            int a = n1[i] - '0' + flag;
            if (a >= 10) {
                flag = 1;
            } else {
                flag = 0;
            }
            list.addFirst(Integer.toString(a % 10));
            i--;
        }
        while (j >= 0) {
            int a = n2[j] - '0' + flag;
            if (a >= 10) {
                flag = 1;
            } else {
                flag = 0;
            }
            list.addFirst(Integer.toString(a % 10));
            j--;
        }

        if (flag > 0) {
            list.addFirst("1");
        }

        StringBuilder res = new StringBuilder();

        for (String k : list) {
            res.append(k);
        }

        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(addStrings("9", "1"));
    }
}
