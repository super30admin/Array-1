// Time Complexity :  O(N) * O(M)  --> O(NM).
// Space Complexity : O(n)  --
// Did this code successfully run on Leetcode : No not workin for inp [[3][2]]
// Any problem you faced while coding this : No , reference geekforgeeks


// Your code here along with comments explaining your approach
// still trying to understand the logic.



class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
         // Initialize indexes of element to be printed next 
        int i = 0, j = 0; 
        
        int n = matrix.length;
        
        int result[] =  new int[n * n];
  
        // Direction is initially from down to up 
        boolean isUp = true; 
  
        // Traverse the matrix till all elements get traversed 
        for (int k = 0; k < n * n;) { 
            // If isUp = true then traverse from downward 
            // to upward 
            if (isUp) { 
                for (; i >= 0 && j < n; j++, i--) { 
                    //System.out.print(matrix[i][j] + " "); 
                     result[k] = matrix[i][j];
                    k++; 
                } 
  
                // Set i and j according to direction 
                if (i < 0 && j <= n - 1) 
                    i = 0; 
                if (j == n) { 
                    i = i + 2; 
                    j--; 
                } 
            } 
  
            // If isUp = 0 then traverse up to down 
            else { 
                for (; j >= 0 && i < n; i++, j--) { 
                    //System.out.print(matrix[i][j] + " "); 
                      result[k] = matrix[i][j];
                    k++; 
                } 
  
                // Set i and j according to direction 
                if (j < 0 && i <= n - 1) 
                    j = 0; 
                if (i == n) { 
                    j = j + 2; 
                    i--; 
                } 
            } 
  
            // Revert the isUp to change the direction 
            isUp = !isUp; 
        } 
        return result;
    }
}
