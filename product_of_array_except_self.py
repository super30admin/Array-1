# TC: O(n)
# SC: O(1)

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        lp_arr = [1]*len(nums)
        lp = 1
        for i in range(len(nums)):
            lp_arr[i] = lp
            lp = nums[i]*lp
        rp = 1
        for i in range(len(nums)-1, -1, -1):
            temp = lp_arr[i]
            lp_arr[i] = rp*lp_arr[i]
            rp = rp*nums[i]
        
        return lp_arr
