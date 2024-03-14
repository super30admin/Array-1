# TC = O(n)+O(n) = O(2n)
# SC = O(1)
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        result = [1] * len(nums)
        temp = 1

        for i in range(1, len(nums)):
            result[i] = result[i - 1] * nums[i - 1]
        for i in range(len(nums) - 2, -1, -1):
            temp *= nums[i + 1]
            result[i] = temp * result[i]
        return result
