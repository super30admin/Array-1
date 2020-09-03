// Time Complexity : O(N * M) N = rows, M = columns
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
//1. Keep a track of three pointers representing row, column and direction.
//2. For every direction compute three cases which can occur and manipulate the pointers accordingly.
//3. Repeat the same until the pointers haven't reached the length and width of the matrix

// Your code here along with comments explaining your approach
public class Diagonal {

    public int[] findDiagonalOrder(int[][] mat) {
        if (mat.length == 0 || mat == null)
            return new int[0];

        int n = mat.length, m = mat[0].length;
        int i = 0, j = 0, idx = 0;
        int res[] = new int[n * m];
        boolean dir = true;

        while (idx < n * m) {
            res[idx] = mat[i][j];
            idx++;
            // Up
            if (dir)
                if (j == m - 1) {
                    dir = false;
                    i++;
                } else if (i == 0) {
                    dir = false;
                    j++;
                } else {
                    i--;
                    j++;
                }

            // Down
            else if (!dir) {
                if (i == n - 1) {
                    dir = true;
                    j++;
                } else if (j == 0) {
                    dir = true;
                    i++;
                }

                else {
                    i++;
                    j--;
                }
            }

        }

        return res;

    }

    public static void main(String args[]) {
        Diagonal obj = new Diagonal();
        int[][] nums = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        for (int num : obj.findDiagonalOrder(nums))
            System.out.print(" " + num);
    }

}