// Time Complexity : O(n * m )  => n = length of row anf m = length of column
// Space Complexity :O(n * m )  => n = length of row anf m = length of column
// and we don't consider result arry in space then it will be O(1)
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat == null || mat.length == 0 || mat[0].length == 0){
            return new int[0];
        }
        
        int n = mat.length;
        int m = mat[0].length;
        
        int[] result = new int[n*m];
        int resIndex = 0;
        int i = 0;
        int j = 0;
        
        int dir = 1;
        
        while(resIndex < n * m) {
              result[resIndex] = mat[i][j];
              resIndex++;
            if(dir == 1){
                if(j == m-1){
                    dir = -1;
                    i++;  
                }
               else  if(i == 0){
                    dir = -1;
                    j++;
                    
                } else {
                    i--;
                    j++;
                }
            } 
            
            else {
                if(i == n-1){
                    dir = 1; 
                    j++;
                               
                }
                else if(j == 0){
                    dir = 1;
                    i++;
                    
                } else {
                    i++;
                    j--;
                }
            }
        }
        
        return result;
    }
}

//TC : (n * m )
// SC : ( n * m)