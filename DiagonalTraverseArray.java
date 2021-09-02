// Time Complexity : O(mn) n is length rows and m in length of columns
// Space Complexity : O(n) n is length of array using additional array to store the result
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
1. based on direction(diagonally up or down) traverse the entire matrix
2.(upward direction) if at last column inc row else if at row 0 inc column else dec row and inc column (also change direction flag)
3. (downward direction) if at last row inc column else if at first column inc row else inc row decr column (also change direction flag)


// Your code here along with comments explaining your approach


class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        
         int[] result = new int[mat.length * mat[0].length];
        int i = 0 ; int j =0;
        if(mat.length ==1)
        {
            for(int c = 0 ; c < mat[0].length ; c++)
            {
               result[c] = mat[0][c]; 
            }
           
            return result;
        }
        
        int dir = 1;
      int index =-1;
        while(index < (mat.length * mat[0].length)-1 )
        {
            index ++;
            if(dir == 1)
            {
              
                result[index] = mat[i][j];
                if(j == mat[0].length-1)
                {
                    i++;
                    dir =-1;
                }
                else if(i==0)
                    {
                        j++;
                    dir =-1;
                    }
                else
                {
                    i--;
                    j++;
                }
            }
            else if(dir ==-1)
            {
                 result[index] = mat[i][j];
                if(i == mat.length-1)
                {
                    j++;
                    dir =1;
                }
                else if(j==0)
                    {
                        i++;
                    dir =1;
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