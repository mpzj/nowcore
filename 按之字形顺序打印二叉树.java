import java.util.ArrayList;
import java.util.Stack;
import java.util.LinkedList;
import java.util.*;
/*
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
    public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        
        ArrayList<ArrayList<Integer> > result=new ArrayList<ArrayList<Integer> >();
        if(pRoot==null) return result;
        boolean LtoR=true;
        ArrayList<Integer> list=new ArrayList<Integer>();
        LinkedList<TreeNode> queue=new LinkedList<TreeNode>();
        queue.add(null);
        queue.add(pRoot);
        while(queue.size()!=1){
            TreeNode node=queue.removeFirst();
            if(node==null){
                Iterator<TreeNode> iter =null;
                if(LtoR){
                    iter = queue.iterator();
                }else{
                    iter = queue.descendingIterator();
                }
                LtoR = !LtoR;
                while(iter.hasNext()){
                    TreeNode temp = (TreeNode)iter.next();
                    list.add(temp.val);
                }
                result.add(new ArrayList<Integer>(list));
                list.clear();
                queue.addLast(null);
                continue;
            }
            if(node.left!=null){
                queue.add(node.left);
            }
            if(node.right!=null){
                queue.add(node.right);
            }
        }
        return result;
    }
}