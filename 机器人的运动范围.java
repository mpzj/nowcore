public class Solution {
    public int movingCount(int threshold, int rows, int cols)
    {
        boolean flag[][] = new boolean[rows][cols];
        return move(threshold,rows, cols,0,0,flag);
    }
    private int move(int threshold, int rows, int cols,int i,int j,boolean[][] flag){
        
        if(i<0||i>=rows||j<0||j>=cols||(numSum(i)+numSum(j))>threshold||flag[i][j]){
            return 0;
        }
        flag[i][j] = true;
        return move(threshold,  rows,  cols,i-1, j, flag)
            + move(threshold,  rows,  cols,i+1, j, flag)
            + move(threshold,  rows,  cols,i, j-1, flag) 
            + move(threshold,  rows,  cols,i, j+1, flag) 
            + 1;
    }
    private int numSum(int i) {
        int sum = 0;
        do{
            sum += i%10;
        }while((i = i/10) > 0);

        return sum;
    }
}