// Time Complexity :O(m*n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Three line explanation of solution in plain english
//In this approach we simply take two variables 'r' for row and 'c' for column. We take another variable dir for maintaining the direction.
//When we want to diagonally move up in an array we use '1' and when we want to move diagonally down we use dir '-1'.
// Your code here along with comments explaining your approach
class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
         if(matrix == null || matrix.length==0)
          return new int[0];
      int m = matrix.length;
      int n = matrix[0].length;
      int[] result = new int[m*n];
     
          
      int i = 0;
      int dir = 1;
      int r =0;
      int c = 0;
      
      while(i < m*n)
      {
        result[i] = matrix[r][c];
        if(dir ==1)
        {
        if(c == n-1)
        {
          r++;
          dir = -1;
          
        }
        else if(r ==0)
        {
          c++;
          dir = -1;
        }
        else
        {
          r--;
          c++;
        }
        }
        else
        {
          if(r == m-1)
        {
          c++;
          dir = 1;
          
        }
        else if(c ==0)
        {
          r++;
          dir = 1;
        }
        else
        {
          c--;
          r++;
        }
        }
        i++;
      }
      return result;
    }
}