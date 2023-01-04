package main

import "fmt"

// https://leetcode.com/problems/product-of-array-except-self/

/*

Thought Process :
- one way can be to have the product of all the elements in the array and then divide it by element at
index to get the desired value. but since divison operation is not allowed, this wont be acceptable
- second solution : where we can have a matrix each to store values on left of a given element and right of a given element

- ToDo : follow up, optimize for space when you visit this next time

*/

// Time : O(n) + O(n) + O(n) : 3xO(n) = O(N)
// Space : O(n) + O(n) :2xO(N)=O(N) (two aux arrays have been defined)

func productExceptSelf(nums []int) []int {
	// an array to store values
	productLeft := []int{1}
	productRight := make([]int, len(nums))
	// init running product
	rp := 1
	fmt.Println(productLeft)
	for i := 1; i < len(nums); i++ {
		rp = rp * nums[i-1]
		productLeft = append(productLeft, rp)
	}

	rp = 1
	productRight[len(productRight)-1] = 1

	// product of elements on right side of an element
	for j := len(nums) - 2; j >= 0; j-- {
		rp = rp * nums[j+1]
		productRight[j] = rp
	}

	// final result
	product := []int{}
	for i := 0; i < len(nums); i++ {
		product = append(product, productLeft[i]*productRight[i])
	}
	return product
}

func main() {
	fmt.Println(productExceptSelf([]int{1, 2, 3, 4}))
}
