// Time Complexity : O(mn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

// Approach
// We take dir variable to determine the direction in which we want to move at any point
// we observe the general trend of i, j for both downward and upward direction
// we observe the corner cases to handle and where the dir needs to be reversed

public class DiagonalTraversal {

    public int[] findDiagonalOrder(int[][] mat) {

        if(mat ==null || mat.length ==0) {
            return new int[]{};
        }

        int m = mat.length;
        int n = mat[0].length;

        // Creating 1D matrix to return the ans array
        int [] ans = new int[m*n];

        int dir =1; // variable to determine the direction
        int i=0;
        int j=0;
        for(int k=0; k<m*n;k++) {
            ans[k] = mat[i][j];
            if(dir ==1) {
                // corner case - when we have reached the last column, reverse the dir and increment row
                if(j==n-1) {
                    i++;
                    dir= -1;
                }
                // corner case - when we are at first row, increment the column, reverse the direction
                else if(i==0) {
                    j++;
                    dir=-1;
                }
                // general case - decrement row, increment column
                else {
                    i--;
                    j++;
                }
            } else {
                // corner case - when we have reached the last row, reverse the dir and increment column
                if(i==m-1) {
                    j++;
                    dir=1;
                }
                // corner case - when we are at first column, increment the row, reverse the direction
                else if(j==0) {
                    i++;
                    dir=1;
                }
                // general case - increment row, decrement column
                else {
                    i++;
                    j--;
                }
            }
        }
        return ans;
    }
}
