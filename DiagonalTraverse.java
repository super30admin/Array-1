// Time Complexity : O(m * n)
// Space Complexity : O(1)
// Method used : Matrix traversal

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        
        int rows = mat.length, cols = mat[0].length;

        int i = 0, row = 0, col = 0, dir = 1;
        int[] result = new int[rows * cols];

        while(i < rows * cols)
        {
            result[i] = mat[row][col];

            if(dir == 1)
            {
                if(col == cols - 1)
                {
                    row++;
                    dir = 0;
                }

                else if(row == 0)
                {
                    col++;
                    dir = 0;
                }

                else
                {
                    row--;
                    col++;
                }
            }
            else
            {
                if(row == rows - 1)
                {
                    col++;
                    dir = 1;
                }

                else if(col == 0)
                {
                    row++;
                    dir = 1;
                }

                else
                {
                    row++;
                    col--;
                }
            }

            i++;
        }

        return result;
    }
}