package Weekly.Contest186;

public class N01 {
    public int maxScore(String s) {

        int max = 0;

        int len = s.length();
        for (int i = 1; i < len; i++) {
            System.out.println(s.substring(0, i)+" "+s.substring(i, len));
            max = Math.max(countNum(s.substring(0,i),'0')+countNum(s.substring(i,len),'1'),max);
        }
        return max;
    }

    private int countNum(String s, char c) {
        int res = 0;
        for (char ch : s.toCharArray()) {
            if (ch == c) {
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new N01().maxScore("011101"));
    }
}
