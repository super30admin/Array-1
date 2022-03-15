package main

import "fmt"

func main() {
	fmt.Println(productExceptSelf([]int{-1, 1, 0, -3, 3}))
}

// func productExceptSelf(nums []int) []int {
//     if nums == nil || len(nums) == 0 {
//         return nil
//     }

//     // time: o(n)
//     // space: o(n)
//     left := make([]int,len(nums))
//     left[0] = 1
//     for i := 1; i < len(nums); i++ {
//         runningProd := left[i-1]
//         runningProd *= nums[i-1]
//         left[i] = runningProd
//     }

//     // time: o(n)
//     // space: o(n)
//     right := make([]int,len(nums))
//     right[len(right)-1] = 1
//     for i := len(nums)-2; i >= 0; i-- {
//         runningProd := right[i+1]
//         runningProd *= nums[i+1]
//         right[i] = runningProd
//     }
//     // time: o(n)
//     // space: o(1) -- result arrat does not count as part of space
//     out := []int{}
//     for i := 0; i < len(nums); i++ {
//         out = append(out, left[i]*right[i])
//     }
//     return out

//     // total time: 2O(N) -- o(n)
//     // total space: 2O(N) - o(n)
// }

// time: o(n)
// space: o(1) since output array does not count as extra space
func productExceptSelf(nums []int) []int {
	if nums == nil || len(nums) == 0 {
		return nil
	}

	out := make([]int, len(nums))
	out[0] = 1
	// left
	for i := 1; i < len(nums); i++ {
		runningProd := out[i-1]
		runningProd *= nums[i-1]
		out[i] = runningProd
	}

	// right
	rrp := 1
	for i := len(nums) - 2; i >= 0; i-- {
		rrp *= nums[i+1]
		out[i] *= rrp
	}
	return out
}
