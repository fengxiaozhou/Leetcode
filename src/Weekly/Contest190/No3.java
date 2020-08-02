package Weekly.Contest190;

import java.util.ArrayList;
import java.util.List;

public class No3 {
    public int pseudoPalindromicPaths(TreeNode root) {
        int count = 0;
        List<List<Integer>> list = new ArrayList<>();
        helper(root, list, new ArrayList<>());

        for (List<Integer> list1 : list) {
            if (isPalindromic(list1)) {
                count++;
            }
        }

        return count;
    }


    public void helper(TreeNode root, List<List<Integer>> list, List<Integer> s) {
        if (root == null)                             //root为空，易知，只有一种情况，那就是题目所给是空树。
            return;
        if (root.left == null && root.right == null) { //没有左右孩子,当前节点是叶子节点,所以形成一条路径=s(根节点到父节点路径)+当前节点
            s.add(root.val);
            list.add(s);
            return;
        }
        if (root.left != null) {
            List<Integer> newList = new ArrayList<>(s);
            newList.add(root.val);
            helper(root.left, list, newList);  //存在左孩子,所以到当前节点路径=s(根节点到父节点路径)+当前节点值+"->"
        }
        if (root.right != null) {
            List<Integer> newList = new ArrayList<>(s);
            newList.add(root.val);
            helper(root.right, list, newList); //同理
        }
    }


    private boolean isPalindromic(List<Integer> list) {
        int[] bucket = new int[10];
        int count = 0;
        for (int i : list) {
            bucket[i]++;
        }
        for (int i : bucket) {
            if (i % 2 != 0) {
                count++;
            }
        }
        return count <= 1;
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(6);
        treeNode.left = new TreeNode(7);
        treeNode.right = new TreeNode(1);
        treeNode.left.right = new TreeNode(1);
        treeNode.left.right.left = new TreeNode(5);
        treeNode.right.left = new TreeNode(5);
        treeNode.right.right = new TreeNode(3);
        treeNode.right.right.right = new TreeNode(4);
        System.out.println(new No3().pseudoPalindromicPaths(treeNode));
        System.out.println(6 ^ 1 ^ 3 ^ 4);
    }

    public static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

}
