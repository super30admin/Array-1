# Time Complexity: O(2n), where n is the length of the input array
# Space Complexity: O(1), not counting the outpur array
# Approach:
# 1. We go over the input array twice.
# 2. One, to get the left product for each element, and then again, to multiply the right product with the obtained left product.
# 3. We keep track of the left product and right product with the variables prod and tmp
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)
        prod = 1
        tmp = 1
        res = [0] * n
        for i in range(n):
            prod = prod * tmp
            res[i] = prod
            tmp = nums[i]

        prod, tmp = 1, 1
        for i in range(n-1, -1, -1):
            prod = prod * tmp
            res[i] *= prod
            tmp = nums[i]
        return res
