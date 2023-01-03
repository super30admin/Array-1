// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

// Three line explanation of solution in plain english
// We keep track of the direction change for traversal using a boolean flag
// When we traverse up, the indexes change as row--, column++ and down would be column--,row++
// We must also take care of the boundary conditions and chage flag accordingly

// Your code here along with comments explaining your approach
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        boolean dir=true;
        int[] result = new int[m*n];
        int r = 0;
        int c = 0;
        for(int i=0;i<m*n;i++){
            result[i] = mat[r][c];
            if(dir){
                if(r==0&&c!=m-1)
                {
                    c++; dir=false;
                }
                else if(c==m-1)
                {
                    r++; dir=false;
                }
                else
                {
                    r--;c++;
                }
            }
            else{
                 if(c==0&&r!=n-1)
                {
                    r++; dir=true;
                }
                else if(r==n-1)
                {
                    c++; dir=true;
                }
                else
                {
                    r++;c--;
                }
            }
        }
        return result;
    }
}