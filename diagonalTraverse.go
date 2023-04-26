// Time Complexity : O(mn) m=rows and n=cols of matrix
// Space Complexity : O(1) (returned array space is not considered)
// Did this code successfully run on Leetcode : Yes

/*

Approach:
We play with the indices in order to get the resultant array. In this problem,
we have 2 directions we go in, either (bottom to top, left to right) or (top to
bottom, right to left). We keep a variable to track this direction, and keep 2
pointers to track the row and column indices. Then we introduce some checks to
consider boundary conditions.

*/

package main

func findDiagonalOrder(mat [][]int) []int {
	if len(mat) == 0 {
		return []int{}
	}

	m, n := len(mat), len(mat[0])
	dir := 1 // 1 for bottom to top, -1 for top to bottom
	res := make([]int, m*n)
	r, c := 0, 0

	for i := 0; i < m*n; i++ {
		res[i] = mat[r][c]

		// change R and C based on where we are in matrix
		// considering all constraints
		if dir == 1 { // while going bottom to top
			if c == n-1 {
				r++
				dir = -1
			} else if r == 0 {
				c++
				dir = -1
			} else {
				r--
				c++
			}
		} else if dir == -1 { // while going top to bottom
			if r == m-1 {
				c++
				dir = 1
			} else if c == 0 {
				r++
				dir = 1
			} else {
				r++
				c--
			}
		}
	}

	return res
}
