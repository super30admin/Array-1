time: O(m*n)
space: O(1)
approach: keep track of directions and change direction as well as i and j while hitting the borders.

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int i = 0; int j = 0;
        int[] result = new int[m*n];
        boolean dir = true;
        int count = 0;
        for(int idx = 0; idx < result.length; idx++) {
            result[idx] = mat[i][j];
            //UP
            if (dir) {
                if (i == 0 && j != n-1) {
                    j++; dir = false;
                } else if(j == n-1) {
                    i++; dir = false;
                }
                 else {
                    i--; j++;
                }
            } else {
            //DOWN
                if (j == 0 && i != m-1) {
                    i++; dir = true;
                } else if (i == m-1) {
                    j++; dir= true;
                }
                 else {
                    j--; i++;
                }
            }
        }
        return result;
    }
}
