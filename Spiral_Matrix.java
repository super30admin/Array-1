import java.util.*;
class Solution {
    //Time O(m*n)
    //Space O(1)
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0)
        {
            return new ArrayList<Integer>();
        }
        List<Integer> lis = new ArrayList<Integer>();
        int row_s = 0 , row_e = matrix.length-1 , col_s = 0, col_e = matrix[0].length-1;
        while( row_s <= row_e && col_s <= col_e)
        {
            for(int i=col_s ; i <= col_e ; i++)
            {
                lis.add(matrix[row_s][i]);
            }
            row_s++;
            for(int i=row_s ; i <= row_e ; i++)
            {
                lis.add(matrix[i][col_e]);
            }
            col_e--;
            if(row_s <= row_e && col_s <= col_e)
            {
                for(int i=col_e ; i >= col_s ; i--)
                {
                    lis.add(matrix[row_e][i]);
                }
                row_e--;
                for(int i=row_e ; i >= row_s ; i--)
                {
                    lis.add(matrix[i][col_s]);
                }
                col_s++;
            }
        }
        return lis;
    }
}