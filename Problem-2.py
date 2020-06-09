# Time Complexity :O(m*n)
# Space Complexity :O(1)
# Did this code successfully run on Leetcode : no
# Any problem you faced while coding this : no


# Your code here along with comments explaining your approach
class Solution(object):
    def findDiagonalOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        if not matrix or not matrix[0]:
            return []
        myDir = False
        r,c = 0,0
        m = len(matrix)
        n = len(matrix[0])
        result = []
        i =0
        while i < (m*n):
            result.append(matrix[r][c])
            #upper direction
            if not myDir:
                #check col first for edges
                if c == n-1:
                    #if reached last col inc row and change direction 
                    r+=1
                    myDir = True
                elif r == 0:
                    #if reached last row inc col and change direction 
                    c+=1
                    myDir = True
                else:
                    #else  dic row and inc col
                    r-=1
                    c+=1
            else:
                #down direction
                if r == m-1:
                #check row first for edges
                #if reached last row inc col and change direction 
                    c+=1
                    myDir = False
                elif c == 0:
                    #if reached last col inc row and change direction 
                    r+=1
                    myDir = False
                else:
                    #else  dic col and inc row
                    c-=1
                    r+=1
            i+=1
        return result