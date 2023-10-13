// Time Complexity : O(Max(M,N))  where M is rows & N is columns
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

public class SpiralMatrix
{
    class Solution {
        public List<Integer> spiralOrder(int[][] matrix)
        {
            List<Integer> ans = new  ArrayList();
            int left = 0, top = 0;
            int right = matrix[0].length-1, bottom = matrix.length-1;

            while(top <= bottom && left <= right)
            {
                // left ---> right traverse
                for(int i = left; i <= right; i++)
                {
                    ans.add(matrix[top][i]);
                }
                top++;
                // top ---> bottom traverse
                for(int i = top; i <= bottom; i++)
                {
                    ans.add(matrix[i][right]);
                }
                right--;

                if(top <= bottom)
                {
                    // right ---> left traverse
                    for(int i = right; i >= left; i--)
                    {
                        ans.add(matrix[bottom][i]);
                    }
                    bottom--;
                }
                if(left <= right)
                {
                    // bottom ---> top traverse
                    for(int i = bottom; i >= top; i--)
                    {
                        ans.add(matrix[i][left]);
                    }
                    left++;
                }
            }
            return ans;
        }
    }
}
