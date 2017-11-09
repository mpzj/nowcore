/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
 
        ListNode node1=pHead1,node2=pHead2,same=null;
        int len1=0,len2=0;
        while(node1!=null){
            len1++;
            node1=node1.next;
        }
        while(node2!=null){
            len2++;
            node2=node2.next;
        }
        int step;
        node1=pHead1;
        node2=pHead2;
        if(len1>len2){
            step=len1-len2;
            for(int i=0;i<step;i++){
                node1=node1.next;
            }
            while(node1!=null&&node2!=null){
                if(node1.val==node2.val&&node1.next==node2.next){
                    same=node1;
                    break;
                }
                node1=node1.next;
                node2=node2.next;
            }
        }else if(len1<len2){
            step=len2-len1;
            for(int i=0;i<step;i++){
                node2=node2.next;
            }
            while(node1!=null&&node2!=null){
                if(node1.val==node2.val&&node1.next==node2.next){
                    same=node1;
                    break;
                }
                node1=node1.next;
                node2=node2.next;
            }
        }else if(len1==len2){
            while(node1!=null&&node2!=null){
                if(node1.val==node2.val&&node1.next==node2.next){
                    same=node1;
                    break;
                }
                node1=node1.next;
                node2=node2.next;
            }
        }
        return same;
        
    }
}