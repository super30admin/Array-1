public class LeectCode498 {
    public int[] findDiagonalOrder(int[][] mat) {
        if (mat == null || mat.length == 0)
            return new int[] {};
        int i = 0, j = 0;
        int n = mat.length;
        int m = mat[0].length;
        int[] result = new int[m * n];
        int dir = 1;
        int index = 0;
        while (index < m * n) {
            result[index] = mat[i][j];
            index++;
            if (dir > 0) {
                if (j == m - 1) {
                    i++;
                    dir = -1;
                } else if (i == 0) {
                    j++;
                    dir = -1;
                } else {
                    i--;
                    j++;
                }
            } else {

                if (i == n - 1) {
                    j++;
                    dir = 1;
                } else if (j == 0) {
                    i++;
                    dir = 1;
                } else {
                    i++;
                    j--;
                }
            }
        }

        return result;
    }
}

// time complexity--> O(m*n)
// space complexity--> O(m*n)