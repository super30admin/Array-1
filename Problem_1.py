from typing import List
""" Time complexity is O(n)
    Space complexity is O(1)
"""


class Solution:
    def productExceptSelf(nums: List[int]) -> List[int]:
        if len(nums) == 0:
            return 0
        answers = [1 for _ in range(0, len(nums))]
        r_product = 1
        answers[0] = r_product
        for i in range(1, len(nums)):
            r_product = r_product * nums[i - 1]
            answers[i] = r_product

        r_product = 1
        for j in range(len(nums) - 2, -1, -1):
            r_product = r_product * nums[j + 1]
            answers[j] = r_product * answers[j]

        return answers

    print(productExceptSelf([1,2,3,4]))
