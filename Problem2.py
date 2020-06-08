"""
// Time Complexity : o(m*n)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : Yes

// Three line explanation of solution in plain english

Keeping track of the edge indices, we iterate over the enitre matrix and print it diagonally

// Your code here along with comments explaining your approach

"""

class Solution(object):
    def findDiagonalOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        
        if not matrix:
            return []
        m = len(matrix) #rows
        n = len(matrix[0]) #columns
        
        res = [0] * (m*n)
        direc = 1
        r = 0
        c = 0
        i = 0 #result index
        while i < m*n:
            
            if direc == 1: #upwards direction
                res[i] = matrix[r][c]   
                
                if c == n-1: #if we are the last column
                    r = r+1 #we change the row and the direction
                    direc = -1

                elif r == 0: #if we are the first row, we want to move to the next column, and change the direction
                    c = c+1    
                    direc = -1
                else: #else move in the diagonal manner, upwards
                    r = r - 1
                    c = c + 1
                i= i+1  #increment index in result
            else: #similarly, for downward direction
                res[i] = matrix[r][c]
                if r == m-1:
                    direc = 1
                    c = c+1
                elif c == 0:
                    direc = 1
                    r = r+1    
                
                else:
                    r = r + 1
                    c = c - 1
                i= i+1
        return res