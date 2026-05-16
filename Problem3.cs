// Time Complexity : O(m*n) where n is the total number of rows and m is the total number of columns of mat
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

public class Solution {
    public IList<int> SpiralOrder(int[][] matrix) {
        List<int> result = new();
        int rows = matrix.Length, columns = matrix[0].Length;
        int top = 0, bottom = rows - 1, left = 0, right = columns - 1;

        while(top <= bottom && left <= right)
        {
            // left
            for(int i = left; i <= right; i++)
            {
                result.Add(matrix[top][i]);
            }

            top += 1;

            if(top <= bottom && left <= right)
            {
                // bottom
                for(int i = top; i <= bottom; i++)
                {
                    result.Add(matrix[i][right]);
                }

                right -= 1;
            }

            if(top <= bottom && left <= right)
            {
                // right
                for(int i = right; i>= left; i--)
                {
                    result.Add(matrix[bottom][i]);
                }

                bottom -= 1;
            }

            if(top <= bottom && left <= right)
            {
                // top
                for(int i = bottom; i>=top; i--)
                {
                    result.Add(matrix[i][left]);
                }

                left += 1;
            }
        }

        return result;
    }
}