/**
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/
public class Solution {
    public void Mirror(TreeNode root) {
        TreeNode t;
        if(root!=null){
            t=root.left;
            root.left=root.right;
            root.right=t;
            Mirror(root.left);
            Mirror(root.right);
        } 
        
    }
}