import java.util.Arrays;

public class TraverseMatrixDiagonal {

    public static int[] findDiagonalOrder(int[][] mat) {

        int dir = 1;
        int col=0;
        int row=0;
        int i=0;
        int[] result = new int[mat.length * mat[0].length];

        int max=mat.length * mat[0].length;

        while(i< max){
            if(dir==1){
                while(row>=0 && col<=mat[0].length-1 && i< max){
                    result[i]= mat[row][col];
                    i++;
                    col++;
                    row--;
                }
                col--;
                row++;

                if(col==mat[0].length-1){
                    row++;
                    dir=0;
                }else if(row==0){
                    col++;
                    dir=0;
                }

            }

            if(dir==0){
                while(col>=0 && row<=mat.length-1 && i< max){
                    result[i]= mat[row][col];
                    i++;
                    col--;
                    row++;
                }
                col++;
                row--;

                if(row==mat.length-1){
                    col++;
                    dir=1;
                }else if(col==0){
                    row++;
                    dir=1;
                }
            }
        }
        return result;
    }

    public static void main(String[] args){
        System.out.println("Diagonal traverse of given matrix : " +
                        Arrays.toString(
                findDiagonalOrder(new int[][]{
                {1,2,3},{4,5,6},{7,8,9}
        })));
    }
}
