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

     public static ListNode meetingNode(ListNode head) {
        if(head==null)
            return null;
         
        ListNode slow = head.next;
        if(slow==null)
            return null;
         
        ListNode fast = slow.next;
        while (slow != null && fast != null) {
            if(slow==fast){
                return fast;
            }
            slow=slow.next;
            fast=fast.next;
             
            if(fast!=slow){
                fast=fast.next;
            }
        }
        return null;
    }
    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        ListNode meetingNode=meetingNode(pHead);
        if(meetingNode==null)
            return null;
//      得到环中的节点个数
        int nodesInLoop=1;
        ListNode p1=meetingNode;
        while(p1.next!=meetingNode){
            p1=p1.next;
            ++nodesInLoop;
        }
//      移动p1
        p1=pHead;
        for(int i=0;i<nodesInLoop;i++){
            p1=p1.next;
        }
//      移动p1，p2
        ListNode p2=pHead;
        while(p1!=p2){
            p1=p1.next;
            p2=p2.next;
        }
        return p1;
    }
}