"""
Time Complexity : O(m*n) as we travers through the whole matrix
Space Complexity : O(1) as we are returning the array
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No


Your code here along with comments explaining your approach
In this solution, we need to go in a spiral fashion. So, we maintain directions, and 4 pointers, ie, top, bottom,
left and right. By keeping a watch on the direction, we increment or decrement our pointers, in order
to move in a spiral fashion.
"""


class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        if not matrix:
            return matrix
        m = len(matrix)
        n = len(matrix[0])
        left = 0
        right = n-1
        top = 0
        bottom = m-1
        dirc = 1
        res = []
        while left <= right and top <= bottom:
            dirc %= 4
            if dirc == 1:
                for i in range(left, right+1):
                    res.append(matrix[top][i])
                top += 1
            elif dirc == 2:
                for i in range(top, bottom+1):
                    res.append(matrix[i][right])
                right -= 1
            elif dirc == 3:
                for i in range(right, left-1, -1):
                    res.append(matrix[bottom][i])
                bottom -= 1
            elif dirc == 0:
                for i in range(bottom, top-1, -1):
                    res.append(matrix[i][left])
                left += 1
            dirc += 1
        return(res)
