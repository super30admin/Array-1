// Time Complexity : O(m*n)
// Space Complexity : O(1) -> no extra space was used the sppace was returned as the output
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        //base case
        if (mat == null || mat.length == 0) return new int[0];

        int m = mat.length; //rows
        int n = mat[0].length; //cols
        int[] res = new int[m * n];
        int row = 0;
        int col = 0;

        for (int i = 0; i < m*n; i++) {
            res[i]=mat[row][col];

            if((row+col)%2 == 0){
                if(col==n-1) row++; //end of no of cols
                else if(row==0) col++; 
                else {row--; col++;}
            } else {
                if(row==m-1) col++;
                else if(col==0) row++;
                else {row++; col--;}
            }
        }
        return res;
    }
}