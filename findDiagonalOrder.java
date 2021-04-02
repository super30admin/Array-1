
/*
Runtime complexity - O(M*N) where M and N is the number of rows and columns respectively
Space complexity - O(!) - if we did not consider the final output array, otherwise O(N)
*/
class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        if(matrix==null || matrix.length==0)
            return new int[]{};
        int m=matrix.length;
        int n=matrix[0].length;
        int i=0,j=0,index=0,dir=1;
        int[] result=new int[m*n];
        while(index<m*n)
        {
            result[index++]=matrix[i][j]; // add to the result array
            if(dir==1) // There for only two direction - upside and downside.
            {
                if(j==(n-1))
                {
                    
                    i++;
                    dir=-1;
                }
                else if(i==0)
                {
                    j++;
                    dir=-1;
                }
                else
                {
                    i--;
                    j++;
                }
            }
            else
            {
                if(i==(m-1))
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
                    i++;
                    j--;
                }
            }
        }
        return result;
    }
}
