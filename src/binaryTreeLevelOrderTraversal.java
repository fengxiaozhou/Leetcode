
import java.util.*;

public class binaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {  //层序遍历

        List<List<Integer>> res = new ArrayList<>();

        if (root == null) {
            return res;
        }

        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);

        while (queue.size() > 0) {
            int count = queue.size();
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < count; i++) {
                TreeNode node = queue.poll();
                temp.add(node.val);
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            res.add(temp);
        }
        return res;
    }


    public static List<List<Integer>> levelZigzagOrder(TreeNode root) {

        List<List<Integer>> res = new ArrayList<>();

        if (root == null) {
            return res;
        }

        Stack<TreeNode> stack0 = new Stack<>();
        stack0.push(root);
        Stack<TreeNode> stack1 = new Stack<>();

        int level = 0;

        while (stack0.size() > 0 || stack1.size() > 0) {
            int count;
            List<Integer> temp = new ArrayList<>();
            if (level % 2 == 0) {
                count = stack0.size();
                for (int i = 0; i < count; i++) {
                    TreeNode node = stack0.pop();
                    temp.add(node.val);
                    if (node.left != null) {
                        stack1.push(node.left);
                    }
                    if (node.right != null) {
                        stack1.push(node.right);
                    }
                }
                res.add(temp);
                level++;
            } else {
                count = stack1.size();
                for (int i = 0; i < count; i++) {
                    TreeNode node = stack1.pop();
                    temp.add(node.val);
                    if (node.right != null) {
                        stack0.push(node.right);
                    }
                    if (node.left != null) {
                        stack0.push(node.left);
                    }
                }
                res.add(temp);
                level++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.right.right = new TreeNode(5);
        System.out.println(levelZigzagOrder(root));
    }
}
