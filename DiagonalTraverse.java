// Time Complexity : O(M*N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :yes


// Your code here along with comments explaining your approach
/*Approach
1) declare 3 variables. 
2) iterate with direction. intially we have a upward direction and check if the row and col are well within the boundary of the matrix
3) once we capture the elenent, we reverse the direction 
                if(col==n-1)
                {
                    direction =-1;
                    row++;
                }
                else if(row==0)
                {
                     direction=-1;
                    col++;
                   
                    
                }

    if condition is necessary to be checked before checking row==0 as we might go array index out of bounds

    similarly
                if(row==m-1)
                {
                    direction=1;
                    col++;
                    
                   
                }
                else if(col==0)
                {
                     direction=1;
                     row++;
                }
        even for this -> if is necessary before the else if
        


*/


class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        
        
        //upward direction -> +1, also results in lowering of the row
        //downward direction ->-1 also results in lowering of col
      
        if(mat==null || mat.length==0)
            return new int[]{};
        
        int m = mat.length;
        int n = mat[0].length;
        
        int result[] = new int[m*n];
        
        int i=0,row=0,col=0;
        int direction=1;
        
        while(i<m*n)
        {
            result[i]=mat[row][col];
            if(direction==1)
            {
                if(col==n-1)
                {
                    direction =-1;
                    row++;
                }
                else if(row==0)
                {
                     direction=-1;
                    col++;
                   
                    
                }else
                {
                    row--;
                    col++;
                }
            }
            else
            {
                if(row==m-1)
                {
                    direction=1;
                    col++;
                    
                   
                }
                else if(col==0)
                {
                     direction=1;
                     row++;
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