package S30.Arrays_1;

/*
Time Complexity : Put: O(mn)
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : None
*/

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrixTraversal {

    public List<Integer> spiralOrder(int[][] matrix) {


        List<Integer> result = new ArrayList<>();

        if(matrix == null || matrix.length == 0) return result;
        int top = 0;
        int left = 0;
        int right = matrix[0].length-1;
        int bottom = matrix.length-1;
        helper(matrix,top,right,bottom,left,result);
        return result;
    }

    public void helper(int[][] matrix, int top, int right, int bottom, int left, List<Integer> result){

        if(left > right || top > bottom) return;

        for(int i = left; i <= right; i++){
            result.add(matrix[top][i]);
        }
        top++;

        for(int i = top; i <= bottom; i++){
            result.add(matrix[i][right]);
        }
        right--;

        if(top <= bottom){
            for(int i = right; i >= left; i--){
                result.add(matrix[bottom][i]);
            }
            bottom--;
        }

        if(left <= right){
            for(int i = bottom; i >= top; i--){
                result.add(matrix[i][left]);
            }
            left++;
        }

        helper(matrix,top,right,bottom,left,result);
    }
}
