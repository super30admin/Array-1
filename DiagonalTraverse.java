package array1;

public class DiagonalTraverse {
	//Time Complexity : O(m*n), where m is the number of rows and n is the number of columns
	//Space Complexity : O(m*n), where m is the number of rows and n is the number of columns
	//Did this code successfully run on Leetcode : Yes
	//Any problem you faced while coding this : Deciding if to go right or down depending upon 
	//even or odd indices
	public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        
        int[] res = new int[m * n];
        int index = 0;
        int row = 0, col = 0;
        
        while(index < res.length) {
            res[index++] = mat[row][col];
            int sum = row + col;
            if(sum % 2 == 0) {
                if(row > 0 && col < n - 1) {
                    row--;
                    col++;
                } else if(col < n - 1) {
                    col++;
                } else {
                    row++;
                }
            } else {
                if(col > 0 && row < m - 1) {
                    row++;
                    col--;
                } else if(row < m - 1) {
                    row++;
                } else {
                    col++;
                }
            }
        }
        
        return res;
    }
}
