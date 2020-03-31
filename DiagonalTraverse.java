//time - O(MN) - visit every element exactly once
//space - constant
class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0)
        {
            return new int[0];
        }
        
        int m = matrix.length;
        int n = matrix[0].length;
        
        int direction = 1;
        int row = 0;
        int column = 0;
        int index = 0;
        
        int[] result = new int[m * n];
        
        while(index < m * n)
        {
            result[index] = matrix[row][column];
            if(direction > 0)
            {
                //while going upwards, for the element in top right corner, both if and else if are true
                //else if causes index out of bounds
                //so first if then else if
                if(column == n - 1)
                {
                    row++;
                    direction = -1;
                }
                else if(row == 0)
                {
                    column++;
                    direction = -1;
                }
                else
                {
                    row--;
                    column++;
                }
            }
            else
            {
                //while going downwards, for the element in bottom left corner, both if and else if are true
                //else if causes index out of bounds
                //so first if then else if
                if(row == m - 1)
                {
                    column++;
                    direction = 1;
                }
                else if(column == 0)
                {
                    row++;
                    direction = 1;
                }
                else
                {
                    row++;
                    column--;
                }
            }
            index++;
        }
        return result;
    }
}
