// Time Complexity : O(m*n) where m and n are rows and columns of matrix
// Space Complexity : O(1) since we dont use any auxillary structures
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        
        int[] res = new int[m*n];
        int index=0;
        int i =0, j=0, dir=1;
        while(index<m*n)
        {  res[index]= mat[i][j];
            index++;
          
           if(dir==1)
           {
               if(i==0 && j!=n-1)
               {   j++; dir=-1;}
               else if(j==n-1)
               { i++; dir=-1;  }
               else
               {
                   i--;j++;
               }
               
               
           }
         else
         {
              if(j==0 && i!=m-1)
               {   i++; dir=1;}
               else if(i==m-1)
               { j++; dir=1;  }
               else
               {
                   j--;i++;
               }
               
             
         }
            
                 
        }
        return res;
        
    }
}