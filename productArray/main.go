
/*
    approach: running sum / prefix sum ( space optimizied )
    - use the output array for left and right running prods
    time = o(n)
    space = o(1)
*/

func productExceptSelf(nums []int) []int {
    out := make([]int, len(nums))
    out[0] = 1
    for i := 1; i < len(nums); i++ {
        leftRunning := out[i-1]
        prev := nums[i-1]
        out[i] = prev * leftRunning 
    }
    rp := 1
    for i := len(nums)-2; i >= 0; i-- {
        prev := nums[i+1]
        rp = rp * prev
        out[i] *= rp
    }
    
    
    return out
}


/*
    approach: running sum / prefix sum
    - we can get the leftProd upto ith idx but not including ith idx
    - we can get the rightProd upto ith idx but not including ith idx
    - then for each ith idx, we have its leftProd and rightProd
    - multiply it and save it as ans for ith element
    time = o(n)
    space = o(n) leftProd array and rightProd array
*/

// func productExceptSelf(nums []int) []int {
//     left := make([]int, len(nums))
//     left[0] = 1
//     for i := 1; i < len(nums); i++ {
//         leftRunning := left[i-1]
//         prev := nums[i-1]
//         left[i] = prev * leftRunning 
//     }
//     right := make([]int, len(nums))
//     right[len(right)-1] = 1
//     for i := len(nums)-2; i >= 0; i-- {
//         prev := nums[i+1]
//         rightRunning := right[i+1]
//         right[i] = prev * rightRunning
//     }
    
//     out := make([]int, len(nums))
//     for i := 0; i < len(nums); i++ {
//         out[i] = left[i] * right[i]
//     }
//     return out
// }

/*
    approach: brute force
    - using nested iterations, we can skip ith element and get the product of each element
    time = o(n^2)
    space = o(1)
*/
// func productExceptSelf(nums []int) []int {
//     out := make([]int, len(nums))
//     for i := 0; i < len(nums); i++ {
//         prod := 1
//         for j := 0; j < len(nums); j++ {
//             if i == j {continue}
//             prod *= nums[j]
//         }
//         out[i] = prod
//     }
//     return out
// }
