/** Time Complexity : O(n) where n is the number of elements of array
 * Space Complexity: O(1) not considering result array, else O(n)
 * executed on leetcode: yes
 */


public class diagonalTraverse {
    public int[] findDiagonalOrder(int[][] matrix) {
        if(matrix==null || matrix.length==0) return new int[0];
        int m= matrix.length;
        int n=matrix[0].length;
        int[] result= new int[m*n];
        int row=0,col=0;
        boolean up=true;
        for(int i=0;i<m*n;++i)
        {
            result[i] = matrix[row][col];
            if(up)
            {
                if(col==n-1)
                {
                    row++;
                    up=false;
                }
                else if(row==0)
                {
                    col++;
                    up=false;
                }
                else
                {
                    row--;
                    col++;
                }
            }
            else
            {
                if(row==m-1)
                {
                    col++;
                    up=true;
                }
                else if(col==0)
                {
                    row++;
                    up=true;
                }
                else
                {
                    row++;
                    col--;
                }
            }
        }
        return result;
    }
}