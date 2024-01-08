""" Explanation: In this problem, we have to go two main direction, horizontal and vertical, and there are 4 kinds or borders: right, left, top, bottom
    We start at the first index of matrix[0] and traverse horizontally until we hit the right most element of that row, and then we change
    the direction to vertical downwards. Similarly, each time we hit a border, we change the direction until we reach the last element, and we keep decreasing the boundaries as we go
    Time Complexcity: O(n*m)
    Space Complexcity: O(1)
"""

class Solution(object):
    def spiralOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        res = []
        m, n = len(matrix), len(matrix[0])
        # initial borders
        top, right, bottom, left = 0, n-1, m-1, 0
        # direction
        horizontal, vertical = 1, 0
        # start
        i, j = 0, 0
        
        while len(res) < m*n:
            res.append(matrix[i][j])
            
            if (i,j) == (top,right) and horizontal == 1:
                horizontal, vertical = 0, 1
                top += 1
            elif (i,j) == (bottom,right) and vertical == 1:
                horizontal, vertical = -1, 0
                right -= 1
            elif (i,j) == (top,left) and vertical == -1:
                horizontal, vertical = 1, 0
                left += 1
            elif (i,j) == (bottom,left) and horizontal == -1:
                horizontal, vertical = 0, -1
                bottom -= 1
            
            i += vertical
            j += horizontal
               
        return res