#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Sun Feb 22 13:42:01 2026

@author: rishigoswamy

    LeetCode 498: Diagonal Traverse
    Link: https://leetcode.com/problems/diagonal-traverse/

    Approach:
    Simulate movement using direction flag.

    direction = True  -> moving up-right
    direction = False -> moving down-left

    At every step:
        1. Append current element
        2. Move depending on direction
        3. Handle boundary transitions carefully

    // Time Complexity : O(m * n)
        Each element is visited exactly once.
    // Space Complexity : O(1)
        Ignoring output array.

"""
from typing import List

class Solution:
    def findDiagonalOrder(self, mat: List[List[int]]) -> List[int]:
        row = 0
        column = 0

        direction = True
        res = []

        while row < len(mat) and column < len(mat[0]):
            
            if direction:
                if row == 0 and column != len(mat[0])-1:
                    column+=1
                    direction = not direction
                elif column == len(mat[0])-1:
                    row += 1
                    direction = not direction
                else:
                    res.append(mat[row][column])
                    row-=1
                    column+=1
            else:
                if column == 0 and row != len(mat)-1:
                    row += 1
                    direction = not direction
                elif row == len(mat) - 1:
                    column+=1
                    direction = not direction
                else:
                    res.append(mat[row][column])
                    row+=1
                    column-=1
        return res
            


