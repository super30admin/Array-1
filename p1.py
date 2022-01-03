"""
## Problem 1

Given an array nums of n integers where n > 1, 
return an array output such that output[i] is equal 
to the product of all the elements of nums except nums[i].

Example:

Input: [1,2,3,4]
Output: [24,12,8,6]
Note: Please solve it without division and in O(n).

Follow up:
Could you solve it with constant space complexity? 
(The output array does not count as extra space for the purpose of space complexity analysis.)


// Time Complexity : ON
// Space Complexity :
// Did this code successfully run on Leetcode :
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
"""
class Solution:
    def productExceptSelf(self, nums):

        res = [1] * len(nums) #initialize array to [1] * len(nums)
        
        p = 1
        for i in range(len(nums)):
            res[i] *= p
            p *= nums[i]
            
        p = 1
        for i in range(len(nums)-1, -1, -1):
            res[i] *= p
            p *= nums[i]
            
        return res