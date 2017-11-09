import java.util.ArrayList;
public class Solution {
    public int minNumberInRotateArray(int [] array) {
        int min=array[0];
        for(int i=1;i<array.length;i++){
            if(min>array[i]){
                min=array[i];
            }
        }
        return min;
    }
}