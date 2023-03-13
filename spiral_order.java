import java.util.List;
import java.util.ArrayList;

// Time Complexity : O(min(m,n) * max(m,n)); m = matrix.length; n = matrix[0].length
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
class Solution {
    private boolean inBounds(int left, int right, int top, int bottom) {
        return !(left > right || top > bottom);
    }

    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0) {
            return null;
        }

        int m = matrix.length;
        int n = matrix[0].length;

        int left = 0;
        int right = n - 1;

        int top = 0;
        int bottom = m - 1;

        List<Integer> result = new ArrayList<>();

        while(inBounds(left, right, top, bottom)) {
            //Push top elements from left -> right
            for(int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }   

            // Processed top, move one step down
            top += 1;

            // Verify not our of bounds
            if(!inBounds(left, right, top, bottom)) {
                break;
            }

            //Push right elements from top -> bottom
            for(int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }

            // Processed right, move one step left
            right -= 1;

            // Verify not our of bounds
            if(!inBounds(left, right, top, bottom)) {
                break;
            }

            //Push bottom elements from right -> left
            for(int i = right; i >= left; i--) {
                result.add(matrix[bottom][i]);
            }

            // Processed bottom, move one step up
            bottom -= 1;

            // Verify not our of bounds
            if(!inBounds(left, right, top, bottom)) {
                break;
            }

            //Push left elements from bottom -> top
            for(int i = bottom; i >= top; i--) {
                result.add(matrix[i][left]);
            }

            // Processed left, move one step right
            left += 1;

            // Verify not our of bounds
            if(!inBounds(left, right, top, bottom)) {
                break;
            }
        }

        return result;
    }
}