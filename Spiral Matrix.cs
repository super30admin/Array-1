/*
  Time complexity: O(m*n)
  Space complexity: O(1)

  Code ran successfully on Leetcode: Yes

  Approach: Each of the iterations has 4 internal iterations namesly top row,right column,bottom row and left column.

*/

public class Solution {
    public IList<int> SpiralOrder(int[][] matrix) {
        List<int> result = new List<int>();

        int top = 0, bottom = matrix.Length-1, left = 0, right = matrix[0].Length-1;

        while(top<=bottom && left<=right)
        {
            for(int i=left;i<=right;i++)
            {
                result.Add(matrix[top][i]);
            }
            top++;

            for(int i=top;i<=bottom;i++)
            {
                result.Add(matrix[i][right]);
            }
            right--;

            if(top<=bottom)
            {
                for(int i=right;i>=left;i--)
                {
                    result.Add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left<=right)
            {
                for(int i=bottom;i>=top;i--)
                {
                    result.Add(matrix[i][left]);
                }
                left++;
            }
        }
        return result;
    }
}
