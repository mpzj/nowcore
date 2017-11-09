import java.util.*;
public class Solution {
    public ArrayList<Integer> maxInWindows(int [] num, int size)
    {
        ArrayList<Integer> result=new ArrayList<Integer>();
        if(size==0||size>num.length) return result;
        int lo=0,hi=size;
        int max=num[0];
        
        for(int i=lo+1;i<hi;i++){
            if(num[i]>max) max=num[i];
        }
        result.add(max);
        for(int i=1;i<num.length-size+1;i++){
            lo++;
            hi++;
            max=num[lo];
            for(int j=lo+1;j<hi;j++){
                if(num[j]>max) max=num[j];
            }
            result.add(max);
        }
        return result;
    }
}