// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
//Three line explanation of solution in plain english : 
// * Dir variable is maintained to change the direction to print the elements in diagonal order.
// * start from first row and column add the element in arr and then change the direction.
// * then add the element in top to bottom order by changing row and column. Once it reaches to the end of the row 
// * change the direction again add the elements bottom to top order by changing row and column in diagonal fashion.

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
      //null case
      if(mat == null || mat.length == 0) {
        return new int[0];
      }
      
      int m = mat.length; 
      int n = mat[0].length;
      int[] result = new int[m*n];
      int r = 0; int c = 0; int dir = 1;
      int i = 0;
      while(i < m*n) {
        result[i] = mat[r][c];
        //print number bottom to up
        if(dir == 1) {
          if(c == n-1) {
            r++;
            dir = -1;
          } else if(r == 0) {
            c++;
            dir = -1;
          } else {
            r--;
            c++;
          }
        } else {
          //print all the elements from down to top
          if(r == m-1) {
            c++;
            dir = 1;
          } else if(c == 0) {
            r++;
            dir = 1;
          } else {
            r++;
            c--;
          }
      }
        i++;
    }
      return result;
    }
}