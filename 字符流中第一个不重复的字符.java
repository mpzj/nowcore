public class Solution {
    //Insert one char from stringstream
    int flag[]=new int[256];
    int index=0;
    public Solution(){
        for(int i=0;i<256;i++){
            flag[i]=-1;
        }
    }
    
    public void Insert(char ch)
    {
        if(flag[ch]==-1) {flag[ch]=index;}
        else if(flag[ch]>=0){flag[ch]=-2;}
        index++;
    }
  //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
    
        char ch='\0';
        int minIndex=Integer.MAX_VALUE;
        for(int i=0;i<256;i++){
            if(flag[i]>=0&&flag[i]<minIndex){
                ch=(char)i;
                minIndex=flag[i];
            }
        }
        if(ch == '\0') return '#';
        return ch;
    }
}