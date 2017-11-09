public class Solution {
    boolean flag;
    public boolean VerifySquenceOfBST(int [] sequence) {
        flag=true;
        if(sequence.length==0) return false;
        isBaackTree(sequence,0,sequence.length-1);
        return flag;
    }
    private void isBaackTree(int [] sequence,int start,int end){
        if(start<=end){
        int t=end;
        for(int i=start;i<end;i++){
            if(sequence[i]>sequence[end]){
                t=i;
                break;
            }
        }
        for(int i=t+1;i<end;i++){
            if(sequence[i]<sequence[end]){
                flag=false;
            }
        }
        isBaackTree(sequence,start,t-1);
        isBaackTree(sequence,t,end-1);}
    }
}