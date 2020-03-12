import java.util.Objects;

/**
 * @author fengzhou <fengzhou@kuaishou.com>
 * Created on 2020-03-07
 */
public class MaximumSumBstInBinaryTree {

    static int res = 0;

    public static int maxSumBST(TreeNode root) {

        if (root == null) {
            return 0;
        }

        if (judge(root)) {
            res = Math.max(res, sum(root));
        } else {
            res = Math.max(maxSumBST(root.right), maxSumBST(root.left));
        }

        return res;


    }


    public static boolean judge(TreeNode root) {


        if (Objects.isNull(root.left) && Objects.isNull(root.right)) {
            return true;
        }

        if (Objects.isNull(root.left) && root.right.val > root.val) {
            return judge(root.right);
        }

        if (Objects.isNull(root.right) && root.left.val < root.val) {
            return judge(root.left);
        }

        if (root.left.val < root.val && root.right.val > root.val) {
            return judge(root.left) && judge(root.right);
        }

        return false;

    }

    public static int sum(TreeNode root) {

        if (Objects.isNull(root.left) && Objects.isNull(root.right)) {

            return root.val;
        }

        if (Objects.isNull(root.left)) {
            int a = sum(root.right);
            if(a>=0){
                return sum(root.right)+root.val;
            }
            return sum(root.right);
        }

        if (Objects.isNull(root.right)) {
            int b = sum(root.left);
            if(b>=0){
                return sum(root.left)+root.val;
            }
            return sum(root.left);
        }

        int a = sum(root.left);
        int b = sum(root.right);

        if(a>=0&&b>=0){
            return root.val + sum(root.left) + sum(root.right);
        }

        if(a<0){
            return b;
        }
        return a;

    }




    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(4);
        TreeNode n2 = new TreeNode(3);
        TreeNode n3 = new TreeNode(1);
        TreeNode n5 = new TreeNode(2);


        n1.left = n2;
        n2.left = n3;
        n2.right = n5;


        System.out.println(maxSumBST(n1));
    }


}
