package Biweekly.Contest24;

public class NO4 {
    public int numberOfArrays(String s, int k) {

        double res;
        if (Integer.parseInt(s) <= k) {
            if (!s.contains("0")) {
                res = Math.pow(2, s.length() - 1);
            } else {
                int zeroNum = 0;
                for (char c : s.toCharArray()) {
                    if (c == '0') {
                        zeroNum++;
                    }
                }
                res = Math.pow(2, s.length() - 1 - zeroNum);
            }
        } else {
            int pointnum = 0;
            int a = 0;
            int b = a + 1;
            while (b < s.length()) {
                while (b< s.length() && s.charAt(b) == '0') {
                    b++;
                }
                if (Integer.parseInt(s.substring(a, b)) <= k) {
                    pointnum++;
                }
                a = b + 1;
                b = a + 1;
            }
            if(pointnum==0){
                return 0;
            }else{
                res = Math.pow(2, s.length() - 1 - pointnum);
            }
        }

        return (int) res % (10 ^ 9 + 7);
    }

    public static void main(String[] args) {

        System.out.println(new NO4().numberOfArrays("1234567890", 90));
    }
}
