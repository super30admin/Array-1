package Array1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
-------------------------------------------------------------------------------------------------------
    Time complexity : o(n) with 1.5 * (n-2) comparisions
    space complexity: o(1) as we are mutating the same matrix
    Did this code run successfully in leetcode : yes
    problems faces : no
*/
public class SpiralMatrix {
    
    public List<Integer> spiralOrder(int[][] matrix) {
     
     int m = matrix.length;
     int n = matrix[0].length;
     
     int top = 0; int bottom = m-1;
     int left=0; int right = n-1;
     
     List<Integer> result = new ArrayList<Integer>();
     
     while(left<=right && top<=bottom)
     {
         for(int i=left;i<=right;i++)
         {
            result.add(matrix[top][i]);
         }
             top++;
          
         if(left<=right && top<=bottom)
         {
             for(int i=top;i<=bottom;i++)
             {
                 result.add(matrix[i][right]);
             }
         }
             right--;
         
        if(left<=right && top<=bottom)
         {
            for(int i=right;i>=left;i--)
            {
                result.add(matrix[bottom][i]);
            }
         }
         
         bottom--;
         
         if(left<=right && top<=bottom)
         {
             for(int i=bottom;i>=top;i--)
             {
                 result.add(matrix[i][left]);
             }
         }
         left++;
     }
     return result ;
    }
}
