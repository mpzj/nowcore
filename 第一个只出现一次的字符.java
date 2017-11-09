public class Solution {
    public int FirstNotRepeatingChar(String str) {
        char c[]=str.toCharArray();
        int a[]=new int['z'+1];
        for(int i=0;i<c.length;i++){
            a[(int)c[i]]++;
        }
        for(int i=0;i<c.length;i++){
            if(a[(int)c[i]]==1) return i;
        }
        return -1;
    }
}