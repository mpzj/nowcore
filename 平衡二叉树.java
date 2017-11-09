public class Solution {
    boolean flag=true;
    public boolean IsBalanced_Solution(TreeNode root) {
        
        getDepth(root);
        return flag;
    }
    private int getDepth(TreeNode root){
        if(root==null) return 0;
        int l=getDepth(root.left);
        int r=getDepth(root.right);
        if(Math.abs(l-r)>1) flag=false;
        return Math.max(l+1,r+1);
    }
}