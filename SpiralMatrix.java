import java.util.List;
import java.util.ArrayList;
// Time Complexity : O(M*N)
// Space Complexity : O(M*N)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        // use left,right, top and buttom pointer to maintain the spiral
        // top prints rows from left to right
        // right prints cols from top to bottom
        // bottom prints rows from right to left
        // left prints cols from bottom to top
        List<Integer> result = new ArrayList<>();
        int left = 0, right = matrix[0].length - 1;
        int top = 0, bottom = matrix.length - 1;
        while(left <= right && top <= bottom)
        {
            // top row
            for(int i = left; i <= right; i++)
            {
                result.add(matrix[top][i]);
            }
            top++;
            // right col
            for(int i = top; i <= bottom; i++)
            {
                result.add(matrix[i][right]);
            }
            right--;
            // bottom row
            if(top <= bottom)
            {
                for(int i = right; i >= left; i--)
                {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }
            // left col
            if(left <= right && top <= bottom)
            {
                for(int i = bottom; i >= top; i--)
                {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }
        return result;
    }
}