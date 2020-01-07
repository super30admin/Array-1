// Time Complexity : O(m*n) where m and n are dimension of the matrix as we traverse each element once
// Space Complexity : O(1) as no auxillary DS used
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english : Traverse in 2 directions, either up or down. If going
// up(dir==1) r--, c++ and coming down is r++, c--. We handle the edge cases when c==n-1 and r==0. We take the
// c==n-1 edge case first as we cannot increase c at that point as it will lead to a null pointer exception.

// Your code here along with comments explaining your approach
import java.util.*;
class diagonalMatrix {
    public static int[] findDiagonalOrder(int[][] matrix) {
        int m = matrix.length;
        if (m == 0) return new int[]{};
        int n = matrix[0].length;
        int dir = 1;
        int[] ans = new int[m*n];
        int i = 0, row = 0, col = 0;
        while (i < m*n) {
            ans[i] = matrix[row][col];
            if (dir == 1) {
                if (col == n-1) {
                    row++;
                    dir = -1;
                }
                else if (row == 0) {
                    col++;
                    dir = -1;
                } 
                else {
                    row--;
                    col++;
                }
            }
            else {
                if (row == m-1) {
                    col++;
                    dir = 1;
                }
                else if (col == 0) {
                    row++;
                    dir = 1;
                }
                else {
                    row++;
                    col--;
                }
            }
            i++;
        }
        return ans;
    }
    public static void main(String[] args) {
    	int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    	int[] ans = findDiagonalOrder(matrix);
    	for (int i : ans) {
    		System.out.print(i + " ");
    	}
    }
}