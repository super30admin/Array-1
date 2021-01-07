//Time Complexity: O(M x N) where M and N are the dimensions of matrix
//Space Complexity: O(1)

class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0) return new int[0];
        int m = matrix.length; int n = matrix[0].length;
        
        int dir = 1;
        int[] res = new int[m*n];
        int index = 0;
        int i = 0; int j = 0;
        while(index < res.length)
        {
            res[index] = matrix[i][j];
                if(dir == 1)
                {
                    if(j == n - 1)
                    {
                        i++; dir = -1;
                    }     
                    else if(i == 0)
                    {
                        j++; dir = -1;
                    }   
                    else
                    {
                       i--; j++; 
                    }             
                }
                else
                {
                    if(i == m - 1)
                    {
                        j++; dir = 1;
                    }   
                    else if(j == 0)
                    {
                        i++; dir = 1;
                    }        
                    else
                    {
                        j--; i++;
                    }                       
                }            
            index++;
          }
        return res;   
    }
}