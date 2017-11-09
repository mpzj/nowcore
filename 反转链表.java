/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    public ListNode ReverseList(ListNode head) {
        ListNode node;
        node=head;
        int len=0;
        while(node!=null){
            node=node.next;
            len++;
        }
        int array[]=new int[len];
        int i=0;
        node=head;
        while(node!=null){
            array[i]=node.val;
            node=node.next;
            i++;
        }
        i=1;
        node=head;
        while(node!=null){
            node.val=array[len-i];
            node=node.next;
            i++;
        }
        return head;
    }
}