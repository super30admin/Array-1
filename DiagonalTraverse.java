// 498. Diagonal Traverse
// https://leetcode.com/problems/diagonal-traverse/description/

/**
 * Time Complexity :  O(n * m) where n = row, m = cols. Since we store each element in resultant array
 * Space Complexity : O(1) since no extra linear space and answer array is not considered as auxillary space
 */

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        int ans[] = new int[n * m];

        boolean dir = true;

        int row = 0;
        int col = 0;

        for(int i = 0 ; i < n * m ; i++){
            ans[i] = mat[row][col];

            if(dir){ // if upward 
                if(row == 0 && col != m - 1){ // if upper boundary and not right boundary
                    dir = false; // change direction
                    col++; 
                }else if(col == m - 1){ // if right boundary
                    dir = false; // change direction
                    row++;
                }else{
                    row--;
                    col++;
                }
            }else{ // if downward
                if(col == 0 && row != n - 1){ // if left boundary and not bottom boudnary
                    dir = true; // change direction
                    row++;
                }else if(row == n - 1){ // if bottom boundary
                    dir = true; // change direction
                    col++;
                }else{
                    row++;
                    col--;
                }
            }
        }

        return ans;
    }
}