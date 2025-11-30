// Time Complexity : O(mn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
// Traverse the matrix diagonally, switching direction on each diagonal.
// Move upward-right when the flag is true, and downward-left when the flag is false.
// When you hit matrix boundaries, adjust the row or column and flip the direction to continue correctly.
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        boolean flag = true;
        int[] output = new int[m*n];
        int r =0;
        int c =0;
        for( int i = 0; i < m*n; i++){
            output[i] = mat[r][c];
            if (flag){
                if (c == n-1){
                    r++;
                    flag = false;
                }else if(r == 0){
                    c++;
                    flag = false;
                }else{
                    r--;
                    c++;
                }
            }else{
                if (r == m-1){
                    c++;
                    flag = true;
                }else if(c == 0){
                    r++;
                    flag = true;
                }else{
                    r++;
                    c--;
                }
            }
        }
        return output;
    }
}