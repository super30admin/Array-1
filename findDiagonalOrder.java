class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        
        int m=mat.length;
        int n=mat[0].length;
        
        int i=0;int j=0;int idx=0;
        int dir=1;// 1-upwards, 1-downwards
        
        int[] result=new int[m*n];
        
        while(idx<m*n)
        {
            result[idx]=mat[i][j];
            idx++;
            if(dir==1)// 1-upwards
            {
                if(j==n-1)
                {
                    i++;
                    dir=-1;
                }
                else if(i==0)
                {
                    j++;
                    dir=-1;
                }
                else{
                    i--;
                    j++;
                }
            }
            else
            { //  1-downwards

                if(i==m-1)
                {
                    j++;
                    dir=1;
                }
                else if(j==0)
                {
                    i++;
                    dir=1;
                }
                else
                {
                    j--;
                    i++;
                }
            
            }
        }
        
        return result; 
        
        
        
        
    }
}

// Time Complexity : O( M * N)
// Space Complexity : O( 1 )
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no