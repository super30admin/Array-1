// Time Complexity : O(M*N)
// Space Complexity : O(M*N)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this : Figuring out that we can use begRow and endRow and begCol and endCol as indices. 

// Your code here along with comments explaining your approach

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0){
            return new ArrayList<Integer>();
        }
        
        List<Integer> result = new ArrayList<Integer>();
        
        int top = 0;
        int bot = matrix.length-1;
        int right = matrix[0].length-1;
        int left = 0;
        
        while(top <= bot && left <= right){

            //traverse right
            for(int i = left; i <= right; i++){
                result.add(matrix[top][i]);
            }

            top++;
            
            //Traverse downwards
            for(int i = top; i <= bot; i++){
                result.add(matrix[i][right]);
            }
            
            right--;
            
            //Traverse left
            if(top <= bot){
                for(int i = right; i >= left; i--){
                    result.add(matrix[bot][i]);
                }
            }
            
            bot--;
            
            //Traverse Up
            if(left <= right){
                for(int i = bot; i >= top; i--){
                    result.add(matrix[i][left]);
                }
            // System.out.println("R: " + row +", and C:" + col);
            }
            
            left++;
            
        }
        return result;
    }
}