#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Tue Aug 31 14:26:45 2021

@author: ameeshas11
"""

#Time Complexity : O(n)
#Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
#Any problem you faced while coding this : No


def findDiagonalOrder(mat):
        #set flag fro direction
        direction = 0
        row = 0
        col = 0
        output = []
        #count the numbers printed
        count = 0
        while count < len(mat)*(len(mat[0])):
            
            #if the direction change is in lower half of the matrix
            if (col == len(mat[0]) or row == len(mat)):
                if direction == 0:
                    row += 2
                    col -= 1 
                    direction = 1
                else:
                    col += 2
                    row -= 1
                    direction = 0
            #if direction change is in upper half of matrix       
            elif (col == -1 )  or (row == -1):
                if direction == 0:
                    row += 1
                    if col == len(mat[0]):
                        col -= 1
                        row += 1
                    direction = 1
                   
                else:
                    col += 1
                    if row == len(mat):
                        row -= 1
                        col += 1
                    direction = 0
        
            output.append(mat[row][col])  
            count += 1
            #print values in the particular direction
            if direction == 0:
                col += 1
                row -= 1
                
            else:
                col -= 1
                row += 1
            
        return output
        

if __name__ == '__main__':
    
    mat = [[1,2,3, 0],[4,5,6, 1],[7,8,9, 2]]
    print(findDiagonalOrder(mat))
        