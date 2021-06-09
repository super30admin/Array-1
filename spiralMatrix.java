// Time Complexity : o(mn) ---- mn is length of matrix
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int row = matrix.length, col = matrix[0].length;
        int top = 0, bot = row-1;
        int left = 0, right = col-1;
        List<Integer> result = new ArrayList<>();
        while(top <= bot && left <= right){
            //top
            if(top <= bot && left <= right){
                for (int i=left; i<=right; i++){
                result.add(matrix[top][i]);
                }
            top = top+1;
                
            }
            
            //right
            if(top <= bot && left <= right){
                for(int i=top; i<=bot; i++){
                 result.add(matrix[i][right]);
                }
            right = right-1;
                
            }
            
            //bottom
            if(top <= bot && left <= right){
                for (int i=right; i>=left; i--){
                result.add(matrix[bot][i]);
                }
            bot = bot - 1;
                
            }
            
            
            //left
            if(top <= bot && left <= right){
                          for(int i=bot; i>=top; i--){
                 result.add(matrix[i][left]);
                }
            left = left+1;
                
            }
  
        }
        return result;
    }
}