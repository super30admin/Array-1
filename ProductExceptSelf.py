# -*- coding: utf-8 -*-
"""
Created on Thu Feb  6 12:47:48 2020

@author: WELCOME
"""
"""
Product of array except self
Time - O(N) where N is number of elements in array
Space - O(1)
"""
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        if not nums:
            return 0
        result=[1]*(len(nums))
        product=1
        for i in range(len(nums)-1):
            product*=nums[i]
            result[i+1]*=product
        product=1
        for j in range(len(nums)-1,0,-1):
            product*=nums[j]
            result[j-1]*=product
        return result