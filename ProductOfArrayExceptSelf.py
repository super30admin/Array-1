# Time Complexity : O(n)
# Space Complexity : O(1)

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        if not nums or len(nums) == 0:
            return []

        mul = 1 
        rlist = [1] * len(nums)
        rlist[0] = 1 

        for i in range(1,len(nums)):
            mul *= nums[i-1]
            rlist[i] = mul  

        mul = 1 
        for i in range(len(nums)-2, -1, -1):
            mul = mul * nums[i+1]
            rlist[i] = rlist[i] * mul

        return rlist