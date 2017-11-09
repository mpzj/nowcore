import java.util.ArrayList;
import java.util.*;

public class Solution {
    public String PrintMinNumber(int [] numbers) {

        String s1,s2,s;
       for(int i=0;i<numbers.length;i++){
           for(int j=i+1;j<numbers.length;j++){
               s1=numbers[j]+""+numbers[i];
               s2=numbers[i]+""+numbers[j];
               if(Integer.parseInt(s1)<Integer.parseInt(s2)){
                   swap(numbers,i,j);
               }
           }
       }
        s="";
       for(int i=0;i<numbers.length;i++){
           s=s+numbers[i];
       }
        return s;
    }
    private void swap(int a[],int i,int j){
        int t=a[i];
        a[i]=a[j];
        a[j]=t;
    }
}