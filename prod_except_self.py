"""
time - o(n)
space o(n)

we iterate forward and take the running product of all elements and store it in an array
we do the same backwards and multiply it with the existing forward running product values
"""

from typing import List


class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        result = [0] * len(nums)
        product = 1
        for i in range(len(nums)):
            result[i] = product
            product *= nums[i]
        product = 1
        for i in range(len(nums) - 1, -1, -1):
            if i == 0:
                result[i] = product
            else:
                result[i] = product * result[i]
                product *= nums[i]
        return result
