package Array1;
/**
 * 
 * We use if conditions to vary i and j so that we can achieve the pattern required.
 * 
 * Time Complexity :
 * O(m*n) where m is the rows and n is the cols of the input array
 * 
 * Space Complexity :
 * O(1) as we are not using any auxillary DS
 * 
 * Did this code successfully run on Leetcode : yes
 * 
 * Any problem you faced while coding this : No
 */
public class Problem2 {
	public int[] findDiagonalOrder(int[][] mat) {
		int cols = mat[0].length - 1;
		int rows = mat.length - 1;
		boolean direction = true; // up
		int[] output = new int[(cols + 1) * (rows + 1)];
		int i = 0;
		int j = 0;
		int k = 1;
		output[0] = mat[0][0];

		while (i <= rows && j <= cols) {

			if (direction) {

				if (i == 0 && j != cols) {
					j++;
					direction = false;
				} else if (j == cols) {
					i++;
					direction = false;
				} else {
					i--;
					j++;
				}
			} else {
				if (j == 0 && i != rows) {
					i++;
					direction = true;
				} else if (i == rows) {
					j++;
					direction = true;
				} else {
					i++;
					j--;
				}
			}

			if (i <= rows && j <= cols) {

				output[k++] = mat[i][j];
			}

		}

		return output;
	}

}
