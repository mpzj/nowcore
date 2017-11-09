/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    public ListNode FindKthToTail(ListNode head,int k) {
        int len=0;
        ListNode node=head;
        while(node!=null){
            node=node.next;
            len++;
        }
        int i=0;
        node=head;
        while(node!=null){
            if(i==(len-k) ) break;
            node=node.next;
            i++;
        }
        return node;
    }
}