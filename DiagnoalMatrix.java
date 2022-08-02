// Time Complexity :0(mn)
// Space Complexity : 0(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this : no

/*
 * create a flag for the directions up and down
 * for top the general condition is row -- and column ++
 * handle the boundries
 * similary for downward direction with row++ and column-- also 
 * handle the boundries
 * */

class Solution {
	public int[] findDiagonalOrder(int[][] mat) {

		if (mat == null || mat.length == 0)
			return new int[] {};

		int m = mat.length;
		int n = mat[0].length;
		// initate m*n res arrat
		int[] res = new int[m * n];
		int r = 0;
		int c = 0;
		int dir = 1;
		int i = 0;

		while (i < res.length) {
			res[i] = mat[r][c];
			i++;
			// moving up
			if (dir == 1) {
				// boundry condition moving up and in the last column then increment the row and
				// change the directin
				if (c == n - 1) {
					r++;
					dir = -1;

				} else if (r == 0) { // boundry condition moving up and in the first row then increment the column
										// and change the directin
					c++;
					dir = -1;
				} else {
					// general case for moving up row is decresing and column is increaing
					r--;
					c++;
				}
			} else {
				// boundry condition moving down and in the last row then increment the column
				// and change the directin
				if (r == m - 1) {
					c++;
					dir = 1;
				} else if (c == 0) {
					// boundry condition moving down and in the first column then increment the row
					// and change the directin
					r++;
					dir = 1;
				} else {
					// general case for moving dow column is decresing and row is increaing
					c--;
					r++;
				}
			}

		}

		return res;
	}
}