//num1,num2�ֱ�Ϊ����Ϊ1�����顣��������
//��num1[0],num2[0]����Ϊ���ؽ��
public class Solution {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        boolean flag;
        int num=0;
        for(int i=0;i<array.length;i++){
            flag=false;
            for(int j=0;j<array.length;j++){
                if(j!=i&&array[i]==array[j]) flag=true;
            }
            if(!flag&&num==0) {
                num1[0]=array[i];
                num++;
            }else if(!flag&&num==1) {
                num2[0]=array[i];
                num++;
            }
        }
    }
}