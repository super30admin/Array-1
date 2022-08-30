// Time complexity: O(m*n)
// Space complexity: O(1)

// Approach: We need to have 4 pointers, top, bottom, left and right. We basically have four walls, top, bottom, left and right and whenever we reach a wall, we need to change the direction. So when we need to add the first row to the result, we iterate from left to right. When we have to add the last column, we iterate from top to bottom and so on. Each time we increment or decrement the wall pointer so that we keep shrinking our matrix and don't repeat adding the same elements to the result. Lastly, everytime we update the wall pointer (top, bottom, left, right) we need to check if top is still less than bottom and left is still less than right.

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<Integer>();
        int m = matrix.length;
        int n = matrix[0].length;
        int top = 0; int bottom = m-1;
        int left = 0; int right = n-1;
        while (top <= bottom && left <= right) {
            // top
            if (top <= bottom && left <= right) {
                for (int i = left; i <= right; i++) {
                    result.add(matrix[top][i]);
                }
            }
            top++;
            
            // right
            if (top <= bottom && left <= right) {
               for (int i = top; i <= bottom; i++) {
                    result.add(matrix[i][right]);
                } 
            }
            right--;
            
            // bottom
            if (top <= bottom && left <= right) {
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
            }
            bottom--;
            
            // left
            if (top <= bottom && left <= right) {
               for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                } 
            }
            left++;
        }
        
        return result;
    }
}