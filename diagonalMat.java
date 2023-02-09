
// Time Complexity : O(m*n)
// Space Complexity : O(1) not considering the output space
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english
//set the constraints proper to traverse the path
// Your code here along with comments explaining your approach

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;
        int size = rows * cols;
        int ind = 0, i = 0, j = 0;
        int[] ans = new int[size];
        while (ind < size) {
            // goes top
            while (i >= 0 && j < cols) {
                ans[ind++] = mat[i--][j++];
            }
            if (j == cols) {
                i += 2;
                j--;
            } else
                i++;

            // goes bottom
            while (i < rows && j >= 0) {
                ans[ind++] = mat[i++][j--];
            }
            if (i == rows) {
                j += 2;
                i--;
            } else {
                j++;
            }
        }
        return ans;
    }
}