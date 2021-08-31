// TIME: O(mn)
// SPACE: O(1)
// SUCCESS on LeetCode

public class DiagonalMatrix {
    public int[] findDiagonalOrder(int[][] mat) {
        int[] answers = new int[mat.length*mat[0].length];
        
        int row = 0;
        int col = 0;
    
        boolean odd = true;
        
        int count = 0;
        
        while (count < mat.length*mat[0].length) {
            if (row > -1 && col > -1 && row < mat.length && col < mat[0].length) {
                answers[count++] = mat[row][col];
            }
            
            if (row < 0) {
                row = 0;
                odd = false;
            } else if (col < 0) {
                col = 0;
                odd = true;
            } else {
                if (odd) {
                    row = row - 1;
                    col = col + 1;
                } else {
                    row = row + 1;
                    col = col - 1;
                }
            }
        }
        
        return answers;
    }
}
