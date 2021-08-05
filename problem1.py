"""
//Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :YES
// Any problem you faced while coding this : NO
"""


class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        if len(nums) == 0:
            return []
        result = [0]*len(nums)
        rp = 1
        result [0]  = 1
        for i in range(1,len(nums)):
            rp = rp * nums [i - 1]
            result[i] = rp
        rp = 1
        for i in range(len(nums)-2,-1,-1):
            rp = rp * nums[i+1]
            result[i]=result[i]*rp
        return result