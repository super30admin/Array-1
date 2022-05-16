/**

Time Complexity : O(M*N) 
Space Complexity : O(1) 
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No


**/
class Solution 
{
    public int[] findDiagonalOrder(int[][] matrix) 
{
        
        if (matrix.length == 0) return new int[0];
        int r = 0, c = 0, 
        m = matrix.length, 
        n = matrix[0].length, 
        arr[] = new int[m * n];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = matrix[r][c];
            if ((r + c) % 2 == 0) 
            { 
                // moving up
                if (c == n - 1) 
                    r++; 
                else if (r == 0)     
                    c++; 
                else            
                { 
                    r--; 
                    c++;
                }
            } else 
            {                
                // moving down
                if(r == m - 1) 
                    c++; 
                else if (c == 0)      
                    r++; 
                else            
                { 
                    r++; 
                    c--; 
                }
            }   
        }   
        
        return arr;
    }
}