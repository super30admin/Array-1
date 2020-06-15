//Time Complexity for the solution is O(m*n) when m is the row length and n is the column length
// and we have a space complexity of O(1) as we return the array which we used.

class Solution {
  public int[] findDiagonalOrder(int[][] matrix) {
    if(matrix.length == 0)
      return new int[0];
    int m = matrix.length; int n = matrix[0].length;
    int[] result = new int[m*n];
    int r =0, c=0, i=0, dir=1;
    while(i < m*n){
      result[i] = matrix[r][c];
      if(dir == 1){
        if(c == n-1){
          r++;
          dir=-1;
        }
        else if(r == 0){
          c++;
          dir=-1;
        }
        else{
          r--;
          c++;
        }
      }
      else{
        if(r == m-1){
          c++;
          dir=1;
        }
        else if(c == 0){
          r++;
          dir=1;
        }
        else{
          r++;
          c--;
        }
      }
      i++;
    }
    return result;
  }
}