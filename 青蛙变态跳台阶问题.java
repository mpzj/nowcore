public class Solution {
    public int JumpFloorII(int target) {
        if(target==1) return 1;
        if(target==2) return 2;
        int array[]=new int[target];
        array[0]=1;
        array[1]=2;
        for(int i=2;i<target;i++){
            array[i]=1;
            for(int j=0;j<i;j++){
                array[i]=array[i]+array[j];
            }
        }
        return array[target-1];
    }
}