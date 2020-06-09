# Time Complexity :O(m*n)
# Space Complexity :O(1)
# Did this code successfully run on Leetcode : no
# Any problem you faced while coding this : no


# Your code here along with comments explaining your approach
class Solution(object):
    def spiralOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        if not matrix:
            return []
        strtcol = 0
        strtrow = 0
        endcol = len(matrix[0])-1
        endrow = len(matrix)-1
        direction = 0
        sol = []
        while strtcol <= endcol and strtrow<= endrow:
            #four directions
            if direction == 0:
                #left to right
                i = strtcol
                while i <= endcol:
                    sol.append(matrix[strtrow][i])
                    i+=1
                direction = 1
                strtrow +=1
            elif direction == 1:
                #up to down
                i = strtrow
                while i <= endrow:
                    sol.append(matrix[i][endcol])
                    i+=1
                direction = 2
                endcol -=1
            elif direction == 2:
                #right to left
                i = endcol
                while i >= strtcol:
                    sol.append(matrix[endrow][i])
                    i-=1
                direction = 3
                endrow-=1
            else:
                #down to up
                i = endrow
                while i >= strtrow:
                    sol.append(matrix[i][strtcol])
                    i-=1
                direction = 0
                strtcol+=1
        return sol