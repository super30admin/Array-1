/*
* Approach:
*  1. Considering two direction up and down as true and false
* 
*  2. When moving up,
        row decrements and col increments

        edgecases:
            col == n-1 => col cant be incremented
                    increase the row and flip the direction
            
            row == 0 -> row cant be decremented
                increase the col and flip the direction
* 
*  3. When moving down,
        row increments and col decrements

        edgecases:
            row == m-1 -> row cant be incremented
                increase the col and flip the direction
            col == 0 => col cant be decremented
                    increase the row and flip the direction     
* 
* 
* Did this code successfully run on Leetcode : YES
* 
* Any problem you faced while coding this : NO
* 
* Time Complexity: O(m*n)
* 
* Space Complexity: O(1)
* 
*/
public class DiagonalTraversal {
    public int[] findDiagonalOrder(int[][] mat) {
        boolean direction = true;

        int row = 0, col = 0, index = 0,
                m = mat.length, n = mat[0].length;

        int[] result = new int[m * n];

        while (index < (m * n)) {
            result[index] = mat[row][col];
            index++;

            // up direction
            if (direction) {
                if (col == n - 1) {
                    direction = false;
                    row++;
                } else if (row == 0) {
                    direction = false;
                    col++;
                } else {
                    row--;
                    col++;
                }
            } else {
                if (row == m - 1) {
                    direction = true;
                    col++;
                } else if (col == 0) {
                    row++;
                    direction = true;
                } else {
                    row++;
                    col--;
                }
            }
        }

        return result;
    }
}
