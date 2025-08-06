
// Time Complexity : O(n*m)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// We are using a boolean variable to keep track of the direction of the diagonal traversal
// We start from the top-left corner and move in the upward direction until we reach the boundary
// Then we switch the direction and move downward until we reach the boundary again
// We continue this process until we have traversed all elements in the matrix

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int n=mat.length,m=mat[0].length;
        int ans[]=new int[n*m];
        boolean dir=true;  //up
        int r=0,c=0;
        for(int i=0;i<n*m;i++){
            ans[i]=mat[r][c];
            if(dir){
                //moving up
                if(c==m-1){
                    r++;
                    dir=false;
                }
                else if(r==0){
                    c++;
                    dir=false;
                }else{
                    c++;
                    r--;
                }
            }else{
                //moving down
                if(r==n-1){
                    c++;
                    dir=true;
                }
                else if(c==0){
                    r++;
                    dir=true;
                }else{
                    r++;
                    c--;
                }
            }
        }
        return ans;
    }
}