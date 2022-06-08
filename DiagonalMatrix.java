//Time complexity: O(m*n)
//Space complexity: O(1)

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        
        int m = mat.length;
        int n = mat[0].length;
        int [] result = new int [m*n];
        
        //null
        if(mat == null) return new int[0];
        
        //i will point to the current row, j to current column
        //and value of dir will represent the direction of movement
        int i = 0; int j = 0; int dir = 1;
        
        //index for the resultant array
        int idx = 0; 
        
        //looping until we go over each element of the matrix
        while (idx < m*n)
        {
            //storing the matrix elements in result starting with the first element at [0][0]
            result[idx] = mat[i][j];
            idx++;
            
            //if we are moving up
            if(dir == 1)
            {
                //we first check if either the element is in the first row or it is not in the last column
                // ['1' 2 3]
                // [4 5 6]
                // [7 8 9]
                //this is to make sure we do not go out of bounds once by j++ on the last column
                if(i == 0 && j!= n-1 )
                {
                    //move to the next column and changing direction to down
                    j++; dir = -1;
                } 
                
                // [1 2 '3']
                // [4 5 6]
                // [7 8 '9']
                else if(j == n-1)
                {
                    //move to the next row and changing direction to down
                    i++; dir = -1;
                }
                
                //for the rest of them,
                // [1 2 3]
                // [4 '5' 6]
                // ['7' 8 9]
                else 
                {
                    //move to the previous row and next column
                    i--;
                    j++;
                }    
            }
            //if we are moving down
            else
            {
                // [1 2 3]
                // ['4' 5 6]
                // [7 8 9]
                if(j == 0 && i!= m-1 )
                {
                    i++; dir = 1;
                }
                
                // [1 2 3]
                // [4 5 6]
                // [7 '8' 9]
                else if(i == m-1)
                {
                    j++; dir = 1;
                }
                
                // [1 '2' 3]
                // [4 5 '6']
                // [7 8 9]
                else 
                {
                    j--;
                    i++;
                }
            }
        }
        //returning the array with diagonally traversed elementss
        return result;
    }
}