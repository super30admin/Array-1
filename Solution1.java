//Diagonal Traverse
//Time Complexity : O(m*n)
//Space Complexity :O(1)
class Solution1 {
    public int[] findDiagonalOrder(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int [] result=new int[m*n];
        int r=0;
        int c=0;
        boolean dir=true;//upward
        for(int i=0;i<result.length;i++)
        {
            result[i]=mat[r][c];
            if(dir)
            {
                if(c==n-1)
                {
                    r++;
                    dir=false;
                }
                else if(r==0)
                {
                    c++;
                    dir=false;
                }
                else
                {
                    r--;
                    c++;
                }
            }
            else
            {
                if(r==m-1)
                {
                    c++;
                    dir=true;
                }
                else if(c==0)
                {
                    r++;
                    dir=true;
                }
                else
                {
                    r++;
                    c--;
                }
            }

        }
        return result;

    }
}