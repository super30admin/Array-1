// Time Complexity : O(m*n) , m = no. of rows, n = no. of columns 
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes



class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if(matrix == null || matrix.length == 0) return result; 
        
        int m = matrix.length;
        int n = matrix[0].length;
        int t = 0;
        int b = m-1;
        int l = 0;
        int r = n-1; 
        
        while(t <= b && l <= r) {
            
            for(int i = l; i <= r; i++) {
                result.add(matrix[t][i]);             
            }t++;
            
          
            for(int i = t; i <= b; i++) {
                 result.add(matrix[i][r]);
            }r--; 
            
             if(t <= b) {
                 for(int i = r; i >= l; i--) {
                      result.add(matrix[b][i]);
                 }              
             }b--; 
            
            if(l <= r) {
                 for(int i = b; i >= t; i--) {
                     result.add(matrix[i][l]);
                 }              
             }l++; 
                       
        }  
        
        return result;
    }
}


