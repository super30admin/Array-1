//Time Complexity: O(M x N)
//Space Complexity: O(1)

import java.util.*;
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0) return null;
        int m = matrix.length; int n = matrix[0].length;
        
        int top = 0; int bottom = m - 1;
        int left = 0; int right = n - 1;
        
        List<Integer> res = new ArrayList<>();
        
        while(top <= bottom && left <= right)
        {
            if(top <= bottom)
            {
                for(int i = left; i <= right; i++)
                {
                    res.add(matrix[top][i]);
                }
                top++;
            }
            
            if(left <= right)
            {
               for(int i = top; i <= bottom; i++)
               {
                    res.add(matrix[i][right]);
                }
                 right--; 
            }
            
            if(top <= bottom)
            {
                for(int i = right; i >= left; i--)
            {
                res.add(matrix[bottom][i]);
            }
            bottom--;
            }
            
            if(left <= right)
            {
                for(int i = bottom; i >= top; i--)
            {
                res.add(matrix[i][left]);
            }
            left++;
            }
                   
        }
        return res;
    }
}