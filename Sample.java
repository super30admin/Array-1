// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        //edge case
        if(matrix==null || matrix.length==0) return new int[0];
        int  m = matrix.length;
        int  n=matrix[0].length;
         int [] result=new int[m*n];
        int dir =1;
        int r=0;
        int c=0;
        int i=0;
        
       while(i < m*n)
       {
           result[i]=matrix[r][c];
           if (dir == 1){
           if (c== n-1)
           {
               r++;dir =-1;
           }
           else if(r == 0)
           {
               c++; dir =-1;
           }
           else
           {
               r--;
               c++;
           }
       }
           else
           {
                if (r== m-1)
           {
               c++;dir =1;
           }
           else if(c == 0)
           {
               r++; dir =1;
           }
           else
           {
               r++;
               c--;
           }
               
           }
           i++;
         }
        return result;
}
}