// Time Complexity : O(m*n)
// Space Complexity : O(1) , aux O(m*n)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Comments 

// Your code here along with comments explaining your approach

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> result=new ArrayList<>();
        
        /* Base Case */
        if(matrix==null || matrix.length==0)
            return result;
        
        /* Size Vars */
        int m=matrix.length;
        int n=matrix[0].length;
        
        /* Bound values */
        int left=0;
        int right=n-1;
        int top=0;
        int bottom=m-1;
        
        /* Traverse Vars */
        int traverse=0;
        int row=0;
        int column=0;
        
        
        /* Direction array 0 UP, 1 DOWN , 2 LEFT, 3 RIGHT*/
        int[] dir=new int[]{0,1,2,3};
        int direction=dir[3];
        
        while(traverse<m*n)
        {   
            result.add(matrix[row][column]);
            
             /* UP */
            if(direction==dir[0])
            {
                if(row==top)
                {
                    direction=dir[3];
                    column+=1;
                    left++;
                }
                else
                {
                    row-=1;
                }
            }
            /* Down */
            else if(direction==dir[1]) 
            {
                if(row==bottom)
                {
                    direction=dir[2];
                    column-=1;
                    right--;
                }
                else
                {
                    row+=1;
                }
            }
            /* Left */
            else if(direction==dir[2])
            {
                if(column==left)
                {
                    direction=dir[0];
                    row-=1;
                    bottom--;
                }
                else
                {
                    column-=1;
                }
            }
            /* Right */
            else if(direction==dir[3])
            {
                if(column==right)
                {
                    direction=dir[1];
                    row+=1;
                    top++;
                }
                else
                {
                    column+=1;
                }
            }
            traverse+=1;
        }
         
        return result;
    }
}