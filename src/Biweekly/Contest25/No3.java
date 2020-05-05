package Biweekly.Contest25;

import java.lang.reflect.Array;
import java.util.*;

public class No3 {

    public boolean checkIfCanBreak(String s1, String s2) {

        char[] t1 = s1.toCharArray();
        Arrays.sort(t1);

        char[] t2 = s2.toCharArray();
        Arrays.sort(t2);

        return check(t1, t2) || check(t2, t1);
    }

    public boolean check(char[] s1, char[] s2) {
        for (int i = 0; i < s1.length; i++) {
            if (s1[i] < s2[i]) {
                return false;
            }
        }
        return true;
    }

    public void recursion(char[] nums, int start, List<Character> permutation, Set<List<Character>> result) {
        if (permutation.size() == nums.length) {
            result.add(permutation);
            return;
        }

        for (int i = 0; i <= permutation.size(); i++) {
            List<Character> newPermutation = new ArrayList<>(permutation);
            newPermutation.add(i, nums[start]);
            recursion(nums, start + 1, newPermutation, result);
        }
    }

    public static void main(String[] args) {
        System.out.println(new No3().checkIfCanBreak("abc", "xya"));
    }

}
