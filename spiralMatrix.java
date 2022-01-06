/*
Time complexity : O(m*n)
Space complexity: O(1)
*/
public class spiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if(matrix == null || matrix.length == 0) return result;
        int m = matrix.length;
        int n = matrix[0].length;
        int top = 0, bottom = m - 1;
        int left = 0, right = n - 1;
        while(left <= right && top <= bottom) {
            //top row
            for(int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++;
            
            //right col
            if(left <= right) {
                for(int i = top; i <= bottom; i++) {
                    result.add(matrix[i][right]);
                }
                right--;
            }
           
            //bottom row
             if(top <= bottom) {
                for(int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }
            
            //left col
            if(left <= right) {
                for(int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }
        return result;
    }
}