class Problem2 {
    // Time Complexity : O(m * n)
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        int[] res = new int[m * n];

        int i = 0;
        int j = 0;
        int k = 0;
        int d = 1;

        while (k < (m * n)) {
            res[k++] = mat[i][j];

            if (d == 1) {
                if (i == 0  && j != (n - 1)) {
                    j++;
                    d = -1;
                } else if (j == (n - 1)) {
                    i++;
                    d = -1;
                } else {
                    i--;
                    j++;
                }
            } else {
                if (j == 0  && i != (m - 1)) {
                    i++;
                    d = 1;
                } else if (i == (m - 1)) {
                    j++;
                    d = 1;
                } else {
                    j--;
                    i++;
                }
            }

        }


        return res;
    }
}