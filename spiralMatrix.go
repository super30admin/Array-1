// Time Complexity : O(mn)
// Space Complexity : O(1) (returned array space is not considered)
// Did this code successfully run on Leetcode : Yes

/*

Approach:
In this problem, since we change direction in 4 ways, we keep a track of all
the boundaries using 4 variables - top, bottom, left, right.
We manipulate these variables in order to move in the directions we want (we
compute 4 directions per "spiral" loop, denoted by the 4 loops inside outer
loop).

*/

package main

func spiralOrder(matrix [][]int) []int {
	if len(matrix) == 0 {
		return []int{}
	}

	m := len(matrix)
	n := len(matrix[0])

	var res []int

	// use 4 pointers to move through the array
	t, b, l, r := 0, m-1, 0, n-1

	for t <= b && l <= r {
		// l -> r | top row
		for i := l; i <= r; i++ {
			res = append(res, matrix[t][i])
		}
		t++
		// t -> b | right column
		for i := t; i <= b; i++ {
			res = append(res, matrix[i][r])
		}
		r--
		// r -> l | bottom row
		if t <= b { // need this to check if all indices are in place
			for i := r; i >= l; i-- {
				res = append(res, matrix[b][i])
			}
			b--
		}
		// b -> t | left column
		if l <= r { // need this to check if all indices are in place
			for i := b; i >= t; i-- {
				res = append(res, matrix[i][l])
			}
			l++
		}
	}

	return res
}
