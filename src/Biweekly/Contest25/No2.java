package Biweekly.Contest25;

public class No2 {
    public int maxDiff(int num) {
        String source = String.valueOf(num);
        char c1 = source.charAt(0);
        String s1 ;
        if (c1 != '9') {
            s1 = source.replace(c1, '9');
        } else {
            char t = ' ';
            for (char c : source.toCharArray()) {
                if (c != '9') {
                    t = c;
                    break;
                }
            }
            s1 = source.replace(t, '9');
        }
        String s2;
        if (c1 != '1') {
            s2 = source.replace(c1, '1');
        } else {
            char t = ' ';
            for (char c : source.toCharArray()) {
                if (c > '1') {
                    t = c;
                    break;
                }
            }
            s2 = source.replace(t, '0');
        }

        return Integer.parseInt(s1) - Integer.parseInt(s2);
    }

    public static void main(String[] args) {
        System.out.println(new No2().maxDiff(8808000));
    }
}
