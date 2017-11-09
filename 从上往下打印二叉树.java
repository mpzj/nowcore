import java.util.ArrayList;
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
    ArrayList<Integer> result=new ArrayList<Integer>();
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        if(root!=null) result.add(root.val);
        print(root);
        return result;
    }
    private void print(TreeNode root){
        if(root!=null){
            if(root.left!=null) result.add(root.left.val);
            if(root.right!=null) result.add(root.right.val);
            print(root.left);
            print(root.right);
        }
    }
}