// TIME: O(mn)
// SPACE: O(1)
// SUCCESS on LeetCode

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> answer = new ArrayList<>();
        
        int rowStart = 0;
        int rowEnd = matrix.length - 1;
        int colStart = 0;
        int colEnd = matrix[0].length - 1;
    
        
        while (answer.size() < matrix.length * matrix[0].length) {
            
            for (int i = colStart; i <= colEnd; i++) {
                answer.add(matrix[rowStart][i]);
            }
            
            for (int i = rowStart + 1; i <= rowEnd; i++) {
                answer.add(matrix[i][colEnd]);
            }
            
            if (rowStart != rowEnd) {
                for (int i = colEnd - 1; i >= rowStart; i--) {
                    answer.add(matrix[rowEnd][i]);
                }
            }
            
            if (colStart != colEnd) {
                for (int i = rowEnd - 1; i > rowStart; i--) {
                    answer.add(matrix[i][colStart]);
                }
            }
            rowStart++;
            colStart++;
            rowEnd--;
            colEnd--;
        }
        
        return answer;
    }
}
