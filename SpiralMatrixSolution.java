import java.util.ArrayList;
import java.util.List;

// Time Complexity : O(N*M), where N rows and M columns
// Space Complexity : O(1), no additional sapce
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english
    // 4 for loops: 1. from top left to right, 2. from top to bottom on the right side, 3. from right to left on the bottom, 4. from bottom to top on the left side
    // set boundaries to ensure no overlap in spiral
    // increment each side of boundary after each complete spiral

// Your code here along with comments explaining your approach
class SpiralMatrixSolution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        List<Integer> output = new ArrayList<>();
        
        int right = cols - 1;
        int down = rows - 1;
        int left = 0;
        int up = 0;
        
        while (output.size() < rows * cols){
            for (int i = left; i <= right; i++){
                output.add(matrix[up][i]);
            }
            
            for (int i = up + 1; i <= down; i++){
                output.add(matrix[i][right]);
            }
            
            // different row
            if (down != up){
                for (int i = right - 1; i >= left; i--){
                    output.add(matrix[down][i]);
                }
            }
            
            // different col
            if (left != right){
                for (int i = down - 1; i >= up + 1; i--){
                    output.add(matrix[i][left]);
                }
            }
            
            // decrement all boundaries to ensure no overlap
            left++;
            right--;
            down--;
            up++;
        }
        
        return output;
        

    }
    
}