package main

// https://leetcode.com/problems/spiral-matrix/

/*

Initial thought Process:

looking at the given diangram :
- traverse right on the row until you hit the max on columns
- traverse on rows until you hit the last row
- traverse left until you reach 1st columns
- traverse up until you reach from where you had started

*/

// Time : O(mXn) : where m and n are rows and columns of the given matrix
// Space is O(1)

func spiralOrder(matrix [][]int) []int {
	top := 0
	bottom := len(matrix) - 1
	right := len(matrix[0]) - 1
	left := 0
	result := []int{}
	for top <= bottom && left <= right {

		// top
		for i := left; i <= right; i++ {
			result = append(result, matrix[top][i])
		}
		top = top + 1

		// right
		for i := top; i <= bottom; i++ {
			result = append(result, matrix[i][right])
		}
		right = right - 1

		// bottom
		if top <= bottom { // when we are running for base case there are scenarios where the loop is still valid and hence the base condition for while loop needs to be checked again.

			for i := right; i >= left; i-- {
				result = append(result, matrix[bottom][i])
			}
			bottom = bottom - 1
		}

		// left
		if top <= bottom {
			for i := bottom; i >= top; i-- {
				result = append(result, matrix[i][left])
			}
			left = left + 1
		}

	}
	return result
}
