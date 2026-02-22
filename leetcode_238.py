#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Sun Feb 22 13:39:29 2026

@author: rishigoswamy

    LeetCode 238: Product of Array Except Self
    Link: https://leetcode.com/problems/product-of-array-except-self/

    Problem:
    Given an integer array nums, return an array answer such that
    answer[i] is equal to the product of all elements of nums except nums[i].
    You must solve it without using division and in O(n) time.

    Approach:
    Two-pass prefix and postfix multiplication.

    1️⃣ First pass (left → right):
       res[i] stores product of all elements to the LEFT of i.

    2️⃣ Second pass (right → left):
       Multiply res[i] by product of all elements to the RIGHT of i.

    This avoids division and handles zeros naturally.

    // Time Complexity : O(n)
        Two linear passes through the array.
    // Space Complexity : O(1)
        Output array does not count as extra space (as per problem statement).
        Only two variables (prefix, postfix) used.

"""

from typing import List

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        prefix = 1
        postfix = 1
        res = []

        for i in range (0, len(nums)):
            res.append(prefix)
            prefix = prefix * nums[i]

        for i in range (len(res)-1, -1, -1):
            res[i] = res[i]*postfix
            postfix = postfix* nums[i]

        return res

