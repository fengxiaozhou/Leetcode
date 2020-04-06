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

    public static void main(String[] args) {
        System.out.println(new trappingRainWater().trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
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
