
// Time Complexity : O(mn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length; 
        int n = matrix[0].length;
        int left = 0; int right = n-1;
        int top = 0; int bottom = m-1;
        

        List<Integer> result = new ArrayList<>();
        while(top <= bottom && left <= right){
            
            //top row
                for(int j=left; j<= right ; j++){
                result.add(matrix[top][j]);  
               }
            top++;
            
            //right column
                 for(int i=top; i<= bottom ; i++){
                result.add(matrix[i][right]);   
              }
            right--;

            //bottom row
            if(top <= bottom){
                  for(int k=right; k >= left ; k--){
                result.add(matrix[bottom][k]);  
                  }
             }
            bottom--;
            
            //left column
             if(left <= right){
                 for(int l=bottom; l >= top ; l--){
                result.add(matrix[l][left]);
                 }
             }
            
            left++;
            
        }
        return result;
        
    }
}