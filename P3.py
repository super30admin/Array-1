# -*- coding: utf-8 -*-
"""
Created on Mon Apr  5 16:02:29 2021

@author: jgdch
"""

#Space complexity: O(N), where N is the number of elements in seen
#Time Complexity: O(N), where N is the length of the input matrix
class Solution(object):
    def spiralOrder(self, matrix):
        if not matrix:
            return []
        m, n = len(matrix), len(matrix[0])
        seen = [[0] * n for i in matrix]
        out= []
        dr = [0, 1, 0, -1]
        dc = [1, 0, -1, 0]
        r = c = 0
        direc = 0
        for i in range(m * n):
            
            out.append(matrix[r][c])
            seen[r][c] = 1
            mr, mc = r + dr[direc], c + dc[direc]
            if 0 <= mr < m and 0 <= mc < n and not seen[mr][mc]:
                r, c = mr, mc
            else:
                direc = (direc + 1) % 4
                r, c = r + dr[direc], c + dc[direc]
        return out