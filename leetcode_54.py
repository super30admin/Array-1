#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Sun Feb 22 13:44:12 2026

@author: rishigoswamy

    LeetCode 54: Spiral Matrix
    Link: https://leetcode.com/problems/spiral-matrix/

    Approach:
    Use four boundaries:
        top, bottom, left, right

    Traverse in layers:
        1. Left → Right  (top row)
        2. Top → Bottom  (right column)
        3. Right → Left  (bottom row)
        4. Bottom → Top  (left column)

    After each traversal, shrink the corresponding boundary.

    Continue until boundaries cross.

    // Time Complexity : O(m * n)
        Every element is visited exactly once.
    // Space Complexity : O(1)
        Ignoring output array.

"""

from typing import List
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        top = 0
        bottom = len(matrix) - 1
        left = 0
        right = len(matrix[0]) - 1
        res = []

        while True:

            if not left <= right:
                break

            for i in range(left, right+1):
                res.append(matrix[top][i])
            top +=1

            if not top <= bottom:
                break
            
            for i in range(top, bottom+1):
                res.append(matrix[i][right])
            right-=1

            if not left <= right:
                break
            
            for i in range(right, left-1 , -1):
                res.append(matrix[bottom][i])
            bottom-=1

            if not top <= bottom:
                break
            
            for i in range(bottom, top-1, -1):
                res.append(matrix[i][left])
            left+=1
        
        return res


        

