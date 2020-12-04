/** Given an m x n matrix, return all elements of the matrix in spiral order.
* Time complextiy O(M*N). Space complexity O(1)
*/
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> order = new ArrayList<Integer>();
        if (matrix == null || matrix.length == 0)
            return order;
        int n = matrix.length, m = matrix[0].length;
        int left = 0, right = m-1, top = 0, bottom = n-1;
        while (top <= bottom && left <=right) {
            if(top <= bottom && left <=right) {
                for (int i = left; i <= right; i++)
                {
                    order.add(matrix[top][i]);
                }
                top ++;
            }
            
            if(top <= bottom && left <=right) {
                for (int i = top; i<= bottom; i++) {
                    order.add(matrix[i][right]);
                }
                right--;
            }
            
            if(top <= bottom && left <=right) {
                for (int i = right; i>= left; i--) {
                    order.add(matrix[bottom][i]);
                }
                bottom--;
            }
            
            if(top <= bottom && left <=right) {
                for (int i = bottom; i>= top; i--) {
                    order.add(matrix[i][left]);
                }
                left++;
            }
        }
        return order;
    }
}
