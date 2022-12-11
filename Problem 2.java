// Time Complexity : O(m*n)
// Space Complexity : O(1) as ouput array is not counted
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach


/*
We need to see the diagonal in 3x3 and 4x4 matrices. We then observe the edge cases , where we need to switch the direction 

Edge cases:   
1)for up: check if the row is max and col is still left, for down : chec if rows still there and no column
2)for up :check if col is max but row is still left , for down : row is max but col is still left
3)for up: check if row and col both max for down: check if no rows or columns left

*/
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] result = new int[m*n];
        boolean dir = true; // true for up and false for down
        int row =0,col=0;
        int ptr = 0;

        while(row <m && col < n){ // O(m*n)

            result[ptr] = mat[row][col];

            // check condition

            if(dir){ //upwards

            // check if the row is max and col is still left

            if(row == 0 && col < n-1){
                col++;
                dir = false;
            }

            //check if col is max but row is still left
            else if (col == n-1 && row >0){
                row++;
                dir = false;
            }

            // check if row and col both max
            else if(col == n-1 && row ==0){
                row++;
                dir= false;

            }
            else{
                row--;
                col++;
            }

            } // downwards
            else{
                
                // when rows still there and no column
                if(col == 0 && row < m - 1){
                    row++;
                    dir = true;
                }else if( col ==0 && row == m-1){ // check if no rows or columns left
                    col++;
                    dir = true;
                }else if(row == m-1 && col >0){ // row is max but col is still left

                col++;
                dir = true;
                }
                else{
                    col-- ;
                    row++;
                }

            }
            ptr++;

        }

        return result;
    }
}