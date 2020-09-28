# Time Complexity: O(n)
# Space Complexity: O(1)
# This code was passsed on LC: Yes
# Problems: No

class Solution:
    def productExceptSelf(self, nums):
        
        dp = [1]*len(nums)
        
        for i in range(1,len(nums)):
            dp[i] = dp[i-1]*nums[i-1]
        
        mul = 1
        for i in range(len(nums)-1,-1,-1):
            dp[i] *= mul
            mul *= nums[i]
        return dp