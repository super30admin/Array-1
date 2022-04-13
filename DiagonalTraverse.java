public class DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat == null || mat.length == 0) return new int[0];

        int rows = mat.length;
        int columns = mat[0].length;

        int[] result = new int[rows * columns];

        int r=0, c=0;
        for(int i=0; i < result.length; i++) {
            result[i] = mat[r][c];

            // If the current row + column is even then we are going in the upward direction
            if((r + c) % 2 == 0) {
                // while going upward check the column boundary condition first otherwise it'll be ArrayIndeOutOfBounds
                if(c == columns - 1) {
                    r++;
                }else if(r == 0) {
                    c++;
                }else {
                    r--;
                    c++;
                }
            }else {
                // while going downward check the row boundary condition first otherwise it'll be ArrayIndeOutOfBounds
                if(r == rows - 1) {
                    c++;
                }else if(c == 0) {
                    r++;
                }else {
                    r++;
                    c--;
                }
            }
        }

        return result;
    }
}
