//Time Complexity - O(MxN) - where M - height of matrix, N - width of matrix
//Space Complexity - O(1) - excluding the result int[]

//Approach - keep the dir variable 1 - upward, -1 downward
//print the variables upward by incrementing column and decrementing row
// change the direction if the row reaches 0 (col++) or column reaches n-1(row++)

//Similarly print the variables downward by incrementing row and decrementing column
// change the direction if the col reaches 0(row++) or row reaches m-1(col++)

class Solution {
  public int[] findDiagonalOrder(int[][] matrix) {

    if(matrix == null || matrix.length == 0){
      return new int[0];
    }
    int m=matrix.length;
    int n=matrix[0].length;

    int[] result = new int[m*n];

    int index=0, i=0, j=0, dir=1;

    while(index < m*n){
      //     System.out.println("here");

      result[index] = matrix[i][j];

      if(dir == 1){

        if(j == n-1){
          i++;
          dir = -1;
        }
        else if(i == 0){
          j++;
          dir = -1;
        }else{
          i--;
          j++;
        }
      }
      else{
        if(i == m-1){
          j++;
          dir = 1;
        }
        else if(j == 0){
          i++;
          dir = 1;
        }else{

          i++;
          j--;
        }
      }
      index++;
    }
    return result;
  }
}