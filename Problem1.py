#   Time Complexity : O(n)
#  Space Complexity : O(1)
#  Did this code successfully run on Leetcode : Yes
#  Any problem you faced while coding this : No

class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        prodleft = [1]*len(nums)
        prodright = [1]*len(nums)
        ans = []
        for i in range(1,len(nums)):
            prodleft[i] = prodleft[i-1]* nums[i-1] 
            
            
        for i in range(len(nums)-2,-1,-1):
            prodright[i] = prodright[i+1]* nums[i+1] 
        
        for i in range(len(nums)):
            ans.append(prodleft[i]*prodright[i])
        return ans