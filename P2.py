# -*- coding: utf-8 -*-
"""
Created on Mon Apr  5 16:02:23 2021

@author: jgdch
"""

#Space Complexity: O(1)
#Time Complexity: O(MN), where M is the number of columns , N is the number of rows
class Solution:
    def findDiagonalOrder(self, matrix: List[List[int]]) -> List[int]:
        result=[]
        if not matrix:
            return []
        n=len(matrix)
        m=len(matrix[0])
        row,col=0,0
        direc=1
        

        while row<n and col<m:
            
             result.append(matrix[row][col])
             if direc==1:
                mrow=row-1
             else:
                mrow=row+1
             if direc==1:
                mcol=col+1
             else:
                mcol=col-1
             if mrow < 0 or mrow == n or mcol < 0 or mcol == m:
                
              
                if direc:
                    
                   if col==m-1:
                       row+=1
                   else:
                     row=row
                   if col<m-1:
                       col+=1
                   else:
                     col=col
                    
                    
                else:
                    if row==n-1:
                       col+=1
                    else:
                      col=col
                    if row<n-1:
                       row+=1
                    else:
                     row=row
                    
                
                direc= 1 - direc
             else:
                row=mrow
                col=mcol
        return result