# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

from typing import List


class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)
        result = [1] * n
        
        for i in range(1, n):
            result[i] = result[i-1] * nums[i-1]
        r = 1
        for i in reversed(range(n)):
            result[i] = result[i] * r
            r *= nums[i]
        
        return result