// Time Complexity : O(n)
// Space Complexity : O(1) not using any auxillary space
// Did this code successfully run on Leetcode : Yes, 2ms
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

//Basically traversing through the array from left to right and finding the boundary elements, if the row boundary is hit, column is incremented/decremented depending on the direction which needs to be traversed.
// Similarly, if the column boundary is hit, row is incremented/decremented, till all the elements are traversed.

class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        
    if (matrix == null || matrix.length == 0)
            return new int[0];
    int rows = matrix.length, cols = matrix[0].length;
    int r = 0, c = 0, index = 0;
    int total = rows * cols;
    int[] res = new int[total];
     for (int k = 0; k < total; ++k){
            res[index++] = matrix[r][c];
            if ((r + c) % 2 == 0){
                if (c == cols - 1){
                    r++;
                } else if (r == 0){
                    c++;
                } else {
                    r--;
                    c++;
                }
            }else {
                if (r == rows - 1){
                    c++;
                } else if (c == 0){
                    r++;
                } else {
                    r++;
                    c--;
                }
            }
        }
        return res;
    }
    
}