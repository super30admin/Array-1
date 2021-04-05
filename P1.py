# -*- coding: utf-8 -*-
"""
Created on Mon Apr  5 16:01:54 2021

@author: jgdch
"""

#Space Coplexty: O(1), as the ouptput array doesn't add to space analysis
#Time complexity:O(N), where N is the length of the input array
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        
        
        result=[0]*len(nums)
        result[0]=1
        product=1
        
        for i in range(1,len(nums)):
            product*=nums[i-1]
            result[i]=product
        
        product=1
        for j in range(len(nums)-2,-1,-1):
            product*=nums[j+1]
            result[j]*=product
        return result
                
            
            