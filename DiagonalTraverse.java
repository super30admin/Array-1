
// TC - O(MN)
// SC - O(1)

// Constraints:
// m == mat.length
// n == mat[i].length
// 1 <= m, n <= 10^4
// 1 <= m * n <= 10^4
// -10^5 <= mat[i][j] <= 10^5

public class DiagonalTraverse {
    class Solution {
        public int[] findDiagonalOrder(int[][] mat) {
            int rowCount = mat.length;
            int colCount = mat[0].length;
            int totalElements = rowCount * colCount;
            int[] result = new int[totalElements];
            boolean isDirUp = true;
            int i = 0;
            int j = 0;
            for (int index = 0; index < totalElements; index++) {
                result[index] = mat[i][j];
                if (isDirUp) {
                    if (j == colCount - 1) {
                        i++;
                        isDirUp = false;
                    } else if (i == 0) {
                        j++;
                        isDirUp = false;
                    } else {
                        i--;
                        j++;
                    }
                } else {
                    if (i == rowCount - 1) {
                        j++;
                        isDirUp = true;
                    } else if (j == 0) {
                        i++;
                        isDirUp = true;
                    } else {
                        i++;
                        j--;
                    }
                }

            }
            return result;
        }
    }
}
