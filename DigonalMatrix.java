package com.ds.rani.array;

/**
 * Given a matrix of M x N elements (M rows, N columns), return all elements of the matrix in diagonal order as shown in the below image.
 * Example:
 * Input:
 * [
 * [ 1, 2, 3 ],
 * [ 4, 5, 6 ],
 * [ 7, 8, 9 ]
 * ]
 *
 * Output: [1,2,4,7,5,3,6,8,9]
 */

//Apparoach : maintain boundries for rows and columns and check in which direction We want to traverse
    //For upward doagonal decrement row and increment col and for dowward diagonal increment row and decrement column
public class DigonalMatrix {

    //Time complexity:o(rows*columns)
    //space complexity;o(rows*columns) if I consider output space
    public static int[] findDiagonalOrder(int[][] matrix) {
        int rows=matrix.length;
        //Base case
        if(rows==0)
            return new int[0];

        int cols=matrix[0].length;
        int[] result=new int[rows*cols];

        int row=0;
        int col=0;
        int count=0;
        int dir=0;
        while(row>=0 && row<rows && col>=0 && col<cols){
            result[count++]=matrix[row][col];//00

            //go upside doagonally(decrement row and icrement column
            if(dir==0){
                //it recahes at location to change the order
                if(row-1<0 || col+1==cols){
                    //if column is less than number of colmuns then only increment it otherwise go to next row
                    if(col==cols-1)
                        row=row+1;
                    else
                        col=col+1;

                    dir=1;

                }else{
                    row=row-1;
                    col=col+1;
                }
            }
            else{ //go downsie doagonally(inceremt row and decremnt column)
                //If i go down further for next step and it makes my row or column out of bound then change direction
                if(row+1==rows || col-1<0){
                    if(row==rows-1)
                        col=col+1; //1
                    else
                        row++;
                    dir=0;

                }else{
                    row=row+1;//2
                    col=col-1;//0
                }
            }

        }
        return result;
    }
    public static void main(String[] args) {
        int matrix[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println( DigonalMatrix.findDiagonalOrder( matrix ) );
    }
}
