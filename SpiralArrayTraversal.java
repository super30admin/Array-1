// Time Complexity : O(M*N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// Basically keeping four pointers to keep track of outer boundaries
// squeezing them in when the lane is complete

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int top = 0;
        int bottom = m-1;
        int left = 0;
        int right = n-1;
        while(top <= bottom && left <= right) {
            for(int i=left;i<=right;i++) {
                result.add(matrix[top][i]);
            }
            //squeezing the top boundary once the first row done
            top++;
            for(int j=top;j<=bottom;j++) {
                result.add(matrix[j][right]);
            }
            //squeezing the right boundary once the last column with row top to bottom is done
            right--;
            //additional condition top<=bottom has been added to avoid while loop breaches,
            // incase of uneven 2D array like 4*3 matrix, where left is still less than right,
            //though top might have already crossed bottom
            for(int k=right;k>=left && top<=bottom;k--) {
                result.add(matrix[bottom][k]);
            }
            bottom--;

            for(int l=bottom;l>=top && left<=right;l--) {
                result.add(matrix[l][left]);
            }
            left++;
        }
        return result;
    }
}