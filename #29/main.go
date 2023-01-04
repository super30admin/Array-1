package main

import "fmt"

// https://leetcode.com/problems/spiral-matrix/

//Time : O(mXn) - m and n are the rows and columns of the given matrix
// Space : O(1) - returning the same array that I am storing the values in
func findDiagonalOrder(mat [][]int) []int {
	// store the result
	result := []int{}
	r, c := 0, 0
	// to track the direction
	up := true
	m := len(mat) - 1
	n := len(mat[0]) - 1
	//result = append(result,mat[0][0])
	for (r <= m && c <= n) {

		if up {
			result = append(result, mat[r][c])
			// edge case
			// when is r == 0
			if r == 0 {
				if c < n {
					up = false
					c = c + 1
					continue
				}
			}
			if c == n {
				up = false
				r = r + 1
				continue
			}
			r = r - 1
			c = c + 1
		}
		if !up {
			result = append(result, mat[r][c])
			// when can I be on the edge when going down
			// c is 0 and r +1 == m
			if c == 0 {
				if r < m {
					up = true
					r = r + 1
					continue
				}
			}
			// r == m and c < n
			if r == m {
				up = true
				c = c + 1
				continue
			}
			r = r + 1
			c = c - 1
		}

	}
	return result
}

func main() {
	result := findDiagonalOrder([][]int{
		[]int{1, 2, 3},
		[]int{4, 5, 6},
		[]int{7, 8, 9},
	})
	fmt.Println(result)
}
