import java.util.Arrays;
//Time Complexity O(n)
// Space Complexity O(1)

public class Problem2 {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] result = new int[m * n];
        int index = 0;
        int r = 0;
        int c = 0;
        int dir = 1;

        while (index < m * n) {
            result[index] = mat[r][c];
            if (dir == 1) {
                if (c == n - 1) {
                    r++;
                    dir = -1;
                } else if (r == 0) {
                    c++;
                    dir = -1;
                } else {
                    r--;
                    c++;
                }
            } else {
                if (r == m - 1) {
                    c++;
                    dir = 1;
                } else if (c == 0) {
                    r++;
                    dir = 1;
                } else {
                    c--;
                    r++;
                }
            }
            index++;
        }
        return result;
    }

    public static void main(String[] args) {
        Problem2 problem2 = new Problem2();
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[] result = problem2.findDiagonalOrder(matrix);
        System.out.println("Final value " + Arrays.toString(result));
    }

}
