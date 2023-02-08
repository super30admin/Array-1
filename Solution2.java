// Time Complexity : O(m*n)
// Space Complexity : O(m*n)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

/*
 * I maintain a variable dir, which when set to 1, implies that the array is being traversed in a diagonally upward direction 
 * and which when set to -1, implies that the array is being traversed in a diagonally downward direction.
 * When dir =1, if c reaches columns-1, I increase r and set dir to -1. Similarly if r reaches 0, I increase c and set dir to -1. Else I simply decrement r and increment c.
 * When dir =-1, if r reaches rows-1, I increase c and set dir to 1. Similaryly if c reaches 0, I increase r and set dir to 1. Else I simply increment r and decrement c.
 */
class Solution2 {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat.length==0 || mat==null)
        {
            return new int[] {};
        }
        int rows = mat.length;
        int columns = mat[0].length;
        int ans[] = new int[rows*columns];
        int index=0;
        int dir=1;
        int r=0,c=0;
        while(index<rows*columns)
        {
            ans[index]=mat[r][c];
            index++;
            if(dir==1)
            {
                if(c==columns-1)
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

            else if(dir==-1)
            {
                if(r==rows-1)
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
                    c--;
                    r++;
                }
            }
        }
        return ans;
    }
}