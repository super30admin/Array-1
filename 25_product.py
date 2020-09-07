# S30 Big N Problem #25 {Medium}
# Leetcode #238

# Given an array nums of n integers where n > 1,  return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

# Time Complexity : O(n) n= no of elements in the array
# Space Complexity : O(n) 
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No 

# Approach:
# At any position, the result is the product of elements on the left and right respectively. 
# First calculate the left product. Calculate the right product and multiply it with the left product to ge the result.

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        
        
        
        dp=[1 for _ in range(len(nums))]
        
        product=1
        
        for i in range(len(nums)-1,-1,-1):
            
            dp[i]=product*dp[i]
            product=product*nums[i]
           
        product=1
        for i in range(0,len(nums),1):
            
            dp[i]=product*dp[i]
            product=product*nums[i]
        
        return dp
        