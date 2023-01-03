package main

// approach : 4 pointers ( left col, right col, top row, bottom row) -- use them to shrink boundaries!
func spiralOrder(matrix [][]int) []int {
	m := len(matrix)
	n := len(matrix[0])
	left := 0
	top := 0
	right := n - 1
	bottom := m - 1
	out := []int{}
	for left <= right && top <= bottom {

		// top row
		// left-right
		for i := top; i <= right; i++ {
			out = append(out, matrix[top][i])
		}
		top++

		// right col
		// top to bottom
		if left <= right && top <= bottom {
			for i := top; i <= bottom; i++ {
				out = append(out, matrix[i][right])
			}
		}
		right--

		// bottom row
		// right to left
		if left <= right && top <= bottom {
			for i := right; i >= left; i-- {
				out = append(out, matrix[bottom][i])
			}
		}
		bottom--

		// left col
		// bottom to top
		if left <= right && top <= bottom {
			for i := bottom; i >= top; i-- {
				out = append(out, matrix[i][left])
			}
		}
		left++
	}
	return out
}
