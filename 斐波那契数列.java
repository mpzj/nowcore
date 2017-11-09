public class Solution {
    public int Fibonacci(int n) {
       //F(0)=0£¬F(1)=1, F(n)=F(n-1)+F(n-2)£¨n>=2£¬n¡ÊN*£©
        int array[];
        array=new int[n+1];
        if(n>=2){
            array[0]=0;
            array[1]=1;
            for(int i=2;i<n+1;i++){
                array[i]=array[i-1]+array[i-2];
            }       
            return array[n];
        }else if(n<2){
            if(n==0){return 0;}
            if(n==1){return 1;}
        }
        return 0;
        
        
    }
}