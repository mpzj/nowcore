import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        ArrayList<Integer> resulst=new ArrayList<Integer>();
        int lo=0,hi=array.length-1;
        while(lo<hi){
            if((array[lo]+array[hi])==sum){
                resulst.add(array[lo]);
                resulst.add(array[hi]);
                return resulst;
            }else if((array[lo]+array[hi])>sum){
                hi--;
            }else if((array[lo]+array[hi])<sum){
                lo++;
            }
        }
        return resulst;
    }
}