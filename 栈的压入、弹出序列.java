import java.util.ArrayList;

public class Solution {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
      
        int array[]=new int[pushA.length];
        int A,B;
        boolean flag=false;
        for(int i=0;i<pushA.length;i++){
            A=pushA[i];
            for(int j=0;j<popA.length;j++){
                B=popA[j];
                if(A==B) {
                    array[j]=i;
                    flag=true;
                }
            }
        }
        int min,max;
        min=array[0];
        max=array[0];
        for(int i=1;i<pushA.length;i++){
            if(array[i]<min) {
                min=array[i];
            }else if(array[i]>max) {
           //     max=array[i];
            }else{
                flag=false;
            }
        }
        return flag;
    }
}