/*time complexity : O(m*n)
space complexity : O(m*n)*/

func findDiagonalOrder(mat [][]int) []int {
	n := len(mat)
	m := len(mat[0])
	i := 0
	j := 0
	dir := true //up
	var result []int
	for x := 0; x < m*n; x++ {
		result = append(result, mat[i][j])
		if dir {
			if i == 0 && j != m-1 {
				j++
				dir = false
			} else if j == m-1 {
				i++
				dir = false
			} else {
				i--
				j++
			}
		} else {
			if j == 0 && i != n-1 {
				i++
				dir = true
			} else if i == n-1 {
				j++
				dir = true
			} else {
				j--
				i++
			}
		}

	}
	return result
}
