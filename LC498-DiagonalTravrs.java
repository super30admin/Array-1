// Time O(m*n), Space O(1) 
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        // direction is changing, we need to maintain 2 direction ptr (up , down)
        
        int row = mat.length;
        int col = mat[0].length;

        int i=0; // row ptr
        int j=0; // col ptr

        boolean dir = true; // initally dir == true -> up else direction

        int[] ans = new int[row*col];
        int ptr = 0; // ptr to ans[]

        while(ptr<ans.length) {
            // store cur to ans
            ans[ptr] = mat[i][j];
            ptr++;

            if (dir) {
                if (i == 0 && j != col-1) {
                    // reach to wall
                    j++; // update col only
                    dir = false; 
                } else if (j == col-1) {
                    // corner case
                    dir = false;
                    i++;// update row only
                }
                else { // default
                    // col inc, row dec
                    j++;
                    i--;
                }
            } else {
                if (j == 0 && i != row-1) {
                    // reach to wall
                    i++; // update row only
                    dir = true; 
                } else if (i == row-1) {
                    // corner case
                    dir = true;
                    j++;// update row only
                }
                else { // default
                    // col dec, row inc
                    i++;
                    j--;
                }
            }
        }

        return ans;


    }
}