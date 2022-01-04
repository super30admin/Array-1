

// Time Complexity : O(m*n) where m is rows, n is columns
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : yes


// approach : we will traverse the matrix in top, right, bottom, left directions. While traversing up we will increase top, left and decrease bottom,right. And we will handle edge cases in all directions


class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        if(matrix == null)
            return null;
        
        int m = matrix.length;
        int n = matrix[0].length;
        
        List<Integer> spiral = new ArrayList<>();
        
        int top = 0,bottom = m-1,left = 0,right = n-1;
        
        
        while(top <= bottom && left <= right){
            
                for(int j=left;j<=right;j++){
                    spiral.add(matrix[top][j]);   
                }
                top++;
            
                for(int i=top;i<=bottom;i++){
                    spiral.add(matrix[i][right]);
                    
                }
                right--;
            
            if(top <= bottom ){
                for(int j=right;j>=left;j--){
                    spiral.add(matrix[bottom][j]);
                    
                }
                bottom--;
            }
            
            if(left <= right){
                for(int i=bottom;i>=top;i--){
                    spiral.add(matrix[i][left]);
                    
                }
                left++;
            }
            
            
        }
        return spiral;
    }
}