// Time Complexity : O(m*n) size of matrix
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
//keep track of top row and bottom row already traversed similarly keep track of left column and right column already traversed
//iterate over the matrix keeping the index between top and bottom row and left and right index

// Your code here along with comments explaining your approach

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int tr = 0; //top row tracker
        int br = matrix.length-1; //bottom row tracker
        int lc = 0; //left column tracker
        int rc = matrix[0].length-1; //right column tracker

        List<Integer> res = new ArrayList<Integer>();

        while(tr<=br && lc <= rc) {
            int currCol = lc;
            int currRow = tr;
            while(currCol<=rc) {
                res.add(matrix[tr][currCol++]);
            }
            if (tr == br) break;

            tr++;
            currRow = tr;
            currCol = rc;
            while(currRow<=br) {
                res.add(matrix[currRow++][currCol]);
            }

            rc--;
            currCol = rc;
            currRow = br;
            while(currCol>=lc) {
                res.add(matrix[currRow][currCol--]);
            }

            br--;
            currRow = br;
            currCol = lc;
            while(currRow >=tr && rc >= lc) {
                res.add(matrix[currRow--][currCol]);
            }

            lc++;

        }
        return res;
    }
}
