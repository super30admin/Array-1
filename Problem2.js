

// Time Complexity : O(m*n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
/**
 * @param {number[][]} mat
 * @return {number[]}
 */
 var findDiagonalOrder = function(mat) {
	const m = mat.length;
	const n = mat[0].length;
	const result = [];

	for (let index = 0; index < m + n - 1; index++) {
		const top = Math.max(0, index - n + 1);
		const bottom = Math.min(index, m - 1);

		if (index % 2 === 0) {
			for (let pos = bottom; pos >= top; pos--) {
				result.push(mat[pos][index - pos]);
			}
		} else {
			for (let pos = top; pos <= bottom; pos++) {
				result.push(mat[pos][index - pos]);
			}
		}
	}
	return result;
};