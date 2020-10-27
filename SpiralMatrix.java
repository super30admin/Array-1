// Time Complexity: O(n x n)
// Space Complexity: O(1)

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        //edge case
        if(matrix == null || matrix.length == 0) return result;
        int left = 0; int right = matrix[0].length - 1;
        int top = 0; int bottom = matrix.length - 1;
        while (left <= right && top <= bottom) {
            // top
            if(left <= right && top <= bottom) {
                for(int i = left; i <= right; i++) {
                    result.add(matrix[top][i]);
            }
        }
            top++;
            // right column
            if(left <= right && top <= bottom) {
                for(int i = top; i <= bottom; i++) {
                    result.add(matrix[i][right]);
            }
        }
            right--;
            //bottom 
            if(left <= right && top <= bottom) {
                for(int i = right; i >= left; i--) {
                result.add(matrix[bottom][i]);
            }
        }
            bottom--;
            // left column
            if(left <= right && top <= bottom) {
                for(int i= bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
            }
        }
            left++;
        }
        return result;
        
    }
}
