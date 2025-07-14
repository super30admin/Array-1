
//TC: O(m * n)
//SC: O(1)
//Implemented using the directions from bottom to top and top to bottom
class DiagnolTraverse {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat == null || mat.length == 0) {
            return new int[] {};
        }
        int m = mat.length;
        int n = mat[0].length;
        int[] ans = new int[m * n];
        int row = 0;
        int col = 0;
        int index = 0;
        int dir = 1;
        //1 -> bottom to top;
        //-1 -> top to bottom;
        while( index < m * n){
            ans[index] = mat[row][col];
            index++;
            if(dir == 1) {
                if(col == n-1) {
                    dir = -1;
                    row++;

                } else if(row == 0) {
                    dir = -1;
                    col++;

                } else {
                    row--;
                    col++;
                }

            } else {
                if(row == m-1) {
                    dir = 1;
                    col++;

                } else if(col == 0) {
                    dir = 1;
                    row++;

                } else {
                    row++;
                    col--;
                }

            }

        }

        return ans;
    }
}
