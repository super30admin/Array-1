/*the time complexity of this implementation is O(m*n)
where m is no. of rows and nis no. of columns
* */
import java.util.Arrays;

public class Diagonal {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] result = new int[m * n];
        int row = 0, col = 0, d = 1;
        for (int i = 0; i < m * n; i++) {
            result[i] = mat[row][col];
            row -= d;
            col += d;
            if (row >= m) { row = m - 1; col += 2; d = -d; }
            if (col >= n) { col = n - 1; row += 2; d = -d; }
            if (row < 0) { row = 0; d = -d; }
            if (col < 0) { col = 0; d = -d; }
        }
        return result;
    }
    public static void main(String[] args) {
        Diagonal diagonal = new Diagonal();
        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[] result = diagonal.findDiagonalOrder(mat);
        System.out.println(Arrays.toString(result));
    }
}
