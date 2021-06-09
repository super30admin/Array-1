package Array1;

public class question27_diagonalTraverse {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat == null || mat.length == 0) return new int[0];
        int m = mat.length;
        int n = mat[0].length;
        int result[] = new int[m * n];
        int i = 0; //index on resultant array
        int row = 0;
        int col = 0;
        int dir = 1;

        while(i < m * n) {
            result[i] = mat[row][col];
            if(dir == 1) {
                if(col == n - 1) {
                    row++;
                    dir = -1;
                } else if(row == 0) {
                    col++;
                    dir = -11;
                } else {
                    row--;
                    col++;
                }
            } else { //means dir = -1
                if(row == m - 1) {
                    col++;
                    dir = 1;
                } else if(col == 0) {
                    row++;
                    dir = 1;
                } else {
                    row++;
                    col--;
                }
            }
            i++;
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
