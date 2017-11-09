/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode node1,node2;
        ListNode t1,t2,head;
        if(list1==null||list2==null){
            if(list1!=null) return list1;
            if(list2!=null) return list2;
            return null;
        }
        if(list1.val<=list2.val){
            head=list1;
        }else{
            head=list2;
        }
        node1=list1;
        node2=list2;
        while(node1!=null&&node2!=null){
            if(node1.val<=node2.val){
                t1=node1.next;
                node1.next=node2;
                node1=t1;
            }else{
                t2=node2.next;
                node2.next=node1;
                node2=t2;
            }
            //node1=node1.next;
        }
        return head;
    }
}