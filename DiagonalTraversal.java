public class DiagonalTraversal {
    // TC: O(M * N) where M is number of rows and N is number of cols
    // SC: O(1)
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        int[] res = new int[m * n];
        String direction = "UP";
        int i = 0, j = 0;
        for (int index = 0; index < res.length; index++) {
            if (direction.equals("UP")) {
                res[index] = mat[i][j];
                if (i == 0 && j != n - 1) {
                    j++;
                    direction = "DOWN";
                } else if (j == n - 1) {
                    i++;
                    direction = "DOWN";
                } else {
                    i--;
                    j++;
                }
            } else {
                res[index] = mat[i][j];
                if (j == 0 && i != m - 1) {
                    i++;
                    direction = "UP";
                } else if (i == m - 1) {
                    j++;
                    direction = "UP";
                } else {
                    j--;
                    i++;
                }
            }
        }
        return res;
    }
}
