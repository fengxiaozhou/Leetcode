package Biweekly.Contest24;

public class NO2 {

    public int findMinFibonacciNumbers(int k) {

        if (k == 1) {
            return 1;
        }

        int a = 1;
        int b = 1;
        int temp;

        while (b <= k) {
            if (b == k) {
                return 1;
            } else {
                temp = a + b;
                a = b;
                b = temp;
            }
        }
        return findMinFibonacciNumbers(k - a) + 1;

    }

    public static void main(String[] args) {
        System.out.println(new NO2().findMinFibonacciNumbers(19));
    }

}
