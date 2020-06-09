// Time Complexity :O(m*n) m-length of rows n-length of columns
// Space Complexity :O(1) No axillary space used
// Did this code successfully run on Leetcode :yes 
// Any problem you faced while coding this : -
class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        int r=0,c=0,dir=1;
        if(matrix==null || matrix.length==0) return new int[0];
        int m=matrix.length;
        int n=matrix[0].length;
        int[] result=new int[m*n];
        int i=0;
        while(r<m && c<n)
        {
            result[i]=matrix[r][c];
            if(dir==1)
            {
                 if(c==n-1)
                 {
                    
                    r++;
                    dir=-1;
                 }
                 else if(r==0)
                 {
                    c++;
                    dir=-1;
                 }else
                 {
                     r--;
                     c++;
                 }
            }else
            {
                if(r==m-1)
                {
                    c++;
                    dir=1;
                    
                }else if(c==0)
                {
                    r++;
                    dir=1;
                    
                    
                }else
                {
                     c--;
                     r++;
                    
                }
                
            }
            i++;
        }
        return result;
        
    }
}