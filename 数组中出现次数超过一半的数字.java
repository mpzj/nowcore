public class Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        int [] num=new int[array.length];
        for(int i=0;i<array.length;i++){
            num[i]=0;
            for(int j=0;j<array.length;j++){
                if(array[i]==array[j]) num[i]++;
            }
        }
        for(int i=0;i<array.length;i++){
            if(num[i]>array.length/2) {
                return array[i];
            }
        }
        return 0;
    }
}