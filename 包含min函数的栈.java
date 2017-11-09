import java.util.Stack;

public class Solution {

    Stack<Integer> data=new Stack<Integer>();
    Stack<Integer> mindata=new Stack<Integer>();
    //int min;
    public void push(int node) {
        if(data.empty()) mindata.push(node);
        data.push(node);
        if(node<mindata.peek()) mindata.push(node);
        //min=mindata.peek();
    }
    
    public void pop() {
        data.pop();
        boolean flag=true;
        for(Integer x:data){
            if(x==mindata.peek()) flag=false;
        }
        if(flag) mindata.pop();
    }
    
    public int top() {
        return data.pop();
    }
    
    public int min() {
        return mindata.peek();
    }
}