public class Solution {
    public int StrToInt(String str) {
        if(str.length()==0) return 0;
        int a[]=new int[str.length()];
        int result=0;
        int flag=0;
        if(str.charAt(0)=='+'||str.charAt(0)=='-') flag=1;
        for(int i=flag;i<str.length();i++){
            char c=str.charAt(i);
            if(c<'0'||c>'9'){
                return 0;
            }else if(c>='0'&&c<='9'){
                a[i]=(int)(c-'0');
            }
            result+=a[i]*(int)Math.pow(10,str.length()-i-1);
        }
        if(str.charAt(0)=='-') result=-result;
        return result;
    }
}