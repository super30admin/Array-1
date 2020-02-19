// Time Complexity : O(M*N)
// Space Complexity : O(M*N) since the output array count as extra space for the purpose of space complexity analysis if its not mentioned in the question
// Did this code successfully run on Leetcode : Yes
// Your code here along with comments explaining your approach

class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
       if (matrix == null ||  matrix.length == 0) return new int[0];
        int m = matrix.length, n = matrix[0].length, i=0;
        int r=0, c=0;
        int direction = 1;
        int[] result = new int[m*n];
        while (i < m*n)
        {
            result[i]=matrix[r][c];
            if (direction == 1)
            {
               if (c == n-1)
               {
                   r++;
                   direction = -1;
               }else if (r == 0)
               {
                   c++;
                   direction = -1;
               } else  {
                   r--;
                   c++;
               }
            } else{
                 if (r == m-1)
                {
                    c++;
                    direction = 1;
                }
                else if (c == 0)
                {
                    r++;
                    direction = 1;
                } else
                {
                    r++;
                    c--;
                }
            }
            
            i++;
        }
        return result;
    }
}