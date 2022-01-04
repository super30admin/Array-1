// Time Complexity : O(m*n); where m= number of rows and n = number of columns
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

// Your code here along with comments explaining your approach
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        
        // check if the matrix is null or empty
        if(matrix == null || matrix.length ==0) return result;
        
        // find number of rows and columns
        int m = matrix.length;
        int n = matrix[0].length;
        
        // initialize top, bottom, left and right pointers
        int top = 0;
        int bottom = m - 1;
        int left = 0;
        int right = n - 1;
        
        // keep repeating until pointers don't cross each other
        while(left <= right && top <= bottom){
            
            // top row
            for(int j = left; j <= right; j++){
                result.add(matrix[top][j]);
            }
            top++;
            
            // right column
            for(int i = top; i <= bottom; i++){
                result.add(matrix[i][right]);
            }
            right--;
            
            // bottom row
            if(top<=bottom){
                for(int j = right; j >= left; j--){
                    result.add(matrix[bottom][j]);
                }
                
                bottom--;
            }
                        
            // left column
            if(left <= right){
                for(int i = bottom; i >= top; i--){
                    result.add(matrix[i][left]);
                }
                
                left++;
            }

        }
        return result;
    }
}