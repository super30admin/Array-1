//T(N)=O(M*N)
//S(N)=O(1)
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        
        int flag=1;
        int m=mat.length;
        int n=mat[0].length;
        int[] ar = new int[(m*n)];
        
        int ind=0;
        int i=0;
        int j=0;
        while(i<m&&j<n)
        {
            ar[ind]=mat[i][j];
            ind+=1;
            if(ind==m*n)
                return ar;
            //Going Down
            if(flag==0)
            {
                
                if(i==m-1)
                {
                    j++;
                    flag=1;
                    
                }
                else if(j==0)
                {
                    i++;
                    flag=1;
                }
                else{
                    i+=1;
                    j-=1;
                    flag=0;
                }
                
            }
            else
            {
                
                
                if(j==n-1)
                {
                    i++;
                    flag=0;
                }
                else if(i==0)
                {
                    j++;
                    flag=0;
                }
                else{
                    i-=1;
                    j+=1;
                }
                
            }
            
            
            
            //Going UP
        }
        return ar;
        
        
    }
}