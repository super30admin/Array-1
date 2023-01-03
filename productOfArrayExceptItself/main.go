package main

/*
   approach: brute force
   - for each ith element, get product excluding ith element
   time : o(n^2)
   space: o(1)

   approach: use / operator; 2 pass ( not allowed )
   - get full prod first
   - then for each ith element in output array
   - out[i] = total/nums[i]
       - remove itself ( exclude itself )

   time: o(2n)
   space: o(1)

   approach: extra space to compute left and right products
   - build left product for each ith element
   - build right product for each ith element
   - multiple each ith of left and right to get the answer for all elements

   to build the left/right product of an array - this means what would be the product of all numbers till ith element ( excluding i )
   - if nums array was: [1,2,3,4]
   - for 0th element we have no left product therefore imply 1 -- [1,0,0,0] ( initial left product )
       - than start from 1st idx and to get the product of 1st idx : 0thIdxFromNumsArray * 0thIdxFromLeftProductArray
       - more generic to get the left product of an ith element: leftProd[i] = nums[i-1] * leftProd[i-1]
   - for last element we have no right product therefore imply 1 -- [0,0,0,1] ( initial right product )
       - than start from 2nd last idx and to get the product of 2nd last idx : LastIdxFromNumsArray * LastIdxFromRightProductArray
       - more generic to get the right product of an ith element: rightProd[i] = nums[i+1] * rightProd[i+1]

   - finally create an output array and muultiple each ith position from left and right prod arrays

   time: o(n)
   space: o(n) -- o(2n) but 2 is constant - 2 arrays of n size


   approach: constant space, using nums array instead of allocating extra space
   - Get the left prod in output array first
   - Then using a rightRunningProd variable , compute the rightProd for ith element (nums[i+1] * rrp )
   - Then multiply the updated rrp with nums[i]
   - Just like we did in rightProd in extra space solution

   time: o(n)
   space: o(1)


*/

func productExceptSelf(nums []int) []int {
	n := len(nums)
	out := make([]int, n)
	out[0] = 1
	for i := 1; i < n; i++ {
		prev := nums[i-1]
		prevProd := out[i-1]
		out[i] = prev * prevProd
	}
	rp := 1
	for i := n - 2; i >= 0; i-- {
		prev := nums[i+1]
		rp *= prev
		out[i] *= rp
	}
	return out
}
