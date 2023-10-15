//time complexity-O(mxn)
//space complexity-O(1)
//passed all the test cases on leetcode
// the approach here is to use a direction variable to  traverse up or down and handle some edge cases
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        boolean direction = true;
        int m = mat.length;
        int n = mat[0].length;
        int arr[] = new int[m * n];
        int i = 0, j = 0, k = 0;
        while (i < m && j < n) {
            if (direction == true) {
                while (true) {
                    arr[k++] = mat[i][j];
                    if (i > 0 && j < n - 1) {
                        i--;
                        j++;
                    } else {
                        break;
                    }
                }
                if (j == n - 1)
                    i++;
                else
                    j++;
            } else {
                while (true) {
                    arr[k++] = mat[i][j];
                    if (i < m - 1 && j > 0) {
                        i++;
                        j--;
                    } else {
                        break;
                    }
                }
                if (i != m - 1)
                    i++;
                else
                    j++;
            }
            direction = !direction;
        }
        return arr;
    }
}
