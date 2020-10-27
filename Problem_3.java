// Time Complexity :O(n*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> result = new ArrayList<>();
        
        if(matrix.length==0 || matrix == null) return  result;
        
        int left =0; int right = matrix[0].length-1; int top = 0; int bottom = matrix.length-1;
        
        while(left <= right && top <= bottom){
            
            if(left <= right && top <= bottom){
            // move left to right
            for(int i=left;i<=right;i++){
                result.add(matrix[top][i]);
            }
            top++;}
            
            
            if(left <= right && top <= bottom){
            // move top to bottom
                
            for(int i=top;i<=bottom;i++){
                result.add(matrix[i][right]);
            }
            right--;}
            
           
            
            if(left <= right && top <= bottom){
            // move right to left
            for(int i=right;i>=left;i--){
                result.add(matrix[bottom][i]);
            }
            bottom--;}
            
            // move bottom to top
            
            if(left <= right && top <= bottom){
            // move right to left
            for(int i=bottom;i>=top;i--){
                result.add(matrix[i][left]);
            }
            left++;}
            
                
        }
        
        
        return result;
        
    }
}