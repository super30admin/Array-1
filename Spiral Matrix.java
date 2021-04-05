// Time Complexity : O(N*M)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0){
            return new ArrayList<>();
        }
        List<Integer> output = new ArrayList<>();
        int rows = matrix.length;
        int cols = matrix[0].length;
        int top = 0;
        int bottom = rows -1;
        int left = 0;
        int right = cols - 1;
        while(output.size() < rows * cols){
            
            for(int j = left; j <= right ; j++){
                output.add(matrix[top][j]);
            }
            top++;
            
            for(int i = top ; i <= bottom; i++){
                output.add(matrix[i][right]);
            }
            right--;
            
            if(output.size() ==  rows * cols){
                break;
            }
            
            for(int j = right; j >= left ; j--){
                output.add(matrix[bottom][j]);
            }
            bottom--;
            
            for(int i = bottom ; i >= top ; i--){
                output.add(matrix[i][left]);
            }
            left++;
            
            
        }
        return output;
    }
}
