/* Time Complexity :  O(m*n)
   Space Complexity :  O(1)
   Did this code successfully run on Leetcode : Yes
   Any problem you faced while coding this : No
*/
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {     
        int m = mat.length,n=mat[0].length;
        int[] res = new int[m*n];
        int dir=1,r=0,c=0,i=0;      
        while(i< m*n)
        {
            res[i]= mat[r][c];
            if(dir==1) //bottom to top
            {
                //three cases: two special cases - when row is 0, when its last column, and a normal case
                //update the direction to other when we meet the special cases
                if(c==n-1) 
                {
                   r++;
                   dir=-1;
                }
                else if(r==0)
                {
                    c++;
                    dir=-1;
                }
                else
                {
                    r--;
                    c++;
                }
            }
            else //top to bottom
            {
                //three cases: two special cases - when column is 0, when its last row, and a normal case
                //update the direction to other when we meet the special cases
                if(r==m-1)
                {
                    c++;
                    dir=1;
                }
                else if(c==0)
                {
                    r++;
                    dir=1;
                }
                else
                {
                    r++;
                    c--;
                }
            }
            i++;
        }
        return res;
    }
}