// Time complexity- O(m*n)
// Space complexity- O(1)
function spiralOrder(matrix: number[][]): number[] {
	let result = [];
	let m = matrix.length;
	let n = matrix[0].length;
	let top = 0,
		bottom = m - 1,
		left = 0,
		right = n - 1;

	while (left <= right && top <= bottom) {
		// move towards right
		for (let i = left; i <= right; i++) {
			result.push(matrix[top][i]);
		}
		top++;

		// move towards down
		for (let i = top; i <= bottom; i++) {
			result.push(matrix[i][right]);
		}
		right--;

		// move towards left
		if (top <= bottom) {
			for (let i = right; i >= left; i--) {
				result.push(matrix[bottom][i]);
			}
		}
		bottom--;

		// move towards down
		if (left <= right) {
			for (let i = bottom; i >= top; i--) {
				result.push(matrix[i][left]);
			}
		}
		left++;
	}
	return result;
}
