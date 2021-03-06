public class SubtreeOfAnotherTree {
    public boolean isSubtree(TreeNode s, TreeNode t) {

        if(s == null){
            return false;
        }

        return subTree(s,t) || isSubtree(s.left,t) || isSubtree(s.right,t);
    }

    public boolean subTree(TreeNode s, TreeNode t){
        if(s == null && t == null){
            return true;
        }
        if(s== null || t== null){
            return false;
        }
        if(s.val != t.val){
            return false;
        }
        return subTree(s.left,t.left) && subTree(s.right,t.right);
    }
}
