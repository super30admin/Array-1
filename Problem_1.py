# Time Complexity: O(n)
# Space Complexity: O(n)
# Did this code successfully run on Leetcode: Yes
# Any problem you faced while coding this: No

class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        n = len(nums)
        pre = ([1] * n)
        suf = ([1] * n)
        for i in range(1, n):
            pre[i] = (pre[i - 1] * nums[i - 1])
        for i in reversed(range(n - 1)):
            suf[i] = (suf[i + 1] * nums[i + 1])
        return [pre[i] * suf[i] for i in range(n)]