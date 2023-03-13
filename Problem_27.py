# TC: O(n)
# SC: O(1)

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        left = [1] * len(nums)

        for i in range(1, len(nums)):
            left[i] = left[i-1] * nums[i-1]

        prev = 1
        for i in range(len(nums)-1, -1, -1):
            left[i] = prev * left[i]
            prev *= nums[i]

        return left





        