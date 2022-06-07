""""// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :
"""
class Solution:
    def productExceptSelf(self, nums):
        n = len(nums)
        result = [1] * n
        rp = 1

        for i in range(1, len(nums)):
            rp *= nums[i - 1]
            result[i] = rp
        rp = 1
        for i in range(n - 2, -1, -1):
            rp *= nums[i + 1]
            result[i] = rp * result[i]
        return result



