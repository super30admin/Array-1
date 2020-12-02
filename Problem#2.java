// 498. Diagonal Traverse (PR#26 S30)

class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        
        if(matrix == null  || matrix.length == 0)
            return new int[0];
        int m = matrix.length, n =matrix[0].length;
        int [] result = new int[m*n];
        int i = 0, j = 0, index = 0, dir =1;
        
        while (index < m*n)
        {
            result[index]= matrix[i][j];
            if(dir ==1)
            {
                if( j == n-1){
                    dir = -1;
                    i++;
                }
                else if ( i == 0){
                    dir = -1;
                    j++;
                }
                else {
                i--;
                j++;
            }
            }
            else {
                if( i == m-1)
                {
                    dir = 1;
                    j++;
                }
                else if (j == 0)
                {
                    dir = 1;
                    i++;
                }
                else {
                    i++;
                    j--;
                }
            }
            
            index++; 
        }
        
        return result;
    }
}


/*
Complexity Analysis

Time Complexity: 
O(N⋅M) since we process each element of the matrix exactly once.

Space Complexity: 
O(1) since we don't make use of any additional data structure. 
*/