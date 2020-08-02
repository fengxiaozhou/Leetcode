/**
 * @author Fz
 * @date 2020/8/2 11:46
 */
public class FlattenBinaryTreeToLinkedList {

    public void flatten(TreeNode root) {
        if(root == null){
            return;
        }
        flatten(root.left);
        flatten(root.right);
        TreeNode temp = root.right;
        if(root.left!=null){     //如果左子树不存在
            root.right = root.left;
            root.left = null;
            TreeNode t = root.right;
            while (true){
                if(t.right == null){
                    t.right = temp;
                    return;
                }else{
                    t = t.right;
                }
            }
        }
    }
}
