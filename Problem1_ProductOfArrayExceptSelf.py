# Time Complexity : O(n) where n is the length of the array
# Space Complexity : O(1) excluding the output array
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Approach: First pass calculates left products (product of all elements to the left of each index).
# Second pass calculates right products and multiplies with left products to get final result.
# This avoids division and achieves O(n) time with O(1) extra space (excluding output array).

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)
        result = [1] * n
        
        # First pass: Calculate left products
        for i in range(1, n):
            result[i] = result[i - 1] * nums[i - 1]
        
        # Second pass: Calculate right products and multiply with left products
        right_product = 1
        for i in range(n - 1, -1, -1):
            result[i] *= right_product
            right_product *= nums[i]
        
        return result

