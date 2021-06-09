//time complexity:O(n)
//space complexity:O(1)
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m=mat.length; int n=mat[0].length;
        int[] res=new int[m*n];
        int row=0;int col=0; int i=0;int dir=1;
        while(i<m*n)
        {
            
            res[i]=mat[row][col];
            if(dir==1)//upward direction
            {
                if(col==n-1)
                {
                    
                    row++;
                    dir=-1;//if last column is reached then jump to the next row 
                    //and change the direction
                }
                else if(row==0)
                    
                {
                     col++;//if its the first row then jump to the next column
                    //and change the direction
                     dir=-1;
                }
                else
                {
                    row--;col++;
                }
            }
            else //this is executed when the direction is changed 
            {    
                if(row==n-1)
                {
                    col++;//if it is the last row then jump to the next column
                    dir=1;//an change the direction
                }
                else if(col==0)
                    
                {
                     row++;//At the first column increment row by one and change the direction
                     dir=1;
                }
                else
                {
                    col--;row++;
                }
            }
            i++;
        }
        return res;
    }
}
