public class Solution {
    public int FindGreatestSumOfSubArray(int[] array) {
        //if(array.length==0) return array;
        int tempsum=array[0];
        int sum=array[0];
        for(int i=1;i<array.length;i++){
            if(tempsum<0){
                tempsum=array[i];
            }else{
                tempsum+=array[i];
            }
            if(tempsum>sum){
                sum=tempsum;
            }
        }
        return sum;
    }
}