// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yew
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
/*
To list the elements that are diagonal in a m*n matrix we have three cases to handle
We either traverse upwards or downwards
while going in upward direction, we either traverse normally or we reach the upper bound during which we need to jump to next 
column or we reach right most bound during which we need to jump to next row
while going in downward direction, we either traverse normally or we reach the lower bound where we need to jump to next column 
or we reach the left boundary where we need to jump to next row
*/

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] result = new int[m*n];
        int r = 0, c = 0;
        boolean dir = true;
        for(int i=0;i < m*n;i++) {
            result[i] = mat[r][c];
            //going upward 
            if(dir) {
                if(r==0 && c!=n-1) {
                    c++; dir = false; //top row
                } else if(c==n-1) {
                    r++; dir= false; //last column
                } else {
                    r--; c++; //normal traverse
                }
            } else {
                //downward
                if(c==0 && r!=m-1) { //first column
                    r++; dir = true;
                } else if(r==m-1) { //last row
                    c++; dir= true;
                } else {
                    c--; r++; // normal traverse
                }
            } 
        }
        return result;
    }
}
