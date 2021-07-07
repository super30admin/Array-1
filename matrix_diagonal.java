class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat == null || mat.length==0)
        {
            return new int[0];
        }
        
        int direction = 1;
        
        int m = mat.length;
        int n = mat[0].length;
        
        int[] result = new int[m*n];
        int i = 0;
        
        int row = 0;
        int col = 0;
        
        while(row != m && col!= n)
        {
            result[i] = mat[row][col];
            
            //if direction up
            if(direction == 1)
            {
                if(col==n-1)
                {
                    row++;
                    direction = -1;
                }
                else if(row ==0)
                {
                    col++;
                    direction = -1;
                }
                else{
                    col++;
                    row--;
                }
            }
            else{
                if(row == m-1)
                {
                    col++;
                    direction = 1;
                }
                else if(col == 0)
                {
                    row++;
                    direction = 1;
                }
                else{
                    row++;
                    col--;
                }
            }
            i++;
        }
        return result;
        
    }
}

//runtime: O(mn)
//space: O(1)
