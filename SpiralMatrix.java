//tc=O(m*n)
//sc=O(1)
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        if (matrix == null || matrix.length == 0) {
            return new ArrayList<>();
        }

        List<Integer> result = new ArrayList<>();

        int m = matrix.length;
        int n = matrix[0].length;
        int top = 0;
        int bot = m -1;
        int left = 0;
        int right = n-1; 


        while (top <= bot && left <= right) {

            // left to right
            for (int i = left; i <=right; i++){
                result.add(matrix[top][i]);
            }
            top ++;

            //top to bottom
            for (int i = top; i <= bot; i++) {
                result.add(matrix[i][right]);
            }           
            right--;

            // right to left
            if (top <= bot) {
                 for (int i = right; i >= left; i--) {
                    result.add(matrix[bot][i]);
                    }
            }           
            bot--;

            //bot to top
            if (left <= right) {
                for (int i = bot; i >= top; i--) {
                    result.add(matrix[i][left]);
                }            
            }
           
            left++;
        }
        return result;
    }
}