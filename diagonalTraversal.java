// Time Complexity : O(M*N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
// The idea is to take a boolean element direction and change the way of traversal according to that
// in this matrix can be traversed diagonally 

public class diagonalTraversal {

    public static int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        int[] res = new int[m * n];
        int idx = 0;
        int i = 0;
        int j = 0;
        boolean dir = true;
        while (idx < m * n) {
            res[idx] = mat[i][j];
            idx++;
            if (dir) {
                if (i == 0 && j != n - 1) {
                    j++;
                    dir = false;
                } else if (j == n - 1) {
                    i++;
                    dir = false;
                } else {
                    i--;
                    j++;
                }
            } else {
                if (j == 0 && i != m - 1) {
                    i++;
                    dir = true;
                } else if (i == m - 1) {
                    j++;
                    dir = true;
                } else {
                    i++;
                    j--;
                }
            }
        }
        return res;

    }

    public static void main(String[] args) {
        int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[] res = findDiagonalOrder(mat);
    }
}
