// we can have 4 dir variables left, right, top, bottom
// we change direction at four place
// base case : top <= bottom && left <= right
// we can also solve using recursion but take extra recursive stack space due to no of spirals
// DP is not required becoz there is no overlapping subproblem

// Time : O(m*n)
// Space : O(1) 



import java.util.*;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int top = 0, bottom = m-1, left = 0, right = n-1;

        List<Integer> result = new ArrayList<>();

        helper(matrix, top, left, bottom, right, result);

        return result;
    }

    private void helper(int[][] matrix, int top, int left, int bottom, int right, List<Integer> result) {
        // base case 
        if(top > bottom || left > right) return;

            for(int i=left; i<=right; i++) {
                result.add(matrix[top][i]);
            }
            top++; //mutating here

            if(top <= bottom)
            {
                for(int i=top; i<=bottom; i++) {
                    result.add(matrix[i][right]);
                }
                right--;
            }

            if(top <= bottom)
            {
                for(int i=right; i>=left; i--) {
                result.add(matrix[bottom][i]);
                }
                bottom--;
            }
            
            if(left <= right)
            {
                for(int i=bottom; i>=top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
            helper(matrix, top, left, bottom, right, result);
    }
}