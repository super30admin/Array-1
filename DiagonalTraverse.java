// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
/*
we select two directions going upwards or downwards and increment/decrement
row/col acc to it. The boundary conditions need to be checked acc to the
direction in which we are going, as row < 0 and col > n will occur when going
upwards and row > m and col < 0 will occur while going downwards
*/


// Your code here along with comments explaining your approach

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {

        int m = mat.length;
        int n = mat[0].length;

        int count = 0;

        int total = m*n;

        int rowdir = 1;

        int row  = 0;
        int col = 0;


        int[] res = new int[total];

        while(count < total)
        {
            res[count++] = mat[row][col];// traverse the element first

            //while going upwards
            if(rowdir == 1){
                if(col == n-1){
                    rowdir = -1;
                    row++;
                }
                else if(row == 0){
                    rowdir = -1;
                    col++;
                }
                else{
                    row--;
                    col++;
                }
            }
            //while going downwards
            else{
                if(row == m-1){
                    rowdir = 1;
                    col++;
                }
                else if(col == 0){
                    rowdir = 1;
                    row++;
                }
                else{
                    row++;
                    col--;
                }
            }


        }

        return res;
    }
}
