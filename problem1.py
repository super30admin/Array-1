#time complexity : O(n)
#space complexity: O(n)


class Solution:
    def productExceptSelf(self, nums: list[int]) -> list[int]:
        left = 1
        right = 1

        n = len(nums)
        if n == 0 or nums is None:
            return nums
        prod = [1]*n

        for i in range(0, n):
            prod[i] *= left
            left *= nums[i]
            prod[n - i - 1] *= right
            right *= nums[n - i - 1]
        return prod


sol = Solution()

nums1 = [1, 2, 3, 4]
result1 = sol.productExceptSelf(nums1)
print(f"Product Except Self for {nums1}: {result1}")