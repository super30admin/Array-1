# Create left and right side product arrays. This can be optimized by eliminating the right array and using only the result array.
class Solution:
    def productExceptSelf(self, nums):
        # Time Complexity - O(n) + O(n) = O(n)
        # Space Complexity - O(1) - Because we return the result array
        if nums is None or len(nums) == 0:
            return []
        n = len(nums)

        result = [0] * n
        rp = 1
        result[0] = rp

        # Left to Right - We fill the left product of each element
        for i in range(1, n):
            rp = rp * nums[i - 1]
            result[i] = rp

        rp = 1
        # Right to Left
        for i in range(n - 2, -1, -1):
            rp = rp * nums[i + 1]
            result[i] = result[i] * rp

        return result