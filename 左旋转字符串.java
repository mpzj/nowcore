import java.util.*;
public class Solution {
    public String LeftRotateString(String str,int n) {
        if(str.length()==0) return "";
        n=n%str.length();
        char st2[]=str.toCharArray();
        String str3="";
        for(int i=n;i<str.length()+n;i++){
            int j=i%str.length();
            str3+=st2[j];
        }
        return str3;
    }
}

//class Solution {
//public:
//    string LeftRotateString(string str, int n) {
//        int len = str.length();
//        if(len == 0) return "";
//        n = n % len;
//        str += str;
//        return str.substr(n, len);
//    }
//};