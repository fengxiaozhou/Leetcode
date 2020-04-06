package Weekly.Contest183;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MinimumSubsequenceInNonIncreasingOrder {

    public List<Integer> minSubsequence(int[] nums) {

        int sum = 0;
        List<node> nodeList = new ArrayList<>();
        List<node> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            nodeList.add(new node(i, nums[i]));
        }

        nodeList.sort((o1, o2) -> o1.num - o2.num);

        int temp = 0;
        for (int i = nodeList.size()-1; i >= nodeList.size() / 2 - 1; i--) {
            temp += nodeList.get(i).num;
            res.add(nodeList.get(i));
            if(temp>sum/2){
                break;
            }
        }

        return res.stream().map(node::getNum).collect(Collectors.toList());

    }

    public static void main(String[] args) {
        System.out.println(new MinimumSubsequenceInNonIncreasingOrder().minSubsequence(new int[]{4,4,7,6,7}));
    }

    class node {
        int index;
        int num;

        public node() {
        }

        public node(int index, int num) {
            this.index = index;
            this.num = num;
        }

        public int getIndex() {
            return index;
        }

        public void setIndex(int index) {
            this.index = index;
        }

        public int getNum() {
            return num;
        }

        public void setNum(int num) {
            this.num = num;
        }
    }
}
