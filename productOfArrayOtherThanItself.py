# // Time Complexity : O(N)
# // Space Complexity : O(1) since its a auxilary array
# // Did this code successfully run on Leetcode : Yes

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        result = [1] * len(nums)

        for i in range(1, len(nums)):
            result[i] = result[i - 1] * nums[i - 1]

        rp = 1
        for i in range(len(nums) - 1, -1, -1):
            result[i] *= rp
            rp *= nums[i]
        return result
