// Time Complexity : O(N) where N is the total no. of elements in input matrix
// Space Complexity : O(N) where N is the total no. of elements in input matrix
// Did this code successfully run on Leetcode : Yes


class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> output=new ArrayList<Integer>();
        
        //edge case
        if(matrix ==  null || matrix.length == 0)
            return output;
        
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;
        
        
        while(top <= bottom && left <= right ){
            
            
            for(int i=left; i<= right; i++){
                output.add(matrix[top][i]);
            }
            top++;
            
            for(int i= top; i<= bottom; i++){
                output.add(matrix[i][right]);
            }
            right--;
            
            if(top <= bottom){
                for(int i= right; i>= left; i--){
                    output.add(matrix[bottom][i]);
                }
                bottom--;
            }
            
        
            if(left <= right){
                for(int i=bottom; i>= top; i--){
                    output.add(matrix[i][left]);
                }
                left++; 
            }
                   
                
        }
        return output;
    }
}