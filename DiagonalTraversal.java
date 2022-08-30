class Solution {
    //tc-o(mn)
    //sc-o(1)
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int result[] = new int[m*n];
        int index =0;
        int r=0;
        int c=0;
        int d=1;
        while(index < result.length)
        {
            result[index] = mat[r][c]; 
            index++;
            
            //up
            if(d==1)
            {
            if(c == n-1)
            {
                r++;
                d=-1;
            }
            else if(r==0)
            {
                c++;
                d=-1;
            }
            else
            {
                c++;r--;
            }
            }
            else
            {
            //down
            if(r==m-1)
            {
                c++;
                d=1;
            }
            else if(c == 0)
            {
                r++;
                d=1;
            }
            else
            {
                c--;
                r++;
            }
            }
            
        }
        return result;
        
    }
}