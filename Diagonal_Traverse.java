import java.util.*;
class Solution {
    //Time O(m*n)
    //Space O(m*n)
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat == null || mat.length == 0)
        {
            return new int[] {};
        }
        int m = mat.length , n = mat[0].length , k = 0 , row = 0 , col = 0 , dir = 1;
        int result[] = new int[m*n];
        while(k < m*n)
        {
            result[k] = mat[row][col];
            if(dir == 1)
            {
                if(col == n-1)
                {
                    row++;dir = -1;
                }
                else if(row == 0)
                {
                    col++;dir = -1;
                }
                else
                {
                    row--;col++;
                }
            }
            else
            {
                if(row == m-1)
                {
                    col++;dir = 1;
                }
                else if(col == 0)
                {
                    row++;dir = 1;
                }
                else
                {
                    row++;col--;
                }
            }
            k++;
        }
        return result;
    }
}