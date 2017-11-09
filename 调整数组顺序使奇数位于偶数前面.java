public class Solution {
    public void reOrderArray(int [] array) {
        int array2[]=new int[array.length];
        int flag=0;
        for(int i=0;i<array.length;i++){
            if(array[i]%2==1){
                array2[flag]=array[i];
                flag++;
            }
        }
        for(int i=0;i<array.length;i++){
            if(array[i]%2==0){
                array2[flag]=array[i];
                flag++;
            }
        }
        for(int i=0;i<array.length;i++){
            array[i]=array2[i];
        }
        
    }
}