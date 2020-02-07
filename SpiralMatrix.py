# -*- coding: utf-8 -*-
"""
Created on Wed Feb  5 22:10:46 2020

@author: WELCOME
"""
"""
Spiral Matrix
Time - O(n)
Space - O(1)
"""

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        if matrix==None or len(matrix)==0:
            return []
        left=0
        right=len(matrix[0])-1
        top=0
        bottom=len(matrix)-1
        result=[]
        while((top<=bottom) and (left<=right)):
            for i in range(left,right+1):
                result.append(matrix[top][i])
            top+=1
            for i in range(top,bottom+1):
                result.append(matrix[i][right])
            right-=1
            if top<=bottom:
                for i in range(right,left-1,-1):
                    result.append(matrix[bottom][i])
                bottom-=1
            if left<=right:
                for i in range(bottom,top-1,-1):
                    result.append(matrix[i][left])
                left+=1
        return result