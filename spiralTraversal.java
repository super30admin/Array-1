// Time Complexity : O(n*m)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach


class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        ArrayList<Integer> spiralTraversal = new ArrayList<>();
        
        int top = 0;
        
        int bottom = matrix.length - 1;
        
        int left = 0;
        
        int right = matrix[0].length - 1;
        
        while(left<=right && top<=bottom){
            
            //1st traversal
            
            if(top<=bottom){
            
            for(int i = left; i<=right; i++){
                
                spiralTraversal.add(matrix[top][i]);
                
            }
            
            top++;
            }
            
            
            //2nd traversal
            
            if(left<=right){
            
            for(int i = top; i<=bottom; i++){
                
                spiralTraversal.add(matrix[i][right]);                
                
            }
            
            right--;
            }
            
            //3rd traversal
            
            if(top<=bottom){
            
            for(int i = right; i>=left; i--){
                
                spiralTraversal.add(matrix[bottom][i]);                
                
            }
            
            bottom--;
            }
            
            //4th traversal
            
            if(left<=right){
            
            for(int i = bottom; i>=top; i--){
                
                spiralTraversal.add(matrix[i][left]);                
                
            }
                left++;
            }
            
        }
        
        return spiralTraversal;
            
        
    }
}

