public class Solution {
    public int JumpFloor(int target) {
        //target=21;
        int n1;
        int num=0;
        if(target==1) return 1;
        if(target==2) return 2;
        int array[]=new int[target];
        array[0]=1;
        array[1]=2;
        //if(target==2) return 1;
        for(n1=2;n1<target;n1++){
            array[n1]=array[n1-1]+array[n1-2];
            
        }
        return array[target-1];
    }
    
}