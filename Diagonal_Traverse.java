// Time Complexity : O(m * n) -> To traverse 'm' rows and 'n' columns in the given matrix
// Space Complexity : O(1) -> An array created is returned as an output so no extra space used
// Did this code successfully run on Leetcode : Yes
// We traverse the given matrix in upward and downward diagonal direction based on the current position of row and column pointers. We use a direction pointer to decide whether to traverse in upward or downward direction. We fill in the output array with elements from the matrix as we traverse it.

// Your code here along with comments explaining your approach
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        // Base condition
        if(mat == null || mat.length == 0 || mat[0].length == 0){
            return new int[0]; // return empty array
        }

        // Number of rows and columns
        int m = mat.length; // 'm' rows
        int n = mat[0].length; // 'n' columns

        // Initialize pointers to traverse matrix of size m * n
        int i = 0;
        int j = 0;
        int dirs = 1; // dirs pointer to decide direction to traverse in matrix

        // Initialize index pointer to fill in the output array with elements
        int index = 0; 

        // Create an output array - size is equal to number of elements in input array - m * n
        int[] output = new int[m * n];

        // Traverse the given matrix based on upward/downward direction and fill in output array until index < m * n (length of matrix)
        while(index < m * n){
            output[index] = mat[i][j];
            index += 1;
            // Traversing in upward direction
            if(dirs == 1){
                // last column - upward to downward direction change, next row
                if(j == n - 1){
                    dirs -= 1; // direction change to downward
                    i++; 
                // 1st row - upward to downward direction change, next column
                }else if(i == 0){
                    dirs -= 1; // direction change to downward
                    j++; 
                // except 1st row and last column - tarversal to upward direction is done by decrementing row and incrementing column
                }else{
                    i--;
                    j++;
                }
            // Traversing in downward direction
            }else{
                // last row - downward to upward direction change, next column
                if(i == m - 1){
                    dirs += 1; // direction change to upward
                    j++; 
                // 1st column - downward to upward direction change, next row
                }else if(j == 0){
                    dirs += 1; // direction change to upward
                    i++; 
                // except last row and 1st column - traversal to downward direction is done by incrementing row and decrementing column
                }else{
                    i++;
                    j--;
                }
            }

        }
        return output;
    }
}