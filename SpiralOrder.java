//Time Complexity : O(m*n)
//Space Complexity : O(m+n)


import java.util.ArrayList;
import java.util.List;

public class SpiralOrder {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> li = new ArrayList<>();

        // Directrions
        int top = 0;
        int left = 0;
        int bottom = matrix.length-1;
        int right = matrix[0].length-1;

        helper(matrix,top,bottom,left,right,li);
        return li;
    }

    private void helper(int[][] matrix, int top, int bottom, int left, int right, List<Integer> li) {
        //base case : while loop condition
        if(left > right || top > bottom) return;

        for (int i=left; i <= right; i++) {
            li.add(matrix[top][i]);
        }
        top++;
        //top to bottom
        if(top <= bottom) {
            for (int i=top; i <= bottom; i++) {
                li.add(matrix[i][right]);
            }
        }
        right--;
        //right to left
        if(top <= bottom) {
            for (int i=right; i >= left; i--) {
                li.add(matrix[bottom][i]);
            }
        }
        bottom--;
        //bottom to top
        if(left <= right) {
            for (int i=bottom; i >= top; i--) {
                li.add(matrix[i][left]);
            }
        }
        left++;
        helper(matrix,top,bottom,left,right,li);
    }
}
