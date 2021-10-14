"""
https://leetcode.com/problems/product-of-array-except-self/submissions/

Time Complexity: O(n)
Space Complexity: O(1)
"""


class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        ans = []
        rProduct = 1

        for i in range(len(nums)):
            if i == 0:
                rProduct = 1
                ans.append(rProduct)
            else:
                rProduct *= nums[i - 1]
                ans.append(rProduct)

        for i in range(len(nums) - 1, -1, -1):
            if i == len(nums) - 1:
                rProduct = 1
                ans[i] = rProduct * ans[i]
            else:
                rProduct *= nums[i + 1]
                ans[i] = rProduct * ans[i]
        return ans
