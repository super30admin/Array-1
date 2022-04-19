# // Time Complexity : O(n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : yes
class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """

        #  left product
        if len(nums) == 0:
            return []
        rp = 1
        result = [1] * len(nums)
        result[0] = 1

        for index in range(1, len(nums)):
            rp = rp * nums[index-1]
            result[index] = rp

        #  right product
        rp = 1
        for index in range(len(nums)-2, -1, -1):
            rp = rp * nums[index+1]
            result[index] = rp * result[index]

        return result
