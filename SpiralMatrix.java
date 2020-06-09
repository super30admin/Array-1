// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        if(matrix == null || matrix.length == 0)
            return new ArrayList<Integer>();
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> result = new ArrayList<>();
       
        int left = 0;
        int right = n -1;
        int top = 0;
        int bottom = m-1;
         
        while(left <= right && top<=bottom){
            
           
            //top row
            for(int i = left; i<= right; i++){
                result.add(matrix[top][i]);
            }
            top++;
 
            //right column
            for(int i = top ; i <= bottom ; i++){
                result.add(matrix[i][right]);
            }
            right--;
        
            //bottom row
            if(top <= bottom){
                 for(int i = right; i>=left;i--)
                {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }
            
            //left column
            if(left <= right){
                for(int i = bottom ; i >= top ;i--){
                    result.add(matrix[i][left]);
                }
            left++;
        }
            
            
        }
        
        return result;
    }
}