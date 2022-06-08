#238. Product of Array Except Self
"""
Time Complexity = O(n)
Space Complexity = O(n)
Did this code successfully run on Leetcode : YES

Basicaly we have to fing product of selected element's LHS product and RHS product.

An array is created to store running product from right to left. Right to left because when we
parse nornally from left to right later on, we already have product of RHS of element.
For product of LHS, we keep track of a running product. We can also use another array but that will just use extra space.

"""

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        rpa = [None] * len(nums)

        # running product array (right to left)
        rp = 1
        for i in reversed(range(0, len(nums))):
            rp = rp * nums[i]
            rpa[i] = rp

        # print(rpa)

        result = list()
        rp = 1
        for i in range(0, len(nums)):
            # if it is last element, the RPA will not have anymore element, also answer here will be
            # our current running product
            if i == len(nums) - 1:
                result.append(rp)

            else:
                # rp(LHS product) * RHS product from RPS
                result.append(rpa[i + 1] * rp)
                rp = rp * nums[i]

        return result