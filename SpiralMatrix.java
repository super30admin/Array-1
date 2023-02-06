// Time Complexity : O(M*N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english

import java.util.ArrayList;
import java.util.List;

/**
 * Take start row, end row, start col and end col. Start from
 * top row and iterate till end of the col, then start from row+1 to 
 * end of the row, then start from end col -1 till start col. make sure
 * same row is repeated again by comparing start and end row values. then
 * iterate from end row to start row and make sure end col != start col.
 * Return the list of values.
 *
 */
public class SpiralMatrix {
	public List<Integer> spiralOrder(int[][] a) {
		ArrayList<Integer> list = new ArrayList<>();
		int startRow = 0, startCol = 0;
		int endRow = a.length - 1, endCol = a[0].length - 1;
		while (startRow <= endRow && startCol <= endCol) {
			for (int col = startCol; col <= endCol; col++)
				list.add(a[startRow][col]);

			for (int row = startRow + 1; row <= endRow; row++)
				list.add(a[row][endCol]);

			for (int col = endCol - 1; col >= startCol; col--) {
				if (startRow == endRow)
					break;
				list.add(a[endRow][col]);
			}

			for (int row = endRow - 1; row > startRow; row--) {
				if (startCol == endCol)
					break;
				list.add(a[row][startCol]);
			}
			startRow++;
			startCol++;
			endRow--;
			endCol--;
		}
		return list;
	}
}
