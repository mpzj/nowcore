import java.util.ArrayList;
public class Solution {
    ArrayList<Integer> result=new ArrayList<Integer>();
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        int rowlen=matrix.length;
        int collen=matrix[0].length;
        int rowS=0;
        int rowE=rowlen-1;
        int colS=0;
        int colE=collen-1;
        while(rowS<=rowE&&colS<=colE){
             printOCofMatrix(matrix,rowS,rowE,colS,colE);
            rowS++;
            rowE--;
            colS++;
            colE--;
        }
        return result;
    }
    public void printOCofMatrix(int [][] matrix,int rowS,int rowE,int colS,int colE){
      if(rowS<=rowE&&colS<=colE){
        for(int i=colS;i<=colE;i++){
            result.add(matrix[rowS][i]);
        }
        for(int i=rowS+1;i<=rowE;i++){
            result.add(matrix[i][colE]);
        }
        for(int i=colE-1;i>=colS&&i>=0;i--){
            if(rowE!=rowS) result.add(matrix[rowE][i]);
        }
        for(int i=rowE-1;i>=rowS+1&&i>=0;i--){
            if(colE!=colS) result.add(matrix[i][colS]);
        }
      }
    }
}