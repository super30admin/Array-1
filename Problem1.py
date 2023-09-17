# ## Problem 1

# Given an array nums of n integers where n > 1, return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

# Example:

# Input: [1,2,3,4]
# Output: [24,12,8,6]
# Note: Please solve it without division and in O(n).

class Solution:
    def productExceptSelf(self, nums):
        if not nums:
            return 0
        n = len(nums)
        rp, result = 1, [1]*n
        for i in range(1, n):
            rp *= nums[i-1]
            result[i] = rp
        rp = 1
        for i in range(n-2, -1, -1):
            rp *= nums[i+1]
            result[i] = rp*result[i]

        return result
    
