// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english : 
// * There are 4 pointers left, right , top and bottom to check the boundary condition. 
// *start from left and top most element, travesre column by column. Once we reach right most element 
// * traversing elements from top to bottom then in reverse that is right to left, then bottom to top till it breach the boundary condition.

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
      
      List<Integer> result = new ArrayList<>();
      //null cas      
      if(matrix == null || matrix.length == 0) {
        return result;
      }
      
      int m = matrix.length; int n = matrix[0].length;
      //set boundary pointers
      int left = 0;
      int right = n-1;
      int top = 0;
      int bottom = m-1;
      
      while(top <= bottom && left <= bottom) {
        //top row (left-right)
        for(int i = left; i<= right; i++) {
          result.add(matrix[top][i]);
        }
        top++;
        
        if(left<=right) {
          // right column (top-bottom)
           for(int j = top; j<= bottom; j++) {
            result.add(matrix[j][right]);
          }
          right--;
        }
        
        if(top <= bottom) {
          // bottom row (right-left)
          for(int i = right; i>= left; i--) {
            result.add(matrix[bottom][i]);
          }
          bottom--;
        }
        // left column(bottom- top)
        // right column (top-bottom)
        if(left<=right) {
           for(int j = bottom; j>= top; j--) {
            result.add(matrix[j][left]);
          }
          left++;
        }
      }
      return result;
    }
}