 ##Time Complexity : O(m*n)
##Space Complexity :O(1)
##Did this code successfully run on Leetcode : Yes

class Solution(object):
    def spiralOrder(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        result = []
        l, r = 0, len(matrix[0])
        t, b = 0, len(matrix)
        while l < r and t < b:
            for i in range(l, r):
                result.append(matrix[t][i])
            t +=1
            for i in range(t, b):
                result.append(matrix[i][r-1])
            r -= 1
            if not (l<r and t<b):
                break
            for i in range(r-1, l-1, -1):
                result.append(matrix[b-1][i])
            b -= 1
            for i in range(b-1, t-1, -1):
                result.append(matrix[i][l])
            l +=1
        return result