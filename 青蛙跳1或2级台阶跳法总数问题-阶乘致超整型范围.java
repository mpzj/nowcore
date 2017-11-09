public class Solution {
    public int JumpFloor(int target) {
        //target=21;
        int n1,n2;
        int t;
        int num=0;
        if(target==1) return 1;
        //if(target==2) return 1;
        for(n2=0;n2<=target/2;n2++){
            n1=target-n2*2;
            t=C(n2,n1+n2);
            num=num+t;
        }
        return num;
    }
    private int C(int n,int m){
        int t1,t2,t3;
        int result;
        if(n==0) return 1;
        t1=1;
        t2=1;
        t3=1;
        for(int i=1;i<=n;i++){
            t1=t1*i;
        }
        for(int i=1;i<=m;i++){
            t2=t2*i;
        }
        for(int i=1;i<=(m-n);i++){
            t3=t3*i;
        }
        result=t2/t1/t3;
        return result;
    }
}