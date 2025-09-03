// Time Complexity : O(mn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

/*
 * Look at the properties of the diagonal traverse and where do we hit the walls
 * Consider the direction, top wall, right wall, left wall, bottom wall while handling the cases
 * Think about the precedence of if conditions
 */

// Your code here along with comments explaining your approach

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        int r = 0;
        int c = 0;

        int[] res = new int[m*n];
        boolean dir = true; //  we start from the upward direction

        for(int i = 0; i < m * n; i++){
            //collect the element
            res[i] = mat[r][c];

            //upward direction
            if(dir){
                //increment row and move in downward direction
                // first if condition is to check the right wall as if we have the top wall condition it wont handle the case of where to go from top right element correctly
                if(c == n - 1){
                    r++;
                    dir = false;
                }
                else if(r == 0){
                    c++;
                    dir = false;
                }
                else{
                    c++;
                    r--;
                }
            }
            //downward direction
            else{
                if(r == m - 1){
                    c++;
                    dir = true;
                }
                else if(c == 0){
                    r++;
                    dir = true;
                }
                else{
                    r++;
                    c--;
                }
            }
        }
        return res;
    }
}
