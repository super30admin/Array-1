// Time Complexity : O(m * n)
// Space Complexity : O(m * n)
// Did this code successfully run on Leetcode : Yes

public class Solution {
    public IList<int> SpiralOrder(int[][] matrix) {
        int m = matrix.Length;
        int n = matrix[0].Length;
        int[] result = new int[m*n];
        int top = 0; int bottom = m - 1;
        int left = 0; int right = n - 1;
        int j = 0;
        while(top <= bottom && left <= right) {
            //top row
            for(int i = left; i <= right; i++) {
                result[j++] = matrix[top][i];
            }
            top++;
            //right column
            for(int i = top; i <= bottom; i++) {
                result[j++] = matrix[i][right];
            }
            right--;
            //bottom row
            if(top <= bottom) {
                for(int i = right; i >= left; i--) {
                    result[j++] = matrix[bottom][i];
                }
            }
            bottom--;
            //left column
            if(left <= right) {
                for(int i = bottom; i >= top; i--) {
                    result[j++] = matrix[i][left];
                }
            }
            left++;
        }
        return result;
    }
}
