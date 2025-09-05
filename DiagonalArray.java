import java.util.Arrays;

//Time Complexity: O(mn)
//Space Complexity: O(1) we are not using any extra space
//Did this code successfully run on Leetcode : Yes

/**
 * Starting the traversal from (0,0) and keeping the track of direction. When we hit any of the boundaries, we update the direction and go to next element
 */
public class DiagonalArray {

    public static int[] diagonalArray(int[][] nums) {
        int m = nums.length;
        int n = nums[0].length;
        int[] result = new int[m * n];

        int r = 0;
        int c = 0;
        boolean upDirection = true;

        for (int i = 0; i < m * n; i++) {
            // upward traversal
            if (upDirection) {
                result[i] = nums[r][c];
                // hitting right or right top boundary
                if (c == n - 1) {
                    r++;
                    upDirection = false;
                }
                // hitting op boundary
                else if (r == 0) {
                    c++;
                    upDirection = false;
                }
                // normal traversal
                else {
                    r--;
                    c++;
                }
            }
            // downward traversal
            else {
                result[i] = nums[r][c];
                // hitting left or left bottom boundary
                if (r == m - 1) {
                    c++;
                    upDirection = true;
                }
                // hitting bottom boundary
                else if (c == 0) {
                    r++;
                    upDirection = true;
                }
                // normal traversal
                else {
                    r++;
                    c--;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(diagonalArray(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}})));
        System.out.println(Arrays.toString(diagonalArray(new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}})));
    }

}
