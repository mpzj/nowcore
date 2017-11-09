import java.util.*;
public class Solution {
    public boolean isContinuous(int [] numbers) {
        if(numbers.length==0) return false;
        boolean flag=false;
        Arrays.sort(numbers);
        int num=0;
        int temp=-1;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==0) {num++;}
            else if(numbers[i]==temp){ return false;}
            temp=numbers[i];
        }
        if(numbers[numbers.length-1]-numbers[num]<=numbers.length-1) flag=true;
        return flag;
    }
}