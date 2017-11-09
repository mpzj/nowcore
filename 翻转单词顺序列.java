public class Solution {
    public String ReverseSentence(String str) {
        if(str.trim().equals("")) return str;
        String result="";
        String[] c1= str.split(" ");
        for(int i=c1.length-1;i>=0;i--){
            if(i!=0){result+=c1[i]+" ";}
            else{result+=c1[i];}
        }
        return result;
    }
}