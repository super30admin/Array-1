// Time Complexity : O(mn)
// Space Complexity : O(1)
// nitialize variables to keep track of the current row and column indices. Iterate through each element in the matrix, updating the indices according to the diagonal traversal pattern.
// If the sum of the row and column indices is even, move up-right if possible, otherwise move down-left.
// Use these indices to access the matrix elements in diagonal order and store them in the result array.

public class DiagonalOrderTraversal {
    public int[] findDiagonalOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return new int[0];
        }
        
        int m = matrix.length;
        int n = matrix[0].length;
        int[] result = new int[m * n];
        int row = 0, col = 0;
        
        for (int i = 0; i < result.length; i++) {
            result[i] = matrix[row][col];
            
            if ((row + col) % 2 == 0) {
                if (col == n - 1) {
                    row++;
                } else if (row == 0) {
                    col++;
                } else {
                    row--;
                    col++;
                }
            } else {
                if (row == m - 1) {
                    col++;
                } else if (col == 0) {
                    row++;
                } else {
                    row++;
                    col--;
                }
            }
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        DiagonalOrderTraversal solution = new DiagonalOrderTraversal();
        int[] result = solution.findDiagonalOrder(matrix);
        
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
