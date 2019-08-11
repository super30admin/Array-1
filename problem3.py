"""
time: O(n^2)
space: O(n)
leet: Accepted
problems: Not an elegant solution due to reliance on Exception
"""

class Solution(object):
    def spiralOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        res = []

        def topPop(matrix):
            top = matrix.pop(0)
            res.extend(top)

        def lowPop(matrix):
            low = matrix.pop(-1)
            low.reverse()
            res.extend(low)

        def rightPop(matrix):
            right=[]
            for row in range(len(matrix)):
                num = matrix[row].pop(-1)
                right.append(num)
            res.extend(right)

        def leftPop(matrix):
            left = []
            for row in range(len(matrix)):
                num = matrix[row].pop(0)
                left.append(num)
            left.reverse()
            res.extend(left)

        while(True):
            try:
                topPop(matrix)
                rightPop(matrix)
                lowPop(matrix)
                leftPop(matrix)
            except IndexError:
                return res
