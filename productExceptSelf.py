# Approach: We use a prefix and postfix product approach, calculating the product of all elements except the current one without division, by maintaining two passes (left to right and right to left)
# Time Complexity: O(n) (each element is processed twice)
# Space Complexity: O(1) (excluding output array)

from typing import List


class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        # Initialize the result array with 1s (same length as nums)
        res = [1] * len(nums)

        # Compute prefix products and store in res
        prefix = 1  # Running product from the left
        for i in range(len(nums)):
            res[i] = prefix  # Store prefix product before multiplying
            prefix *= nums[i]  # Update prefix product

        # Compute postfix products and multiply with prefix results
        postfix = 1  # Running product from the right
        for i in range(len(nums) - 1, -1, -1):  # Iterate backwards
            res[i] *= postfix  # Multiply stored prefix result with postfix
            postfix *= nums[i]  # Update postfix product

        return res  # Return the final product array


sol = Solution()
arr1 = [1, 2, 2, 1]

print(sol.productExceptSelf(arr1))
