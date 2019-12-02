#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Mon Dec  2 15:23:28 2019

@author: tanvirkaur
"""

# Please check what i am doing wrong in this code
# in line no. 14 giving list index out of range
class Solution:
    def findDiagonalOrder(self, matrix: List[List[int]]) -> List[int]:
        if not matrix:
            return []
        nrows = len(matrix)
        ncolumns = len(matrix[0]) 
        res = [None]*(nrows*ncolumns-1)
        r = 0
        c = 0
        dirs = 1
        for i in range(nrows*ncolumns):
            res[i] = matrix[r][c]
            if dirs ==1:
                if r == 0:
                    c += 1
                    dirs = -1
                elif c == ncolumns-1:
                    r += 1
                    dirs = -1
                else:
                    r -= 1
                    c += 1
            else:
                if c == 0:
                    r += 1
                    dirs = 1
                elif r == nrows-1:
                    c += 1
                    dirs = 1
                else:
                    r += 1
                    c -= 1
        return res