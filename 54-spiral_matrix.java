//Approach: By setting up the boundries
//Overall Time Complexity: O(M*N)
//Overall Space Complexity: O(1) --> We wouldn't include output space
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix == null || matrix[0].length == 0) return new ArrayList<Integer>();
        
        int m = matrix.length;
        int n = matrix[0].length;
        
        int top = 0; int bottom = m - 1;
        int left = 0; int right = n - 1;
        List<Integer> res = new ArrayList<Integer>();
        
        //Here there are four base variables
        //And every time we change the variables we need to check for the conditions
        while(top <= bottom && left <= right){
            
            //Moving from left to right
            for(int i = left ; i <= right; i++){
                res.add(matrix[top][i]);
            }
            top++;
            
            //Moving from top to bottom
            for(int i = top; i <= bottom; i++){
                res.add(matrix[i][right]);
            }
            right--;
            
            //Moving from right to left
            if(top<=bottom){
                for(int i = right; i >= left; i--){
                    res.add(matrix[bottom][i]);
                }
                bottom--;    
            }
            
            //Moving from bottom to top
            if(left <= right){
                for(int i = bottom; i >= top; i--){
                    res.add(matrix[i][left]);
                }
                left++;    
            }
            
        }
        
        return res;
    }
}