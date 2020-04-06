import java.util.Stack;

public class trappingRainWater {
    public int trap(int[] height) {

        int sum = 0;
        Stack<Entry> stack = new Stack<>();

        for (int i = 0; i < height.length; i++) {
            if (stack.empty()) {
                if (height[i] == 0) {
                    continue;
                } else {
                    stack.push(new Entry(i, height[i]));
                }
            } else {
                Entry top = stack.peek();
                if (top.num > height[i]) {
                    stack.push(new Entry(i, height[i]));
                } else {
                    while (stack.size() > 0 && stack.peek().num <= height[i]) {
                        Entry temp = stack.pop();
                        sum += (i - temp.index - 1)*(height[i]-temp.num);
                    }
                    stack.push(new Entry(i, height[i]));
                }
            }
        }

        return sum;
    }


    public int trap2(int[] height) {
        if (height == null) {
            return 0;
        }
        Stack<Integer> stack = new Stack<>();
        int ans = 0;
        for (int i = 0; i < height.length; i++) {
            while(!stack.isEmpty()&&height[stack.peek()]<height[i]){
                int curIdx = stack.pop();
                while (!stack.isEmpty()&&height[stack.peek()] == height[curIdx]){
                    stack.pop();
                }
                if(!stack.isEmpty()){
                    int stackTop = stack.peek();
                    ans = ans + (Math.min(height[stackTop],height[i])-height[curIdx])*(i - stackTop - 1);
                }
            }
            stack.push(i);
        }
      return ans;
    }


    public static void main(String[] args) {
        System.out.println(new trappingRainWater().trap2(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
    }


    class Entry {
        int index;
        int num;

        public Entry() {
        }

        public Entry(int index, int height) {
            this.index = index;
            this.num = height;
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
