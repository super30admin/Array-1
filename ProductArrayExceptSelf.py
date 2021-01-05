# Time Complexity : O(N)
# Space Complexity : O(N)
# Did this code successfully run on Leetcode : Yes
# Three line explanation of solution in plain english :
# Used two arrays that calculate the products from left side and right side.
# In the left_product array we will take product of all elements starting from the left of nums and right_product array starting from the last.
# Then multiply each element of left_product and right_product to get output in res array.

# Your code here along with comments explaining your approach


class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        if len(nums) == 0:
            return 0
        res = [0] * len(nums)
        left_product = [0] * len(nums)
        right_product = [0] * len(nums)
        left_product[0] = 1
        right_product[-1] = 1
        for i in range(1, len(nums)):
            left_product[i] = left_product[i - 1] * nums[i - 1]

        for j in range(len(nums) - 2, -1, -1):
            right_product[j] = right_product[j + 1] * nums[j + 1]

        print(left_product, right_product)

        for i in range(len(res)):
            res[i] = left_product[i] * right_product[i]
        return res
