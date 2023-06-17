class Problem2 {
    public int[] findDiagonalOrder(int[][] mat) {
        int r = mat.length;
        int c = mat[0].length;
        int ele = r * c;
        int[] res = new int[r * c];

        int idx = 0;
        boolean dir = true; // up;
        int i = 0, j = 0;
        while (idx < ele) {
            res[idx] = mat[i][j];
            idx++;
            if (dir) {
                if (i == 0 && j != c - 1) {
                    j++;
                    dir = false;
                } else if (j == c - 1) {
                    i++;
                    dir = false;
                }

                else {
                    i--;
                    j++;
                }
            } else {
                if (j == 0 && i != r - 1) {
                    i++;
                    dir = true;
                } else if (i == r - 1) {
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
}