# Time Complexity: O(n)
# Space Complexity: O(2n)
class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        left_prefix = [1 for i in range(len(nums))]
        right_prefix = [1 for i in range(len(nums))]
        for i in range(1, len(nums)):
            left_prefix[i] = left_prefix[i-1] * nums[i-1]
        for i in range(len(nums)-2, -1, -1):
            right_prefix[i] = right_prefix[i+1] * nums[i+1]
        for i in range(len(nums)):
            left_prefix[i] *= right_prefix[i]
        return left_prefix