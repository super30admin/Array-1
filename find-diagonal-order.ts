// Time complexity- O(m*n)
// Space complexity- O(1)
function findDiagonalOrder(mat: number[][]): number[] {
	let m = mat.length;
	let n = mat[0].length;

	let dir = true; // up
	let row = 0;
	let col = 0;
	let result = [];

	for (let i = 0; i < m * n; i++) {
		// push the current number to result matrix before moving to next number in traverse
		result.push(mat[row][col]);
		if (dir) {
			// if direction is up, handle top row and right column edge
			if (col === n - 1) {
				row++;
				dir = false;
			} else if (row === 0) {
				col++;
				dir = false;
			} else {
				row--;
				col++;
			}
		} else {
			// handle bottom row and first column edge
			if (row === m - 1) {
				col++;
				dir = true;
			} else if (col === 0) {
				row++;
				dir = true;
			} else {
				row++;
				col--;
			}
		}
	}
	return result;
}
