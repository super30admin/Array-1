// Time Complexity : O(N)
// Space Complexity :O(N)
// Did this code successfully run on Leetcode :Yes
// Three line explanation of solution in plain english
// It initializes variables to track the current position in the matrix and a boolean variable 'dir' to indicate the traversal direction.
// It iterates through the matrix elements, updating the result array with the current element based on the traversal direction (up or down).
// Depending on the current position and traversal direction, it adjusts the indices to move diagonally, switching direction appropriately when reaching the matrix boundaries.
// Finally, it returns the resultant 1D array containing elements traversed diagonally in zigzag order.

public class Solution {
    public int[] FindDiagonalOrder(int[][] mat) {
        int m = mat.Length; // rows -->m
        int n = mat[0].Length; //columns --> n
        int i=0;
        int j=0;
        bool dir = true;
        int[] result = new int[m*n];

        for(int idx =0; idx< m*n; idx++ )
        {
            result[idx] = mat[i][j];
            if(dir)
            {
                //up
                if(j == n-1)
                {
                    i++;
                    dir = false;
                }
                else if(i == 0)
                {
                    j++;
                    dir = false;
                }
                else
                {
                    i--;
                    j++;
                }
            }
            else
            {
                //down
                if(i == m-1)
                {
                    j++;
                    dir = true;
                }
                else if(j == 0)
                {
                    i++;
                    dir = true;
                }
                else
                {
                    i++;
                    j--;
                }
            }
        }
        return result;
    }
}