#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Tue Oct 22 10:26:21 2019

@author: tanvirkaur
"""

#time complexity = O(n)
#space complexity = O(n)
# Leetcode Acceptance = No
#error in line 17 : index out of range 
class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        res = []*len(nums)
        runningP = 1
        tmp = 1
        #forward pass
        for i in range(0,len(nums),+1):
            runningP *= tmp
            res[i] = runningP
            tmp = nums[i]
        #backward pass
        runningP = 1
        tmp = 1
        for i in range((len(nums)-1,-1,-1)):
            runningP *= tmp
            res[i] *= runningP
            tmp = nums[i]
        return res