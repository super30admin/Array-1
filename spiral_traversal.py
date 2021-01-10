# -*- coding: utf-8 -*-
"""TC : O(m+n) m = columns of matrix, n = rows of matrix
SC :O(1)
"""

class Solution:
    def spiralOrder(self, matrix:[[]]):
        #Edge case check
        if not matrix or len(matrix) == 0:
            return []
        
        #we use 4 direction pointers:top,bottom,left and right
        t=0
        b=len(matrix)
        l=0
        r=len(matrix[0])
        
        out = []
        #traverse the matrix left to right,top to bottom,right to left and bottom to top
        #append all elements in every row and column into the output array
        while t < b and l < r:
            #traverse top row
            
            if t < b and l < r:
                for i in range(l,r):
                    out.append(matrix[t][i])
            t += 1           
            #traverse top to bottom
            
            if t < b and l < r:
                for j in range(t,b):
                    out.append(matrix[j][r - 1])
            r -= 1              
            #traverse right to left
            if t < b and l < r:
                for i in range(r-1,l-1,-1):
                    out.append(matrix[b - 1][i])
            b -= 1  
            if t < b and l < r:
                for j in range(b-1,t-1,-1):
                    out.append(matrix[j][l])
            l += 1  
            
        return out

S = Solution()
matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]] 
print(S.spiralOrder(matrix))  
        