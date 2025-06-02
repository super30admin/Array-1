"""
Time Complexity : O(n)
Space Complexity : O(n)
Did this code successfully run on Leetcode : YES
"""

from typing import List

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)
        res = [1] * n  # Initialize with 1s

        # Prefix product (left to right)
        rp = 1
        for i in range(n):
            res[i] = rp
            rp *= nums[i]
            print("prefix",res, rp)

        # Suffix product (right to left)
        rp = 1
        for i in range(n - 1, -1, -1):
            res[i] *= rp
            rp *= nums[i]
            print("postfix",res, rp)

        return res
