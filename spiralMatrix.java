//time complexity O(m * n)
//space complexity O(1)
//approach: Have 4 pointers left, right, top and bottom then traverse as described in the problem and manipulate the pointers accordingly

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0; int right = n - 1;
        int top = 0; int bottom = m - 1;
        List<Integer> result = new ArrayList<>();
        while (left <= right && top <= bottom) {
            //top ++
            for (int j = left; j <= right; j++) {
                result.add(matrix[top][j]);
            }
            top++;
            if (top <= bottom) {
                //right --
                for (int i = top; i <= bottom; i++) {
                    result.add(matrix[i][right]);
                }            
                right--;
            }

            if (left <= right && top <= bottom) {
                //bottom --
                for (int j = right; j >= left; j--) {
                    result.add(matrix[bottom][j]);
                }            
                bottom--;
            }

            if (left <= right && top <= bottom) {
                //left ++
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }
        return result;
    }
}
