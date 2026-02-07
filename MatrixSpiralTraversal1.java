import java.util.ArrayList;
import java.util.List;
/**
 * url: https://leetcode.com/problems/spiral-matrix/
 * 54. Spiral Matrix
 * Time Complexity: O(m*n)
 * Space Complexity: O(m*n)
 * Uses list
 */
public class MatrixSpiralTraversal1 {

    public List<Integer> spiralTraversal(int[][] matrix) {
        int n = matrix[0].length; // column
        int m = matrix.length; // row

        List<Integer> list = new ArrayList<>();

        int i = 0, j = 0;
        while (list.size() < m * n) {
            // top
            while (j < n && matrix[i][j] != 101) {
                list.add(matrix[i][j]);
                matrix[i][j] = 101;
                j++;
            }

            // right 
            j--; // reset j to the last valid column
            i++;
            while (i < m && matrix[i][j] != 101) {
                list.add(matrix[i][j]);
                matrix[i][j] = 101;
                i++;
            }
            // bottom 
            j--;
            i--; // reset i to the last valid row
            while (j >= 0 && matrix[i][j] != 101) {
                list.add(matrix[i][j]);
                matrix[i][j] = 101;
                j--;
            }

            // left
            i--;
            j++; // reset j to the last valid column
            while (i >= 0 && matrix[i][j] != 101) {
                list.add(matrix[i][j]);
                matrix[i][j] = 101;
                i--;
            }
            i++;
            j++;

        }
        
        return list;

    }

    public static void main(String[] args) {
         List<Integer> result = new MatrixSpiralTraversal1().spiralTraversal(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
        for (int r : result) {
            System.out.print(r + " ");
        }
        System.out.println("");

        result = new MatrixSpiralTraversal1().spiralTraversal(new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}});
        for (int r : result) {
            System.out.print(r + " ");
        }
        System.out.println("");

        result = new MatrixSpiralTraversal1().spiralTraversal(new int[][]{{1, 2}, {4, 5}, {7, 8}});
        for (int r : result) {
            System.out.print(r + " ");
        }
        System.out.println("");
    }

}
