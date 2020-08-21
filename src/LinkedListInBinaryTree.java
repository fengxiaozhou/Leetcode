public class LinkedListInBinaryTree {

    public boolean isSubPath(ListNode head, TreeNode root) {

        if (head == null) {
            return true;
        }

        if (root == null) {
            return false;
        }

        if(dfs(head,root)){
            return true;
        }

        return isSubPath(head, root.right) || isSubPath(head, root.left);

    }

    public boolean dfs(ListNode head, TreeNode root){

        if(head == null){
            return true;
        }
        if (root==null){
            return false;
        }

        if(root.val != head.val){
            return false;
        }else{
            return dfs(head.next,root.left)||dfs(head.next,root.right);
        }
    }

}


