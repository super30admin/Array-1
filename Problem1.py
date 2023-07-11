class Solution:
    # Time Complexity: O(N)
    # Space Complexity: O(1)
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)
        rp = 1
        result = []
        for i in range(n):
            result.append(rp)
            rp *= nums[i]

        rp = 1
        for i in range(n - 1, -1, -1):
            result[i] *= rp
            rp *= nums[i]

        return result
