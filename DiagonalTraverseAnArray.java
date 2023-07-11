// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

public class DiagonalTraverseAnArray {
    public static int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length; // row length
        int n = mat[0].length;  // col length
        int[] result = new int[m*n];

        int i = 0;
        boolean direction = true; // moving up
        int row=0, col=0;

        while(true) {

            if(i>result.length-1) break;
            result[i] = mat[row][col];
            i++;

                if (direction) {    // moving up
                    if (col == n - 1) {
                        row++;
                        direction = false;   //set to move down
                    } else if (row == 0) {
                        col++;
                        direction = false;    //set to move down
                    } else {
                        row--;
                        col++;
                    }
                }
                else{                       //moving down
                     if (row == m -1) {
                        col++;
                        direction = true;       //set to move up
                    } else if (col == 0) {
                         row++;
                         direction = true;       //set to move up
                    } else {
                        row++;
                        col--;
                    }
            }
            }
       return result;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        findDiagonalOrder(matrix);
    }
}
