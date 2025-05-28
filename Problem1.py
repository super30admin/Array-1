"""
Implemented using the technique discussed in the session, using only one output array for computation. In the first pass, I calculated the products from left to right, and in the second pass, from right to left, updating the result array.
Time Complexity: O(n)
Space Complexity: O(1)
"""
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        size = len(nums)
        result = [1] * size

        # from left to right
        left_product = 1
        for i in range(size):
            result[i] = left_product
            left_product *= nums[i]

        # from right to left
        right_product = 1
        for i in range(size - 1, -1, -1):
            result[i] *= right_product
            right_product *= nums[i]

        return result