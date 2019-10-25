class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        int R = matrix.length, C = R > 0 ? matrix[0].length : 0;
        int[] result = new int[R * C];
        boolean up = true;
        int i = 0, j = 0, k = 0;
        while (k < R * C) {
            if (up) {
                while (i >= 0 && j < C) {
                    result[k++] = matrix[i--][j++];
                }
                // cross the boundary, we need to step back
                i ++; j --;
                if (j + 1 < C) j++; // try to move to next col(in the top bound)
                else i++; // otherwise move to next row (in the right bound)
             } else {
                while (j >= 0 && i < R) {
                    result[k++] = matrix[i++][j--];
                }
                // cross the boundary, we need to step back
                i --; j ++;
                if (i + 1 < R) i++;
                else j++;
            }
            up = !up;
        }
        return result;
    }
}
//SC & TC: O(mxn)
