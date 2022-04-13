 #Time Complexity : O(N ) where N is number of elements
# Space Complexity : O(1) as same result list is being used for computation. No additional list used
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this :
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        
        if nums is None or len(nums) == 0:
            return []

        lhp = [None] * len(nums)
        lhp[0] = 1
        rp  = 1

        for i in range(1,len(nums)):
            rp = rp * nums[i-1]
            lhp[i] = rp


        rp = 1
        for j in range(len(nums)-2,-1,-1):
        #for j in reversed(range(len(nums)-1)):
            rp = rp * nums[j+1]
            lhp[j] =  lhp[j] * rp
        
        
        return lhp

