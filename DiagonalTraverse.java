package S30_Codes.Array_1;

// Time Complexit : O(m*n)
// Space Complexity : O(1)
// Array-1

class DiagonalTraverse {
    private final static int UP = 0, DOWN = 1;

    public int[] findDiagonalOrder(int[][] mat) {

        int m = mat.length, n = mat[0].length;

        int[] result = new int[m*n];
        int idx = 0;

        int dir = UP;
        int row = 0, col = 0;

        while(idx < m*n){

            result[idx++] = mat[row][col];

            if(dir == UP){
                if(col == n-1){
                    row++;
                    dir = DOWN;
                }
                else if(row == 0){
                    col++;
                    dir = DOWN;
                }
                else{
                    row--;
                    col++;
                }
            }
            else{
                if(row == m-1){
                    col++;
                    dir = UP;
                }
                else if(col == 0){
                    row++;
                    dir = UP;
                }
                else{
                    row++;
                    col--;
                }
            }
        }
        return result;
    }
}