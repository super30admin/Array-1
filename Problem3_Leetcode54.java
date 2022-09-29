// Time Complexity : O(MN)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix == null || matrix[0].length == 0) return new ArrayList<Integer>();

        int m = matrix.length;
        int n = matrix[0].length;

        int top = 0, left = 0;
        int bottom = m - 1, right = n - 1;

        List<Integer> res = new ArrayList<>();

        while(true) {

            // move right
            for(int i = left; i <= right; i++) {
                res.add(matrix[top][i]);
            }
            // top row is complete so move top down by increasing by 1
            top++;

            if(top > bottom || left > right) break;

            // move down
            for(int i = top; i <= bottom; i++) {
                res.add(matrix[i][right]);
            }
            // right column is complete so move right left by decreasing by 1
            right--;

            if(top > bottom || left > right) break;

            // move left
            for(int i = right; i >= left; i--) {
                res.add(matrix[bottom][i]);
            }
            // bottom row is complete so move bottom up by decreasing by 1
            bottom--;

            if(top > bottom || left > right) break;

            // move up
            for(int i = bottom; i >= top; i--) {
                res.add(matrix[i][left]);
            }
            // left column is complete so move left right by increasing by 1
            left++;

            if(top > bottom || left > right) break;

        }

        return res;

    }
}