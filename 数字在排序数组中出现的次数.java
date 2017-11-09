public class Solution {
    public int GetNumberOfK(int [] array , int k) {
       int lo=0,hi=array.length-1,mid=-1;
        int temp=-1;
        while(lo<=hi){
            mid=(lo+hi)/2;
            if(array[mid]>k) hi=mid-1;
            if(array[mid]<k) lo=mid+1;
            if(array[mid]==k){
                temp=mid;
                break;
            }
        }
        if(temp==-1) return 0;
        int num=0,t2=array[temp],t3=temp,t4;
        int i;
        for( i=temp;t2==k&&i>=0;i--){
            t3=i;
            t2=array[i];
        }
        if(i!=-1){t4=t3+1;}
        else t4=t3;
        t2=array[temp];
        for( i=t4;t2==k&&i<array.length;i++){
            t2=array[i];
            num++;
        }
        if(i!=array.length) --num;
        return num;
    }
    
}