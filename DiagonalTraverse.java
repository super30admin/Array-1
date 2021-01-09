// Time Complexity :O(m*n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Your code here along with comments explaining your approach


class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
      if(matrix==null || matrix.length==0) // input []
          return  new int[0];     
      int dir = 1;
      int i=0;
      int j=0;
      int [] output = new int[matrix.length*matrix[0].length];
      int index = 0;
    while(index<output.length)
    {
        output[index++]=matrix[i][j];
        if(dir==1)
        {
            if(j==matrix[0].length-1)
            {
               i++;
               dir = -1;
            }else if(i==0)
            {
                dir = -1;
                j++;
            }else{
                i--;
                j++;
            }
        }else{
            
            if(i==matrix.length-1)
            {
               j++;
               dir = 1;
            }else if(j==0)
            {
                dir = 1;
                i++;
            }else{
                i++;
                j--;
            }
            
            
        }
        
    }
            
        return output;
    }
}