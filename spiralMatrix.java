//Time Complexity : O(n)
//Space Complexity : O(1). No extra space used
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> result = new ArrayList<>();
        if(matrix.length == 0 || matrix == null){return result;}
        
        int r = matrix.length;
        int c = matrix[0].length;
        int top = 0;
        int left = 0;
        int bottom = r-1;
        int right = c-1;
        
        while(left <= right && top <= bottom){
        
        //Iterating for top
        for(int i = left; i <= right; i ++){
            
            result.add(matrix[top][i]);
            
        }
        top = top + 1;
            
         //Iterating for right
            if(left <= right && top <= bottom){
                
                 for(int i = top; i <= bottom; i ++){
            
            result.add(matrix[i][right]);
            
        }
        right = right - 1;
            }
       
        
         //Iterating for bottom
            if(left <= right && top <= bottom){
                  for(int i = right; i >= left; i --){
            
            result.add(matrix[bottom][i]);
            
        }
        bottom = bottom - 1; 
                
            }
     
        
         //Iterating for left
            if(left <= right && top <= bottom){
                 for(int i = bottom; i >= top; i --){
            
            result.add(matrix[i][left]);
            
        }
        left = left + 1; 
                
            }
      
        
        
        
        }
        return result;
    }
}