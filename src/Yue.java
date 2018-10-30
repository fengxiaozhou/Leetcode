package com.timeng;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Yue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalNum = scanner.nextInt();
        yuesefu(totalNum, 3);
    }

    public static void yuesefu(int totalNum, int countNum) {
        List<Integer> start = new ArrayList<Integer>();
        for (int i = 1; i <= totalNum; i++) {
            start.add(i);
        }
        int k = 0;
        while (start.size() >1) {
            k = k + countNum;
            k = k % (start.size()) - 1;
            if (k < 0) {
                start.remove(start.size() - 1);
                k = 0;
            } else {
                start.remove(k);
            }
        }
        System.out.println(start.get(0));
    }
}