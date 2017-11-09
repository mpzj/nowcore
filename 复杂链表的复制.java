/*
public class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}
*/
public class Solution {
    public RandomListNode Clone(RandomListNode pHead)
    {
        if(pHead==null) return null;
        RandomListNode node;
        node=pHead;
        while(node!=null){
            RandomListNode temp=new RandomListNode(node.label);
            temp.next=node.next;
            node.next=temp;
            node=temp.next;
        }
        RandomListNode temp2;
        node=pHead;
        while(node!=null){
            temp2=node.next;
            if(node.random!=null)temp2.random=node.random.next;
            node=temp2.next;
        }
        RandomListNode pHead2;
        pHead2=pHead.next;
        node=pHead;
        while(node.next!=null){
            temp2=node.next;
            node.next=temp2.next;
            node=temp2;
        }
        return pHead2;
    }
}