class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        rs = 1
        left = [None] * len(nums)
        left[0] = 1
        
        for i in range(1, len(nums)):
            rs=rs * nums[i-1]
            left[i]=rs
        rs=1
        for i in reversed(range(len(nums)-1)):
            rs = rs*nums[i+1]
            left[i] = rs * left[i]
        return left
        