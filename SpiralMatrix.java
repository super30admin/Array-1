// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// We take 4 pointers, left, right, top and bottom and undergo 4 passes each time by moving the pointers
// sequentially. First traverse from left to right and increment top; next traverse from top to bottom
// and decrement right; later traverse from right to left and decrement bottom; finally traverse from bottom to top, increment left

// Your code here along with comments explaining your approach

import java.util.*;

class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int top = 0; int bottom = m-1;
        int left = 0; int right = n-1;

        ArrayList<Integer> result = new ArrayList<>();

        while(top<=bottom && left<=right){
            for(int j =left; j<=right;j++){
                result.add(matrix[top][j]);
            }
            top++;

            if(left<=right){
                for(int j= top;j<=bottom;j++){
                    result.add(matrix[j][right]);
                }
            }
            right--;

            if(top<=bottom){
                for(int j= right;j>=left;j--){
                    result.add(matrix[bottom][j]);
                }
            }
            bottom--;

            if(left<=right){
                for(int j= bottom;j>=top;j--){
                    result.add(matrix[j][left]);
                }
            }
            left++;
        }

        return result;
    }
}