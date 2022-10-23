# Time Complexity O(n)
# Space Complexity O(1)
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        ans = [1] * len(nums)

        prefixSum = 1
        for index, each in enumerate(nums):
            ans[index] = prefixSum
            prefixSum *= each
        sufixSum = 1
        for i in range(len(nums) - 1, -1, -1):
            ans[i] *= sufixSum
            sufixSum *= nums[i]

        return ans