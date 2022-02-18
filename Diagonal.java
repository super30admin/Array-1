/**
[[1,2,3],
 [4,5,6],
 [7,8,9]]
 
UP - (i - 1, j+1)
DOWN - (i + 1, j - 1)

// if going down and j-1 not exist then next is going UP
// if going up and i - 1 is out of bound then go down.

TC - O(m*n)  where m is number of rows and n is number of cols.
SC - O(1).


**/

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        
        int result[] = new int[mat.length * mat[0].length];
        
        int i=0,j=0;
        int count = 0;
        
        boolean isDown = false;
        
        // base conditions
        while(count < result.length)
        {   
            result[count] = mat[i][j];
            count++;
            
            // change the direction.
            if (!isDown && (i-1 == -1 || j + 1 == mat[0].length))
            {
                if (j == mat[0].length - 1 && i != mat.length - 1)
                {
                    i++;
                }
                else
                {
                    j++;
                }
                
                isDown = true;
            }
            else if (isDown && (j-1 == -1 || i+1 == mat.length))
            {
                if (i==mat.length - 1 && j != mat[0].length - 1)
                {
                    j++;
                }
                else
                {
                    i++;
                }
                
                isDown = false;
            }
            else
            {
                if (isDown)
                {
                    i++;
                    j--;
                }
                else
                {
                    i--;
                    j++;
                }    
            }
        }
        
        return result;
    }
}