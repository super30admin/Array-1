// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {


        int m = mat.length;
        int n= mat[0].length;
        int i=0,j=0, index=0;
        int dir=1;
        int[] res = new int[m*n];
        for( index=0;index<res.length;index++)
        {
            res[index]=mat[i][j];

            //up
            if(dir==1){
                if(j==n-1){
                    i++;
                    dir=-1;
                }
                else if(i==0){
                    j++;
                    dir=-1;
                }
                else{
                    i--;
                    j++;
                }

            }
            else{    // down case
                if(i==m-1)
                {
                    j++;
                    dir=1;
                }
                else if(j==0)
                {
                    i++;
                    dir=1;
                }
                else{
                    i++;
                    j--;
                }

            }
        }
        return res;
    }
}