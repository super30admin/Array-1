// Leetcode Problem : https://leetcode.com/problems/diagonal-traverse/description/
// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
/*
 * I set dir = -1, i=0,j=0 and k=0. I create an ans array of size = r*c. I iterate while k<r*c, and at the start of every iteration
 * I assign ans[k] as mat[i][j]. If dir ==-1, if i==0 and j!=c-1, I increment j and set dir =1. Else if j=c-1, I increment i 
 * and set dir to 1. else I simply decrement i and increment j.
 * If dir ==1, if j==0 and i!=r-1, I increment i by 1 and set dir to -1. If i==r-1, I increment j and set dir to -1. Else
 * I simply increment i and decrement j. I return ans at the end.
 */
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int r = mat.length;
        int c = mat[0].length;
        int ans[] = new int[r*c];
        int i=0,j=0,k=0;
        int dir = -1;
        while(k<r*c)
        {
            ans[k]=mat[i][j];
            k++;
            if(dir==-1)
            {
                if(i==0 && j!=c-1)
                {
                    j++;
                    dir=1;
                }
                else if(j==c-1)
                {
                    i++;
                    dir=1;
                }
                else
                {
                    i--;
                    j++;
                }
            }
            else if(dir==1)
            {
                if(j==0 && i!=r-1)
                {
                    i++;
                    dir=-1;
                }
                else if(i==r-1)
                {
                    j++;
                    dir=-1;
                }
                else
                {
                    i++;
                    j--;

                }
            }
        }
        return ans;
    }
}