/**
 Time complexity is O(mn)
 Space complexity: O(1) as result set is not included
 */
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat == null || mat.length == 0) {
            return new int[]{};
        }

        int m = mat.length, n = mat[0].length, dir = 1;
        int result[] = new int[m * n];
        int index = 0;
        int i = 0, j = 0;

        while(index < m * n) {
            result[index] = mat[i][j];
            index++;

            if(dir == 1){
                if(j == n - 1) {
                    dir = -1;
                    i++;
                } else if (i == 0) {
                    dir = -1;
                    j++;
                } else {
                    i--;
                    j++;
                }
            } else {
                if (i == m - 1) {
                    dir = 1;
                    j++;
                } else  if(j == 0) {
                    dir = 1;
                    i++;
                }  else {
                    j--;
                    i++;
                }
            }
        }

        return result;
    }
}