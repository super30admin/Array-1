// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

import java.util.ArrayList;
import java.util.List;

/**
 * In this problem, we are doing a spiral traversal on a m*n matrix. For the spiral traversal, we are
 * considering the matrix having four border walls, left, right , top and bottom. We are moving from left to right and then
 * top to bottom .
 */
// Your code here along with comments explaining your approach


public class Problem3 {
    public List<Integer> spiralOrder(int[][] matrix) {

        //to store the result
        List<Integer> result = new ArrayList<>();

        int m = matrix.length;
        int n = matrix[0].length;
        //four borders
        int left =0;
        int right = n-1;
        int top =0;
        int bottom = m-1;

        while(top<=bottom && left<=right){

            //top row
            if(top<=bottom && left<=right){
                for(int i = left; i<=right; i++){

                    result.add(matrix[top][i]);

                }
            }
            top++;

            //right wall
            if(top<=bottom && left<=right){
                for(int j=top; j<=bottom; j++){
                    result.add(matrix[j][right]);
                }
            }
            right--;

            //bottom wall
            if(top<=bottom && left<=right){
                for(int k=right; k>=left; k--){
                    result.add(matrix[bottom][k]);
                }
            }
            bottom--;

            //left wall
            if(top<=bottom && left<=right){
                for(int p = bottom; p>=top; p--)
                {
                    result.add(matrix[p][left]);

                }
            }
            left++;

        }
        return result;
    }
}
