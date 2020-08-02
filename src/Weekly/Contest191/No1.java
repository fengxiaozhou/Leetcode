package Weekly.Contest191;

import Weekly.Contest186.N01;

public class No1 {
    public int maxProduct(int[] nums) {
        int res = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(i!=j){
                    res = Math.max((nums[i]-1)*(nums[j]-1),res);
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new No1().maxProduct(new int[]{3,7}));
    }
}
