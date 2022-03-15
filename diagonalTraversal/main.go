package main

// time: o(mn)
// space: o(1) if we do not count output array as part of space.
func findDiagonalOrder(mat [][]int) []int {
	if mat == nil || len(mat) == 0 {
		return nil
	}
	m := len(mat)
	n := len(mat[0])
	out := []int{}
	idx := 0
	i := 0
	j := 0
	up := true
	for idx < m*n {
		out = append(out, mat[i][j])
		idx++
		if up {
			if j == n-1 {
				up = false
				i++
			} else if i == 0 {
				up = false
				j++
			} else {
				i--
				j++
			}
		} else {
			if i == m-1 {
				up = true
				j++
			} else if j == 0 {
				up = true
				i++
			} else {
				i++
				j--
			}
		}
	}
	return out
}
