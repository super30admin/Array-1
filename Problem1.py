## Problem 1
# Given an array nums of n integers where n > 1, return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].
# Example:
# Input: [1,2,3,4]
# Output: [24,12,8,6]
# // Time Complexity : O(n) 
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode :Yes

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        if not nums:
            return 0
        rp = 1
        result = [None] * len(nums)
        for i in range(0,len(nums)):
            result[i] = rp
            rp = rp*nums[i]
        rp = 1
        for j in range(len(nums)-1,-1,-1):
            result[j] = result[j] * rp
            rp = rp*nums[j]
        return result
        
        