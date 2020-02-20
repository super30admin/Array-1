// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
 * At every element, based on the current position and direction, next step is determined. All boundary conditions needs to be handled 
 * gracefully. Please find below inline comments.
 */

class DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] matrix) {
        //edge case
        if(matrix == null || matrix.length == 0) return new int[]{};
        int rows = matrix.length, cols = matrix[0].length;
        // result array
        int[] result = new int[rows*cols];
        boolean up = true; // direction indicator
        int i = 0;
        int r = 0, c = 0; // starting coordinates
        while(i < rows*cols && r < rows && c < cols) {
            result[i++] = matrix[r][c]; // add element in result array
            if(up) { // when direction is upwards
                if(c == cols-1) { // important to check this boundary constraint first
                    r++;
                    up = !up;
                }
                else if(r == 0) { // second boundary condition
                    c++;
                    up = !up;
                }
                else { // if element is a non-boundary one, then decrease row and increase column
                    r--;c++;
                }
            }
            else { // when direction is downwards
                if(r == rows-1) { // check boundary
                    c++;
                    up = !up;
                }
                else if(c == 0) { // check column lower boundary
                    r++;
                    up = !up;
                }
                else { // if element is a non-boundary one, then decrease column and increase row
                    c--;r++;
                }
            }
        }
        return result;
    }
}
