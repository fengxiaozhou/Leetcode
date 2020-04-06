import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class canJump {

    public boolean canJump(int[] nums) {

        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > k) return false;
            k = Integer.max(k, i + nums[i]);
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(new canJump().canJump(new int[]{2,3,1,1,4}));
    }

}
