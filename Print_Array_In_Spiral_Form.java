//Approach - layer by layer pass
// included 4 variables left (0), right(matrix[0].length), up (0), down (matrix.length)
// print all the variables from left to right(top side), then top to bottom(right side), right to left(bottom side), bottom to top(left side)
//The end condition would be when the result size equals to the matrix length*width, which means all elements are added in the result.

//Time - O(MxN) - where M is length of matrix , N is width of matrix
//Space - O(1) - excluding the result List<Integer>

class Solution {
  public List<Integer> spiralOrder(int[][] matrix) {

    if(matrix == null || matrix.length == 0){
      return new ArrayList<>();
    }

    List<Integer> result = new ArrayList<>();

    int m = matrix.length, n = matrix[0].length;
    int left=0, right = matrix[0].length-1, up=0, down = matrix.length-1;

    while(result.size() < m*n){

      for(int i=left; i<=right && result.size() < (m*n); i++){
        result.add(matrix[up][i]);
      }

      for(int i=up+1; i<=down-1 && result.size() < (m*n); i++){
        result.add(matrix[i][right]);
      }

      for(int i=right; i>=left && result.size() < (m*n); i--){
        result.add(matrix[down][i]);
      }

      for(int i=down-1; i>=up+1 && result.size() < (m*n); i--){
        result.add(matrix[i][left]);
      }

      up++; down--; left++; right--;
    }

    return result;
  }
}