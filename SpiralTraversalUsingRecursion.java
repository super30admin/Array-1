import java.util.ArrayList;
import java.util.List;
/**
 * Time complexity is O(m*n)
 * space complexity is O(m) - because of m recursive calls
 */
class Solution {
    int m;
    int n;
    int[][] matrix;
    public List<Integer> spiralOrder(int[][] matrix) {
        this.matrix = matrix;
        this.m = matrix.length;
        this.n = matrix[0].length;
        
        List<Integer> result = new ArrayList<>();
        traverse(0, 0, result);
        return result;        
    }
    private void traverse(int i, int j, List<Integer> result) {
        if(result.size() >= m*n) {
            return;
        }

        result.add(matrix[i][j]);

        for(int jj = j+1, ii= i; jj <= n-1-j; jj++) {
            result.add(matrix[ii][jj]);
        }

        for(int jj = n-1-j, ii= i+1; ii <= m-1-i; ii++) {
            result.add(matrix[ii][jj]);
        }

        for(int ii = m-1-i, jj = n-1-j-1; jj >= j && ii != i; jj--) {
            result.add(matrix[ii][jj]);
        }

        for(int ii = m-1-i-1, jj = j; ii > i && jj != n-1-j; ii--) {
            result.add(matrix[ii][jj]);
        }
        traverse(i+1, j+1, result);
    }
}