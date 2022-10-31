// Time Complexity : O(m*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// Taking top wall and bottom wall with a flag to indicate the moving direction.

// Your code here along with comments explaining your approach

class Solution {
	public int[] findDiagonalOrder(int[][] mat) {
		 if(mat == null || mat.length == 0)
			  return new int[] {};
		 int m = mat.length;
		 int n = mat[0].length;
		 
		 int[] res = new int[m * n];
		 
		 int flag = 1;//up
		 int row = 0, col = 0;
		 for(int i= 0; i < m * n; i++) {
			  res[i] = mat[row][col];
			  if(flag == 1) {
					if(col == n-1) {
						 row++;
						 flag = -1;
					} else if (row == 0) {
						 col++;
						 flag = -1;
					} else {
						 col++;
						 row--;
					}
			  } else {
					if(row == m-1) {
						 col++;
						 flag = 1;
					} else if (col == 0) {
						 flag = 1;
						 row++;
					} else {
						 col--;
						 row++;
					}
			  }
		 }
		 return res;
	}
}