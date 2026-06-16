class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        // TC - O(m*n)
        // SC - O(m*n)
        /*
            To traverse matrix diagonally, we need to keep track of the direction we are moving in and what diagonal index to move to next.
            We use flag to keep track of direction, so flag is true when e move up the matrix and false otherwise. 
            If flag is true and we reach the topmost row set the flag to false and incr column index
        */
        int n = mat.length;
        int m = mat[0].length;

        int[] result = new int[n*m];
        int r = 0, c = 0;
        boolean flag  = true;

        for (int i = 0; i< n*m; i++) {
            result[i]= mat[r][c];
            if (flag) {
                //If flag is true and we reach the topmost row and column is not the last, set the flag to false and incr column index
                if (r == 0 && c != m - 1) {
                    flag = false;
                    c++;
                } else if (c == m - 1) {
                    //If flag is true and we reach the last column, set the flag to false and incr row index
                    flag = false;
                    r++;
                } else {
                    // else we keep moving up diagonally by decr row and incr col
                    r--;
                    c++;
                }
            } else {
                if (c == 0 && r != n - 1) {
                    //If flag is false and we reach the topmost column and row is not the last, set the flag to true and incr row index
                    r++;
                    flag = true;
                } else if (r == n - 1) {
                    //If flag is false and we reach the last row, set the flag to true and incr col index
                    flag = true;
                    c++;
                } else {
                    // else we keep moving down diagonally by incr row and decr col
                    r++;
                    c--;
                }
            }
        }

        return result;
    }
}