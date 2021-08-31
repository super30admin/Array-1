#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Tue Aug 31 14:33:39 2021

@author: ameeshas11
"""
#Time Complexity : O(n)
#Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
#Any problem you faced while coding this : No

class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        
        #set direction and keys
        direction = 'R'
        left_key = top_key = 0
        right_key = len(matrix[0])-1
        bottom_key = len(matrix)-1
        #count = 0
        output = []
        
        #check if spiral is completed
        while (right_key>=left_key) and (bottom_key>=top_key):
            
            #for right direction update top_key
            if direction == 'R':
                for i in range(left_key, right_key+1):
                    output.append(matrix[top_key][i])
                top_key += 1
                direction = 'D'
            
            #for down direction update right_key
            elif direction == 'D':
                for i in range(top_key, bottom_key+1):
                    output.append(matrix[i][right_key])
                right_key -= 1
                direction = 'L'
            
            #for left direction update bottom_key
            elif direction == 'L':
                for i in range(right_key, left_key-1, -1):
                    output.append(matrix[bottom_key][i])
                bottom_key -= 1
                direction = 'U'
            
            #for up direction update left_key
            else:
                for i in range(bottom_key, top_key-1, -1):
                    output.append(matrix[i][left_key])
                left_key += 1
                direction = 'R'
                
        return output