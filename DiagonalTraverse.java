//T.C = O(mn)
//space : O(1)
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        
    int m = mat.length;
    int n = mat[0].length;
    int dir =1;
    int i=0;
        int j=0;
        
        int[] result = new int[m*n];
        int index =0;
        
        while(index < m*n)
        {
           
            result[index]=mat[i][j];
            index++;
            if(dir==1)
            {
                if(j==n-1)
                {
                    dir=-1;
                    i++;
                }
                else if ( i ==0)
                {
                    dir = -1;
                    j++;
                }
                else
                {
                    i--;
                    j++;
                }
            }
            else if(dir==-1)
            {
                if(i==m-1)
                {
                    dir=1;
                    j++;
                }
                else if ( j ==0)
                {
                    dir = 1;
                    i++;
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