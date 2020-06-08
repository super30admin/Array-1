// Time Complexity : O(m*n) where m is number of rows, n is number of columns
// Space Complexity :O(1)  
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] matrix) {
        if(matrix==null || matrix.length==0) return new int[0];
        int dir = 1;
        int[] result = new int[matrix.length*matrix[0].length];
        int index = 0, row = 0, col = 0;
        while(index<result.length)
        {
            result[index] = matrix[row][col];
            if(dir==1) //Diagonally upward direction
            {
                if(col==matrix[0].length-1) //extreme right column, increase row
                {
                    row++;
                    dir=-1;
                }
                else if(row==0)             //extreme top row, increase column
                {
                    col++;
                    dir = -1;
                }
                else                        //increase col and reduce row, to move upward
                {
                    row--;
                    col++;
                }
            }
            else if(dir==-1) //Diagonally downward direction
            {
                if(row==matrix.length-1)   //extreme bottom row, increase column
                {
                    col++;
                    dir=1;
                }
                else if(col==0)           //extreme left column, increase row
                {
                    row++;
                    dir = 1;
                }
                else                        //decrease col and increase row, to move downward
                {
                    row++;
                    col--;
                }
            }
            index++;
        }
        return result;
    }
}