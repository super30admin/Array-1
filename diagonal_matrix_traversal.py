# -*- coding: utf-8 -*-
"""
TC : O(m+n) m = columns of matrix, n = rows of matrix
SC :O(1)
"""

class Solution:
    def findDiagonalOrder(self, matrix:[[]]):
        #edge case check
        if not matrix: return []        
        
        # we traverse though the matrix using dir variable having 2 values -1(down) and +1(up)
        # we create an putput list of length = row * column of matrix
        # we check for indices i,j of pur matrix not hitting any boundaries, we change direction in either case
        m = len(matrix)
        n = len(matrix[0])
        output = []
        o_len = m*n
        idx = 0
        i = 0
        j = 0
        dir = 1 
        
              
        while idx < o_len:#run through the input matrix till length of output array is reached
            output.append(matrix[i][j])
            if dir == 1: #upward dir
                if j == n-1:
                    i += 1
                    dir = -1
                elif i == 0:
                    j += 1
                    dir = -1
                else: #not hitting any matrix boundaries
                    i -= 1
                    j += 1
            else:#downward dir
                if i == m-1: #case 1: hitting matrix last column boundary
                    j += 1
                    dir = 1
                elif j == 0: #case 2: hitting matrix first columns boundary
                    i += 1
                    dir = 1
                else: #not hitting any matrix boundaries
                    i += 1 
                    j -= 1
                    
            idx += 1 #after direction change increment index
        return output

S = Solution()
matrix = [[1,2,3],[4,5,6],[7,8,9]]
print(S.findDiagonalOrder(matrix))                 
            