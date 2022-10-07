##Time Complexity : O(n)
##Space Complexity :O(1)
##Did this code successfully run on Leetcode : Yes

class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        result = [1] * (len(nums))
        pref = 1
        for i in range(len(nums)):
            result[i] = pref
            pref *= nums[i]
        postf = 1
        for i in range(len(nums) - 1, -1, -1):
            result[i] *= postf
            postf *= nums[i]
        return result