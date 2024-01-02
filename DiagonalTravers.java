// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

import java.util.Arrays;

public class DiagonalTravers {
    
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        boolean direction = true;
        int i =0; int j=0;
        int [] result = new int[m*n];
        for(int idx=0; idx < result.length; idx++)
        {
            result[idx] = mat[i][j];
            // going in the upward direction
            if(direction)
            {
                //if it is the top row and not the last column
            if(i==0 && j!=n-1)
            {
                j++;
                direction = false;
            }
            // if it is the last column
            else if(j==n-1)
            {
                i++;
                direction = false;
            }
            else
            {
                i--;
                j++;
            }
            }
            // going the downward direction
            else
            {
            //if it is the left most columns and not the last row    
            if(j==0 && i!=m-1)
            {
                i++;
                direction = true;
            }
            //if it the last row
            else if(i==m-1)
            {
                j++;
                direction = true;
            }
            else
            {
                j--;
                i++;
            }
            }
        }
        return result;
    }

    public static void main(String[] args)
    {
        int [][] mat = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        DiagonalTravers d = new DiagonalTravers();
        int [] result = d.findDiagonalOrder(mat);
        System.out.println(Arrays.toString(result));
    }
}
