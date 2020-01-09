"""
Time Complexity : O(n)
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this: none
"""

class Solution:
    def productExceptSelf(self, nums):
        result = []
        len_n = len(nums)
        
        if nums == None or len_n == 0:
            return result
        
        rp = 1
        temp = 1
        
        for i in range(len_n):
            rp = rp*temp
            result.append(rp)
            temp = nums[i]
                
        rp = 1
        temp = 1
        
        for i in range(len_n-1,-1,-1):
            rp = rp*temp
            result[i] *= rp 
            temp = nums[i]
                
        return result

s = Solution()
print(s.productExceptSelf([1,2,3,4]))