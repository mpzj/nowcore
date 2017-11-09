import java.util.*;
public class Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> result=new ArrayList<Integer>();
        if(k>input.length) return result;
        int temp;
        for(int i=0;i<input.length;i++){
            for(int j=i+1;j<input.length;j++){
                if(input[i]>input[j]){
                    temp=input[i];
                    input[i]=input[j];
                    input[j]=temp;
                }
            }
        }
        for(int i=0;i<k;i++){
            result.add(input[i]);
        }
        return result;
    }
}