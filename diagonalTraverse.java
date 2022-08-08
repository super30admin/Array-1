// Time Complexity : O(nm)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES

// In case of diagonal traversal, we will be divide problem in two direction, upward and the downward!

class diagonalTraverse {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat == null || mat.length == 0) return new int[0];

        int m = mat.length;
        int n = mat[0].length;
        int[] result = new int[m*n];
        int dir = 1;
        int i = 0, j = 0, k = 0;

        while(k < m*n){
            result[k] = mat[i][j];

            // in case of upward direction, when we reach edge we will change the direaction and the adjust values of row(i) and column(j) accordingly.
            if(dir == 1){
                if(i == 0 && j != n-1){
                    dir = 2;
                    j++;
                } else if(j == n-1){
                    dir = 2;
                    i++;
                } else {
                    i--;
                    j++;
                }
            } else {
                // in case of downward direction, when we reach edge we will change the direaction and the adjust values of row(i) and column(j) accordingly.
                if(j == 0 && i != m-1){
                    dir = 1;
                    i++;
                } else if(i == m-1){
                    dir = 1;
                    j++;
                } else {
                    j--;
                    i++;
                }
            }
            // increament k in each iteration of the loop;
            k++;

        }

        return result;
    }
}