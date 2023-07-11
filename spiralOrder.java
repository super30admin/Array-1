// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
/**
 * 1. Create four variables top, down, left and right to keep track of the boundaries of the matrix.
 * 2. Create a variable direction to keep track of the direction of traversal.
 * 3. If direction is 0, traverse from left to right. If direction is 1, traverse from top to down. If direction is 2, traverse from right to left. If direction is 3, traverse from down to top.
 * 4. Increment direction by 1 and take mod 4 to keep it in the range of 0 to 3.
 * 5. Repeat the above steps until top<=down and left<=right.
 */

// Your code here along with comments explaining your approach

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int top = 0, down = m-1, left = 0, right = n-1;
        int direction = 0;
        List<Integer> result = new ArrayList<>();

        while(top<=down && left<=right){
            if(direction == 0){
                for(int i=left; i<=right; i++){
                    result.add(matrix[top][i]) ;
                }
                top++;
            }else if(direction == 1){
                for(int i=top; i<=down; i++){
                    result.add(matrix[i][right]);
                }
                right--;
            }else if(direction == 2){
                for(int i=right; i>=left; i--){
                    result.add(matrix[down][i]);
                }
                down--;
            }else if(direction == 3){
                for(int i=down; i>=top; i--){
                    result.add(matrix[i][left]);
                }
                left++;
            }

            direction++;
            direction %= 4;
        }

        return result;
    }
}