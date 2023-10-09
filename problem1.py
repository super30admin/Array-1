# TC: O(n)
# SC: O(1)
class Solution:
    def productExceptSelf(self, nums):
        list = [0]*len(nums)
        rp = 1
        list[0] = rp

        for i in range(1,len(nums)):
            rp *= nums[i-1]
            list[i] = rp

        rp = 1
        for i in range(len(nums)-2,-1,-1):
            rp *= nums[i+1]
            list[i] *= rp

        return list

