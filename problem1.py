# problem 1 - product except self

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        final_arr = [0] * len(nums)
        rp = 1 
        temp = 1
        for i in range(len(nums)):
            rp = temp*rp
            final_arr[i] = rp 
            temp = nums[i]
        rp = 1 
        temp = 1 
        for i in range(len(nums)-1,-1,-1):
            rp = temp*rp
            final_arr[i] = rp * final_arr[i]
            temp = nums[i]
        return final_arr