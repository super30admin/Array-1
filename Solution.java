import java.util.ArrayList;
import java.util.List;

class Solution {
    // TC:O(mn) SC:O(1)
    public int[] findDiagonalOrder(int[][] mat) {
        if (mat == null || mat.length == 0) {
            return new int[] {};
        }
        int m = mat.length;
        int n = mat[0].length;
        int dir = 1;

        int[] result = new int[m * n];
        int index = 0;
        int r = 0, c = 0;
        while (index < m * n) {
            result[index] = mat[r][c];
            index++;
            if (dir == 1) {
                if (c == n - 1) {
                    dir = -1;
                    r++;

                } else if (r == 0) {
                    dir = -1;
                    c++;

                } else {
                    r--;
                    c++;
                }

            } else {
                if (r == m - 1) {
                    dir = 1;
                    c++;
                } else if (c == 0) {
                    dir = 1;
                    r++;
                } else {
                    r++;
                    c--;
                }

            }
        }
        return result;
    }

    // TC:O(n) SC:O(1)
    public int[] productExceptSelf(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new int[] {};
        }
        int n = nums.length;
        int[] result = new int[n];
        int rp = 1;
        result[0] = rp;
        for (int i = 1; i < n; i++) {
            rp = rp * nums[i - 1];
            result[i] = rp;
        }
        rp = 1;
        for (int i = n - 2; i >= 0; i--) {
            rp = rp * nums[i + 1];
            result[i] = result[i] * rp;
        }
        return result;
    }

    // TC:O(mn) SC:O(1)
    public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return new ArrayList<>();
        }
        List<Integer> result = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;

        int top = 0, bottom = m - 1;
        int left = 0, right = n - 1;

        while (top <= bottom && left <= right) {
            // traversing left to right
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++;
            // traversing top to bottom
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);

            }
            right--;
            // traversing right to left
            if (top <= bottom && left <= right) {
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
            }
            bottom--;
            // traversing bottom to top
            if (top <= bottom && left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
            }
            left++;
        }
        return result;
    }
}