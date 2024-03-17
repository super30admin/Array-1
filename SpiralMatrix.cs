// Time Complexity :O(m * n), where m is the number of rows and n is the number of columns in the matrix.
// Space Complexity :O(m * n), where m is the number of rows and n is the number of columns in the matrix.
// Did this code successfully run on Leetcode :Yes
// Three line explanation of solution in plain english

// The approach iterates through the matrix in a spiral manner, starting from the outermost layer and moving towards the center.
// It maintains four pointers representing the boundaries of the current layer (top, bottom, left, and right), incrementing or decrementing them as the traversal progresses.
// Elements are added to the result list as the traversal moves along the top row, right column, bottom row, and left column, adjusting the pointers accordingly until the entire matrix is traversed in a clockwise spiral order.
public class Solution {
    public IList<int> SpiralOrder(int[][] matrix) {
        int m = matrix.Length;
        int n = matrix[0].Length;
        List<int> result = new List<int>();
        int top=0;
        int bottom = m-1;
        int left =0;
        int right = n-1;

        while(left <= right && top <= bottom)
        {
            //top row
            for(int j=left; j<=right; j++)
            {
                result.Add(matrix[top][j]);
            }
            top++;
            
            //right col
            for(int i= top; i<=bottom; i++)
            {
                result.Add(matrix[i][right]);
            }
            right--;

            //bottom row
            if(top <= bottom)
            {
            for(int j = right; j>=left; j--)
            {
                result.Add(matrix[bottom][j]);
            }
            bottom--;
            }
            
            if(left <= right)
            {
            //left col
            for(int i=bottom; i>=top; i--)
            {
                result.Add(matrix[i][left]);
            }
            left++;
            }
        }
        return result;
    }
}