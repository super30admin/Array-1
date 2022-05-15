// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach

class Spiral {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int n = matrix[0].length;
        int m = matrix.length;
        int top = 0; int right = n-1; int bottom = m-1; int left = 0;
        if(matrix == null) return result;
        while (top<=bottom && left<=right) {
            for(int j=left; j<=right; j++) {
                result.add(matrix[top][j]);
            }
            top++;
            for(int i=top; i<=bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;
            if(top <= bottom) {
                for(int j=right; j>=left; j--) {
                    result.add(matrix[bottom][j]);
                }
                bottom--;
            }
            if(left<=right) {
                for(int i=bottom; i>=top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }
        return result;
    }
}