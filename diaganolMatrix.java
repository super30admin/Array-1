// Time Complexity : O(m*n)
// Space Complexity : O(1) , aux O(m*n)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Comments 

// Your code here along with comments explaining your approach

class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        if(matrix==null || matrix.length==0)
            return new int[0];
        
        /* Size Vars */
        int m=matrix.length;
        int n=matrix[0].length;
        
        /* Direction Array  0th index go up, 1th index go down */
        int[] dir=new int[] {1,-1};
        
        /* Result array */
        int[] result=new int[m*n];
        
        int traverse=0;
        int direction=dir[0];
        int row=0;
        int column=0;
        
        while(traverse<m*n)
        {
            result[traverse]=matrix[row][column];
            
            /* direction up */
            if(direction==1)
            {
                if(column==n-1)
                {
                    direction=dir[1];
                    row+=1;
                } 
                else if(row==0)
                {
                    direction=dir[1];
                    column+=1;
                }
                else /* general case */
                {
                    row-=1;
                    column+=1;
                }
            }
            else /* direction down */
            {
                if(row==m-1)
                {
                    direction=dir[0];    
                    column+=1;
                } 
                else if(column==0)
                {
                    direction=dir[0];
                    row+=1;
                }
                else /* general case */
                {
                    column-=1;
                    row+=1;
                }
            }
            
            traverse+=1;
        }
        
        return result;
    }
}