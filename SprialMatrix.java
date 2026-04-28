// Time Complexity : O(n*m) where n is the number of rows and m is the number of columns in the matrix
// Did this code successfully run on Leetcode :Yes
// Three line explanation of solution in plain english 
// 1. We maintain four pointers to keep track of the current boundaries of the matrix (rowBegin, rowEnd, colBegin, colEnd).
// 2. We traverse the matrix in a spiral manner, moving right, down, left, and up,
//  while updating the boundaries after each traversal.
// 3. We continue this process until the pointers cross each other, indicating that we have traversed the entire matrix. 
// We store the elements in the result list as we traverse.
// The auxiliary space is O(1) as we are using only a few variables to keep track of the current position and boundaries, and the result list is not considered auxiliary space as it is required for the output.

// Your code here along with comments explaining your approac
import java.util.*;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> res = new ArrayList<>();

        int rowBegin = 0;
        int colBegin = 0;
        int rowEnd = matrix.length - 1;
        int colEnd = matrix[0].length - 1;

        while (rowBegin <= rowEnd && colBegin <= colEnd) {

            // move right
            for (int j = colBegin; j <= colEnd; j++) {
                res.add(matrix[rowBegin][j]);
            }
            rowBegin++;

            // move down
            for (int j = rowBegin; j <= rowEnd; j++) {
                res.add(matrix[j][colEnd]);
            }
            colEnd--;

            // move left
            if (rowBegin <= rowEnd) {
                for (int j = colEnd; j >= colBegin; j--) {
                    res.add(matrix[rowEnd][j]);
                }
                rowEnd--;
            }

            // move up
            if (colBegin <= colEnd) {
                for (int j = rowEnd; j >= rowBegin; j--) {
                    res.add(matrix[j][colBegin]);
                }
                colBegin++;
            }
        }

        return res;
    }
}