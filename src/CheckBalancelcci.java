public class CheckBalancelcci {

    public static boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }
        System.out.println(hieght(root.left));
        System.out.println(hieght(root.right));
        return Math.abs(hieght(root.left)-hieght(root.right))<=1;
    }
    private static int hieght(TreeNode root){
        if(root == null ){
            return 0;
        }else{
            return Math.max(hieght(root.left),hieght(root.right))+1;
        }
    }
}
