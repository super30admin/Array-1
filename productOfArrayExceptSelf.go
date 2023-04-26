// Time Complexity : O(n)
// Space Complexity : O(1) (returned array space is not considered)
// Did this code successfully run on Leetcode : Yes

/*

Approach:
We first go from left to right and calculate the running product of the nums
array and store in the result array. Then in the same result array, we run from
right to left of the nums array and calculate the running product again and
multiply it with the existing product in the result array. The final answer
will be the product of all elements at each cell except the number at that cell.

*/

package main

func productExceptSelf(nums []int) []int {
	if len(nums) == 0 {
		return nums
	}

	n := len(nums)
	res := make([]int, n)
	rp := 1
	res[0] = rp

	// calculate running product except self
	// by going left to right
	for i := 1; i < n; i++ {
		rp *= nums[i-1]
		res[i] = rp
	}

	// reset running product and go from right to left
	rp = 1
	for i := n - 2; i >= 0; i-- {
		rp *= nums[i+1]
		res[i] *= rp
	}

	return res
}
