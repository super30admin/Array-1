
/*  
 * Complexity of algorithm is O(m*n), where m is no of rows and n is number of column.
 *  
 * */

public class DiagonalTraverse {

	public int[] findDiagonalOrder(int[][] matrix) {

		if (matrix == null || matrix.length == 0)
			return new int[] {};

		int n = matrix.length, m = matrix[0].length;
		int[] result = new int[m * n];

		int index = 0;
		int i = 0, j = 0;
		int dir = 1;
		while (index < m * n) {

			result[index] = matrix[i][j];

			if (dir == 1) {

				if (j == m - 1) {
					i++;
					dir = -1;
				} else if (i == 0) {
					j++;
					dir = -1;
				} else {
					i--;
					j++;
				}

			} else {

				if (i == n - 1) {
					j++;
					dir = 1;
				} else if (j == 0) {
					i++;
					dir = 1;
				} else {
					j--;
					i++;
				}

			}

			index++;

		}

		return result;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		DiagonalTraverse objIn = new DiagonalTraverse();

		objIn.findDiagonalOrder(matrix);

	}

}
