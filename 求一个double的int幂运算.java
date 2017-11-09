public class Solution {
    public double Power(double base, int exponent) {
        double result=1.0;
        if(exponent==0) return 1.0;
        if(exponent<0) {
            for(int i=0;i<-exponent;i++){
               result=result/base;
            }
            //return result;
        }
        if(exponent>0){
           for(int i=0;i<exponent;i++){
            result=result*base;
           }
        }
        return result;
  }
}