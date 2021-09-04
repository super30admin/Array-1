// Time Complexity : O(M*N) we are just iterating over the matrix
// Space Complexity : O(1)  as we need List<Integer> to return we are not using any additional space
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
// Three line explanation of solution in plain english: Iterating the boundaries top, right, bottom and left and then squeezing the boundaries inwards.

// Your code here along with comments explaining your approach
class SpiralOrder {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        
        //null cases
        if( matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return result;
        }
        
        int m = matrix.length; 
        int n = matrix[0].length;
        int top = 0;
        int bottom = m-1;
        int left = 0; 
        int right = n-1;
        
        while(top <= bottom && left <= right){
            
            //iterate from left to right; --> iterate top boundary and move inwards from top by incrementing top
            for(int i = left ; i <= right ; i++){
                result.add(matrix[top][i]);
            }
            top++;
            
            //iterate from top to bottom; --> iterate right boundary and move inwards from right by decrementing right
            for(int j = top ; j <= bottom ; j++){
                result.add(matrix[j][right]);
            }
            right--;
            
            
            //iterate from right to left; --> iterate bottom boundary and move inwards from bottom by decrementing bottom
            if(top <= bottom){
                for(int k = right ; k >= left ; k--){
                    result.add(matrix[bottom][k]);
                }
                bottom--;
            }
            
            //iterate from bottom to top; --> iterate left boundary and move inwards from left by incrementing left
            if(left <= right){
                for(int l = bottom ; l >= top ; l--){
                    result.add(matrix[l][left]);
                }
                left++;
            }
            
        }
        
        return result;
        
            
    }
}