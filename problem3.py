"""
We use the boundaries method and follow the path that we would usually do while traversing on a notebook, and then update the pointers
TC is o(m*n) and SC is o(1) since its directly stored in resultant space
"""


class Solution(object):
    def spiralOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        m = len(matrix)
        n = len(matrix[0])
        top = 0
        bottom = m - 1
        right = n - 1
        left = 0
        res = []
        while top <= bottom and left <= right:
            for i in range(left, right + 1): #right + 1 so its included
                res.append(matrix[top][i])
            top += 1

            for i in range(top, bottom + 1):
                res.append(matrix[i][right])
            right -= 1

            if top <= bottom: #we have to update the pointers, so that nothing is left nor repeated
                for i in range(right, left - 1, -1): #you dont want to repeat left row again, so left - 1
                    res.append(matrix[bottom][i])
                bottom -= 1

            if left <= right:
                for i in range(bottom, top - 1, -1):
                    res.append(matrix[i][left])
                left += 1
        return res


        