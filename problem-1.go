/*
time complexity : O(n)
space complexity : O(n)
*/

func productExceptSelf(nums []int) []int {
	n := len(nums)
	result := make([]int, n)
	leftResult := make([]int, n)

	for i := 0; i < n; i++ {
		result[i] = 1
		if i == 0 {
			continue
		} else {
			result[i] = nums[i-1] * result[i-1]
		}
	}
	for j := n - 1; j >= 0; j-- {
		leftResult[j] = 1
		if j == len(nums)-1 {
			continue
		} else {
			leftResult[j] = nums[j+1] * leftResult[j+1]
		}
		result[j] = result[j] * leftResult[j]
	}

	return result
}
