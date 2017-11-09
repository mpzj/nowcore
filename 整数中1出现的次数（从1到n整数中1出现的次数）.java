public class Solution {
    public int NumberOf1Between1AndN_Solution(int n) {
    
        int num=0;
        int a,b;
        for(int i=1;i<=n;i=i*10){
            a=n/i;
            b=n%i;
            //num=num+(a+8)/10*i+(a%10==1)*(b+1);
            if(a%10==1){num=num+(a+8)/10*i+(b+1);}
            else{num=num+(a+8)/10*i;}
        }
        return num;
    }
}