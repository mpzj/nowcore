/*
 public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
*/
public class Solution {
    public ListNode deleteDuplication(ListNode pHead)
    {
        ListNode node=pHead;
        ListNode node2,node3,nodep=null;
        int num;
        while(node!=null&&node.next!=null){
            boolean flag=false;
            if(node.val==node.next.val){
                num=0;
                node2=node.next;
                node3=node2;
                while(node2!=null&&node2.val==node.val){
                    node3=node2;
                    node2=node2.next;
                }
                node.next=node3.next;
                if(nodep!=null){nodep.next=node3.next;}
                else{
                    pHead=node3.next;
                }
                flag=true;
            }
            if(!flag){
                nodep=node;
            }
            node=node.next;
        }
        return pHead;
    }
}