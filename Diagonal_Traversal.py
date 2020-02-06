# -*- coding: utf-8 -*-
"""
Created on Wed Feb  5 16:38:24 2020

@author: WELCOME
"""
"""
Diagonal Traversal
Time - O(m*n)
Space - O(1)
"""


class Solution:
    def findDiagonalOrder(self, matrix: List[List[int]]) -> List[int]:
        if matrix==None or len(matrix)==0:
            return []
        dir=1
        row=0
        column=0
        result=[]
        while row!=len(matrix)-1 or column!=len(matrix[0])-1:
            result.append(matrix[row][column])
            if dir==1:
                if column==len(matrix[0])-1:
                    row=row+1
                    dir=-1
                elif row==0:
                    column=column+1
                    dir=-1
                else:
                    row=row-1
                    column=column+1
            else:
                if row==len(matrix)-1:
                    column+=1
                    dir=1
                elif column==0:
                    row+=1
                    dir=1
                else:
                    row+=1
                    column-=1
        result.append(matrix[len(matrix)-1][len(matrix[0])-1])
        return result