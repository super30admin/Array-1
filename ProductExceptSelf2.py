#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Mon Dec  2 09:14:30 2019

@author: tanvirkaur
"""

#Time complexity = O(n)
#Space complexity = O(n)
# Using two array
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        if not nums:
            return None
        right = [0]*len(nums)
        left = [0]*len(nums)
        runningP = 1
        temp = 1
        # forward pass
        for i in range(len(nums)):
            runningP *= temp
            left[i] = runningP
            temp = nums[i]
        # backward pass
        runningP = 1
        temp = 1
        for i in range(len(nums)-1,-1,-1):
            runningP *= temp
            right[i] = runningP
            temp = nums[i]
        return [left[i]*right[i] for i in range(len(nums))]
            