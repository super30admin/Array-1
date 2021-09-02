// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes

// At first traverse in upwards direction diagonally until you hit the array bounds
// then change the direction to downwards diagonally until you again hit the array bounds

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        // check for null or empty matrix
        if(mat == null || mat.length == 0) return new int[0];
        int dir = 1; // initialize direction: up
        int m = mat.length; // number of rows
        int n = mat[0].length; // number of columns
        // create a new array of m*n size
        int[] res = new int[m*n];
        int i = 0; int j = 0; // initalize the first element of matrix to be stored
        int k = 0;
        while(k < m*n){
            // store the element in matrix
            res[k] = mat[i][j];
            k++;
            // if the traversing direction is upwards
            if(dir == 1){
                //if we hit the last column then change the row and direction
                if(j == n - 1){
                    i++;
                    dir = -1;
                }
                // if we hit the first row then change the column and direction
                else if(i == 0){
                    j++;
                    dir = -1;
                } else {
                    // else keep traversing upwards diagonally
                    i--;
                    j++;
                }
            }
            else {
                // traversing direction is downwards
                if(i == m - 1){
                    // if we hit the last row then change the column and direction
                    j++;
                    dir = 1;
                } else if(j == 0){
                    // if we hit the last column then change the row and direction
                    dir = 1;
                    i ++;
                } else {
                    // else keep traversing downwards diagonally
                    i++;
                    j--;
                }
            }

        }
        return res;

    }
}