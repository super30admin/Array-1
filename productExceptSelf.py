#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Tue Aug 31 14:30:53 2021

@author: ameeshas11
"""
#Time Complexity : O(n)
#Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
#Any problem you faced while coding this : No


class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)
        sub_arr = [0]*n
        rp = 1
        sub_arr[0] = 1
        #store the running product for elements to the left
        for i in range(1, n):
            rp = rp*nums[i-1]
            sub_arr[i] = rp
        rp = 1
        #change the running product from element to the right
        for i in range(n-2, -1, -1):
            rp = rp * nums[i+1]
            sub_arr[i] = sub_arr[i] * rp
        return sub_arr