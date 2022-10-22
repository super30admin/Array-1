//TC O(m*n)
//SC O(1)
//works in leetcode
class MatrixDiagonalOrder {

    private static final int  UP=0, DOWN=1;

    public static int[] findDiagonalOrder(int[][] mat) {

        int m= mat.length;
        int n=mat[0].length;
        int [] result = new int [m*n];
        int resultIndex =0;

        int direction = UP;
        int row=0,col=0;

        while(resultIndex != m*n){
            result[resultIndex] = mat[row][col];
            resultIndex++;

            if(direction == UP){
                if(col==n-1){
                    direction = DOWN;
                    row++;
                }
                else if(row == 0){
                    direction = DOWN;
                    col++;
                }
                else{
                    row--;
                    col++;
                }

            }else
            {

                if(row == m-1){
                    direction = UP;
                    col++;
                }
                else if(col ==0){
                    direction = UP;
                    row++;
                }else{
                    row++;
                    col--;
                }

            }

        }

        return result;

    }


    public static void main(String [] args){
        int [][] matrix ={{1,2,3},{4,5,6},{7,8,9}};

        int [] out = findDiagonalOrder(matrix);

        for(int i=0; i < out.length;i++)
            System.out.println(out[i]);


    }
}