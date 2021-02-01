# Time complexity: O(n*m)
# Space complexity: O(1) since, output array is expected in the question
# Implementation:
'''
1) Top row
L -> R, T++
2) Right col
T -> B, R--
if T <= B and L <= R
    3) Bottom row
    R -> L, B--
    4) Left col
    B -> T, L++
'''
class Solution(object):
    def spiralOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        if matrix is None or len(matrix) == 0:
            return []
        
        output = []
        
        n = len(matrix)
        m = len(matrix[0])
        
        top = 0
        bottom = n - 1
        left = 0
        right = m - 1
        
        while top <= bottom and left <= right:
            #1
            for x in range(left, right + 1):
                output.append(matrix[top][x])
            top = top + 1
            #2
            for x in range(top, bottom + 1):
                output.append(matrix[x][right])
            right = right - 1
        
            if top <= bottom and left <= right:
                #3
                for x in range(right, left - 1, -1):
                    output.append(matrix[bottom][x])
                bottom = bottom - 1
                #4
                for x in range(bottom, top - 1, -1):
                    output.append(matrix[x][left])
                left = left + 1
        return output