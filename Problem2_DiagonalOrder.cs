// Time Complexity : O(m*n)
// Space Complexity : O(m*n)
// Did this code successfully run on Leetcode : Yes
// Starting from the first element of the matrix mat, we traverse through elements in upward direction (direction =true, decrement row and increment column)
// until reaching the last column or first row, then change the direction to downwards (direction = false). Similarly traverse through the elements in downward 
// direction (direction = false, i++, j--) until reaching the last row or the first column, then change the direction to upwards.
//S tore the traversed element in the result array until all the elements are traversed.
public class Solution {
    public int[] FindDiagonalOrder(int[][] mat) {
        int m = mat.Length;
        int n = mat[0].Length;
        int[] result = new int[m*n];
        bool direction = true;
        int i = 0;
        int j = 0;
        result[0] = mat[i][j];
        for(int k = 1; k < (m*n); k++) {
            if(direction) {
                if(j == n-1) { // On reaching the last column of top row, change the direction to downwards and move to next row
                    i++;
                    direction = false;
                }
                else if(i == 0) { //On reaching top row, change the direction to downwards and move to next column
                    j++;
                    direction = false;
                }
                else { //Until reaching the top row or last column, keep moving upwards
                    i--; j++;
                }
            }
            else {
                if(i == m-1) {//On reaching last row, change the direction to upwards and move to next column
                    j++; direction = true;
                }
                
                else if(j == 0) {//On reaching first column, change the direction to upwards and move to next row
                    i++; direction = true;
                }
                else {//Until reaching the first column or last row, keep moving downwards
                    i++; j--;
                }
            }
            result[k] = mat[i][j];
        }
        return result;
    }
}
