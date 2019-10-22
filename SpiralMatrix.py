#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Fri Oct 18 09:05:35 2019

@author: tanvirkaur
"""

# Time complexity = O(nXm)
# Space complexity = O(nXm)
# LeetCode Acceptance = Yes
class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        if matrix == []:
            return matrix

        l = 0
        r = len(matrix[0]) - 1
        t = 0
        b = len(matrix) - 1

        ret = []
        while l < r and t < b:
        	# top
        	for i in range(l, r):
        		ret.append(matrix[t][i])
        	# right
        	for i in range(t, b):
        		ret.append(matrix[i][r])
        	# bottom
        	for i in range(r, l, -1):
        		ret.append(matrix[b][i])
        	# left
        	for i in range(b, t, -1):
        		ret.append(matrix[i][l])

	        l += 1
	        r -= 1 
	        t += 1
	        b -= 1

	    # single square
        if l == r and t == b:
        	ret.append(matrix[t][l])
        # vertical line
       	elif l == r:
       		for i in range(t, b + 1):
       			ret.append(matrix[i][l])
       	# horizontal line
       	elif t == b:
       		for i in range(l, r + 1):
       			ret.append(matrix[t][i])
       	return ret