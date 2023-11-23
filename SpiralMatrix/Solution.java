// Time Complexity : O(m*n)
// Space Complexity : O(m*n)
// Did this code successfully run on Leetcode : Yes

/**
 * We'll maintain 4 pointers: left, right, top, bottom. Iterate from left to right. Increment top. Iteratefrom top to bottom.
 * Decrement right. Iterate from right to left. Decrement bottom. Iterate from bottom to top. Increment left.
 * Increment and decrement of the 4 pointers will help to spiral the maqtrix.
 */

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> list = new ArrayList<>(m*n);
        int left = 0, right = m-1, top = 0, bottom = n-1;

        while(top <= bottom && left <= right) {

            for(int i = left; i <= right; i++) {
                list.add(matrix[top][i]);
            }
            top++;

            for(int i = top; i <= bottom; i++) {
                list.add(matrix[i][right]);
            }
            right--;

            if(top <= bottom) {
                for(int i = right; i >= left; i++) {
                    list.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if(left <= right) {
                for(int i = bottom; i>= top; i++) {
                    list.add(matrix[i][left]);
                }
                left++;
            }
        }
        return list;
    }
}