//Time complexity=O(M*N)
//Space complexity=O(1)
//Here we are traversing the entire matrix diagonally. For that we are maintaining a direction variable which tells us the direction of diagonal we are going to traverse.For some case we are providing the direction of the traversing direction.
class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
         if(matrix==null || matrix.length==0)
            return new int[0];
        int m=matrix.length,n=matrix[0].length;
        int [] result=new int[m*n];
       
        int r=0,c=0,dir=1,count=0;
        
        int size=m*n;
        while(count<n*m)
        {
            result[count]=matrix[r][c];
           if(dir==1)//If going upward
           {
               if(c==n-1)//Last column of the matrix
               {
                   dir=0;
                   r++;
               }
               
               else if(r==0)//1st row of the matrix
               {
                   dir=0;
                   c++;
               }
               else
               {
                   r--;
                   c++;
               }
           }
            else
            {
                if(r==m-1)//Last row of the matrix
                {
                    dir=1;
                    c++;
                }
                else if(c==0)//1st column of the matrix
                {
                    dir=1;
                    r++;
                }
                else
                {
                    r++;
                    c--;
                }
            }
            count++;
        }
        return result;
        
    }
}