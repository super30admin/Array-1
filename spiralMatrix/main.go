package main

import "fmt"

func main() {
	fmt.Println(spiralOrder([][]int{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}}))
}

// time: o(mn)
// space: o(1) -- since output array does not count as extra space
func spiralOrder(matrix [][]int) []int {
	if matrix == nil || len(matrix) == 0 {
		return nil
	}
	out := []int{}

	m := len(matrix)
	n := len(matrix[0])

	left := 0
	right := n - 1
	top := 0
	bottom := m - 1

	for left <= right && top <= bottom {

		// top row ( left - right)
		for i := left; i <= right; i++ {
			out = append(out, matrix[top][i])
		}
		top++

		if left <= right && top <= bottom {
			for i := top; i <= bottom; i++ {
				out = append(out, matrix[i][right])
			}
		}
		right--

		if left <= right && top <= bottom {
			for i := right; i >= left; i-- {
				out = append(out, matrix[bottom][i])
			}
		}
		bottom--

		if left <= right && top <= bottom {
			for i := bottom; i >= top; i-- {
				out = append(out, matrix[i][left])
			}
		}
		left++

	}
	return out
}
