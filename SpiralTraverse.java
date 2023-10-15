// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length; int n = matrix[0].length;
        int top=0; int bottom=m-1;
        int left=0; int right=n-1;
        List<Integer> li = new ArrayList<>();
        while(left<=right && top<=bottom) {
            for(int j=left; j<=right; j++) {
                li.add(matrix[top][j]);
            }
            top++;
            for(int i=top; i<=bottom; i++) {
                li.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom) {
                for(int j=right; j>=left; j--) {
                    li.add(matrix[bottom][j]);
                }
                bottom--;
            }
            if(left<=right) {
                for(int i=bottom; i>=top; i--) {
                    li.add(matrix[i][left]);
                }
                left++;
            }

        }
        return li;
    }
}