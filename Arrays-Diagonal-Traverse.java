// Time Complexity : O(m * n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        
        //base case
        
        if(matrix == null || matrix.length == 0)
            return new int[0];  //returning empty array
        
        int m = matrix.length;      //rows
        int n = matrix[0].length;  //columns    
        
        int result[] = new int[m * n];
        int i = 0, r = 0,c = 0;
         
        int dir =1;
        
        
        while (i < m*n){
            
            result[i] = matrix[r][c]; //storing result
            
            if(dir == 1){       //If direction going up 
                
                if(c == n-1){       //case-1: Lasr coloumn
                    
                    r++;
                    dir = -1;
                }
                
                else if(r==0){  //case-2: first row
                    
                    c++;
                    dir = -1;
                }
              
                else{           //default
                    
                    r--;
                    c++;
                }
            }
            else{                   //If direction going down
                if(r == m-1){       //case-1: last row
                    
                    dir = 1;
                    c++;
                }
                
                else if (c == 0){   //case-2: first row
                    
                    r++;
                    dir = 1;
                }
                
                else{           //default
                    
                    r++;
                    c--;
                }
            }
            i++;
            
        }
        return result;
    }
}