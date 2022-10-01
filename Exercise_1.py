# Time Complexity: O(n)
# Space Complexity: O(1)
# Did this code successfully run on Leetcode: Yes
# Any problem you faced while coding this : No


class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        res = [0] * len(nums)
        rp = 1
        res[0] = 1
        
        for i in range(1, len(nums)):
            rp = rp*nums[i-1]
            res[i] = rp
            
        rp = 1
        
        for i in range(len(nums)-2, -1, -1):
            rp = rp * nums[i+1]
            res[i] = res[i] * rp
            
        return res          