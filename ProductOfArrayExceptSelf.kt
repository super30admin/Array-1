// In this problem we need to find the product of all elements in the array except for the current index. We do this in two passes, first calculating the product of all elements to the left of each index and store it in the output array.
// In the second pass, we calculate the product of all elements to the right of each index and multiply it with the corresponding value in the output array. 
// Time complexity is O(n) where n is the number of elements in the array. Space complexity is O(1)

class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        
        val n = nums.size
        var rp = 1
        var output = IntArray(nums.size)
        output[0] = 1
        //first pass 1 to right 
        for (i in 1 .. n-1) {
            rp = rp * nums[i -1]
            output[i] = rp
        }

        rp = 1
        for(i in n-2 downTo 0) {
            rp = rp * nums[i+ 1]
            output[i] = output[i] * rp 
        }

        return output
    }
}