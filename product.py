# Time Complexity : O(N), traversisng elements in array
# Space Complexity : O(1),
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no

class Solution(object):
    def productExceptSelf(self, nums):
        n = len(nums)
        rp = 1
        result = [1]*n
        result[0] = rp 
        
        for i in range(1,n):
            rp = rp * nums[i-1]
            result[i] = rp
        
        rp = 1
        
        for i in range(n-2, -1, -1):
            rp = rp * nums[i+1]
            result[i] = result[i] * rp
        
        
        return result