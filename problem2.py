"""
time: O(n^2)
space: O(n)
Leet: Accepted
Problems: Can't think of an optimized solution. This one seems brute.
"""

class Solution(object):
    def findDiagonalOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        diags = {} #keep track of each diagonal
        maxdiag = -1
        res = []
        for row in range(len(matrix)):
            for column in range(len(matrix[0])):
                #append to respective diagonal
                if row+column in diags:
                    diags[row+column].append(matrix[row][column])
                else:
                    diags[row+column] = [matrix[row][column]]
                maxdiag = max(maxdiag,row+column)
        for d in range(maxdiag+1):
            #traverse reversed for alernate diags
            if d%2==0:
                rev = diags[d]
                rev.reverse()
                res.extend(rev)
            else:
                res.extend(diags[d])

        return res
