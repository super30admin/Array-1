//TC - O(m*n)
//SC - O(1)

import java.util.Arrays;

public class DiagonalTraverse {
	public static int[] findDiagonalOrder(int[][] mat) {
		int row = mat.length;
		int column = mat[0].length;
		int i = 0, j = 0;
		boolean direction = true; // up
		int[] arr = new int[row * column];
		for (int idx = 0; idx < row * column; idx++) {
			arr[idx] = mat[i][j];
			if (direction) {
				if (i == 0 && j != column - 1) { // top row
					j++;
					direction = false;
				} else if (j == column - 1) {
					i++;
					direction = false;
				} else {
					// up
					i--;
					j++;
				}
			} else {
				if (j == 0 && i != row - 1) {
					i++;
					direction = true;
				} else if (i == row - 1) { // at last row
					j++;
					direction = true;
				} else {
					i++;
					j--;
				}
			}
		}
		return arr;

	}

	public static void main(String[] args) {
		int[][] mat = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 } };
		int[] a = findDiagonalOrder(mat);
		System.out.println(Arrays.toString(a));
	}

}
