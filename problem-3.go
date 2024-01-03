/*time complexity : O(m*n)
space complexity : O(m*n)*/

package main

func spiralOrder(matrix [][]int) []int {
	m := len(matrix)
	n := len(matrix[0])
	ans := make([]int, m*n)

	i := 0 // X axis
	j := 0 // Y axis
	k := 0 // Keep track of elements inserted in Ans
	direction := "Right"

	for k < m*n {
		ans[k] = matrix[i][j]
		switch direction {
		case "Right":
			if i+j == n-1 {
				direction = "Down"
				i++
			} else {
				j++
			}
		case "Down":
			if n-j == m-i {
				direction = "Left"
				j--
			} else {
				i++
			}
		case "Left":
			if i+j == m-1 {
				direction = "Up"
				i--
			} else {
				j--
			}
		case "Up":
			if i-j == 1 {
				direction = "Right"
				j++
			} else {
				i--
			}
		}
		k++
	}
	return ans
}
