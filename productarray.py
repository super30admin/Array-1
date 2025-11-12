class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        space = [1] * len(nums)

        left = 1 
        for i in range(len(nums)):
            space[i] = left
            left *= nums[i]

        right = 1
        for j in range(len(nums)-1,-1,-1):
            space[j] *= right
            right *= nums[j]
        return space 