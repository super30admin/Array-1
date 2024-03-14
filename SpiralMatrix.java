// Time Complexity : O(m*n) where 'm' is the row and 'n' is the column.
// Space Complexity : O(1) for constant space.
// Did this code successfully run on Leetcode : Yes, https://leetcode.com/problems/spiral-matrix/
// Any problem you faced while coding this : No


class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length; // rows
        int n = matrix[0].length; // columns
        List<Integer> result = new ArrayList<>();
        int top = 0, bottom = m-1, left = 0, right = n-1;
        while(left<=right && top<=bottom){

            if(left<=right && top<=bottom){
                // top row;
            for(int j=left;j<=right;j++){
                result.add(matrix[top][j]);
            }
            top++;
        }
            
           if(left<=right && top<=bottom){
            // right column
            for(int i = top;i<=bottom;i++){
                result.add(matrix[i][right]);
         }
            right--;
        }
            

          if(left<=right && top<=bottom){
             //bottom row
            for(int j=right;j>=left;j--){
                 result.add(matrix[bottom][j]);
            }
             bottom--;
          }

         if(left<=right && top<=bottom){
           //left row
           for(int i=bottom;i>=top;i--){
             result.add(matrix[i][left]);
           }
           left++;
         }
          
        }

        return result;
    }
}
