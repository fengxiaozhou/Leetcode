/**
 * @author fengzhou <fengzhou@kuaishou.com>
 * Created on 2020-03-10
 */
public class DiameterOfBinaryTree {

    int res = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        DFS(root);
        return res - 1;
    }

    public int DFS(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = DFS(root.left);
        int right = DFS(root.right);

        res = Math.max(res, left + right +1 );

        return left + right + 1;

    }

}
