// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
//https://leetcode.com/problems/spiral-matrix/
//Start from 0,0
//Keep 4 variables top, bottom, left, right and update them as u hit the boundaries, then u will know when to updat ethe row an column and read next value in spiral fashio
 public IList<int> SpiralOrder(int[][] matrix) {
        if(matrix == null || matrix.Length == 0)
            return new List<int>();
        
        int m = matrix.Length;
        int n = matrix[0].Length;
        int top = 0;
        int bottom = m - 1;
        int left = 0;
        int right = n - 1;
        
        List<int> result = new List<int>();

        while(top <= bottom && left <= right)
        {
            //left to right
            for(int j = left; j <= right; j++)
            {
                result.Add(matrix[top][j]);
            }
            top++;
            //top to bottom
            for(int i = top; i <= bottom; i++)
            {
                result.Add(matrix[i][right]);
            }
            right--;
            
            //right to left
            if(top <= bottom)
            {
                for(int j = right ; j >= left; j--)
                {
                    result.Add(matrix[bottom][j]);
                }
                bottom--;
            }
            
            //bottom to top
            if(left <= right)
            {
                for(int i = bottom; i >= top; i--)
                {
                    result.Add(matrix[i][left]);
                }
                left++;
            }
        }
        
        return result;
    }