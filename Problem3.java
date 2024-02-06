// https://leetcode.com/problems/spiral-matrix/description/

// Time Complexity : Optimized - O(MN), where M*N is the number of elements in input matrix
// Space Complexity : Optimized - O(1), only op array list is used and it does not count as extra space
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Maintain boundaries: top, bottom, left and right
// Each iteration will change these values and make the boundary smaller,
// that is move to the next smaller spiral until top crosses bottom, or left crosses right

// Your code here along with comments explaining your approach

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        // Varibales to keep track of spiral boundary
        int top=0, bottom=matrix.length-1;
        int left=0, right=matrix[0].length-1;

        List<Integer> op=new ArrayList<>();

        while(top<=bottom && left<=right){
            // Top row
            for(int i=left;i<=right;i++){
                op.add(matrix[top][i]);
            }
            // Inc top as we have just traversed it
            top++;

            // Right row
            // Check while loop condition again as we have mutated top
            if(top<=bottom && left<=right){
                for(int i=top;i<=bottom;i++){
                    op.add(matrix[i][right]);
                }
                // Dec right as we have just traversed it
                right--;
            }

            //Bottom row
            // Check while loop condition again as we have mutated top and right
            if(top<=bottom && left<=right){
                for(int i=right;i>=left;i--){
                    op.add(matrix[bottom][i]);
                }
                // Dec bottom as we just traversed it
                bottom--;
            }

            //Left row
            //Check while loop condition again as we have mutated top,right and bottom
            if(top<=bottom && left<=right){
                for(int i=bottom;i>=top;i--){
                    op.add(matrix[i][left]);
                }
                // Inc left as we just traversed it
                left++;
            }            
        }

        return op;
    }
}