import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class longestConsecutive {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return 1;
        }

        Set<Integer> integers = new HashSet<>();

        for (int i : nums) {
            integers.add(i);
        }
        int res = 0;
        for(int i:nums){
            if(integers.contains(i)){
                int temp = 1;
                int left = i-1;
                int right = i+1;
                while (integers.contains(left)){
                    integers.remove(left);
                    temp++;
                    left--;
                }
                while (integers.contains(right)){
                    integers.remove(right);
                    temp++;
                    right++;
                }
                res =Math.max(temp,res);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new longestConsecutive().longestConsecutive(new int[]{0,1,1}));
    }
}
