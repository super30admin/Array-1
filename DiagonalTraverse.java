// TC: O(m*n) : m ,n -> dimensions of matrix
// SC: O(1) -> no extra space used
// Did it run successfully on Leetcode?: Yes
class Solution {
    public int[] findDiagonalOrder(int[][] matrix){
        if ( matrix == null || matrix.length == 0)
        {
            return new int[]{};
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int[] res = new int[m*n];
        int direction = 1;
        int index = 0;
        int i = 0;
        int j = 0;
        while ( i < m && j < n)
        {
                res[index] = matrix[i][j];
                if (direction == 1)
                {
                    if (j == n-1) // last column (top right corner) then change direction and go to next row
                    {
                        direction = -1;
                        i++;
                    }
                    else if ( i == 0) // first row (top left row) then change direction and go to next column
                    {
                        direction = -1;
                        j++;
                    }
                    else
                    {
                        i--;
                        j++;
                    }
                }
                else
                {
                    if (i == m-1) // last row (down left corner) then change direction and go to next column
                    {
                        direction = 1;
                        j++;
                    }
                    else if ( j == 0) // first column  then change direction and go to next column
                    {
                        direction = 1;
                        i++;
                    }
                    else
                    {
                        i++;
                        j--;
                    }
                }
                index++;
            }
    
        return res;
    }
}
