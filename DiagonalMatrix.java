class DiagonalMatrix {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat == null || mat.length == 0) return new int[]{};

        //row length
        int r = mat.length;
        //col length
        int c = mat[0].length;
        int[] result = new int[r*c];

        //first move upwards
        int dir = 1;

        int k=0;
        int i=0, j=0;

        while(k < r*c) {
            result[k++] = mat[i][j];

            //moving upwards direction
            if(dir == 1) {
                //while incrementing j, if it reaches the end of the col, change the dir and move to next row
                if(j == c-1) {
                    dir = -1;
                    i++;
                }
                //while decrementing i, if it reaches the first row, change the dir and move to next col
                else if(i == 0) {
                    dir = -1;
                    j++;
                }
                //move diagonally upwards
                else {
                    i--;
                    j++;
                }
            }
            //moving downwards direction
            else {
                //while incrementing i, if it reaches the end of the row, change the dir and move to next col
                if(i == r-1) {
                    dir = 1;
                    j++;
                }
                //while decrementing j, if it reaches the first col, change the dir and move to next row
                else if(j == 0) {
                    dir = 1;
                    i++;
                }
                //move diagonally upwards
                else {
                    i++;
                    j--;
                }
            }
        }

        return result;
    }
}